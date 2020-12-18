/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Thusitha
 */
public class DBTableToTable {
    JDBC db =  new JDBC();
    Date date = new Date();
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public void tableToTable(String BILLID){
        try {
            ResultSet rs1 = db.getData("SELECT * FROM INS_PULIST");
            while(rs1.next()){
                db.putData("INSERT INTO STOCKS (BILLID,PID,NAME,UNITS,EXP,BUY_PRICE,SDATE,STIME,DATE,SUB_TOTAL) VALUES ('"+BILLID+"','"+rs1.getString("PID")+"','"+rs1.getString("NAME")+"','"+rs1.getString("UNITS")+"','"+rs1.getString("EXP")+"','"+rs1.getString("BUY_PRICE")+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+(Double.parseDouble(rs1.getString("UNITS"))*Double.parseDouble(rs1.getString("BUY_PRICE")))+"')");
            
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public void tableToTableSELL(String BILLID){
        try {
            ResultSet rs1 = db.getData("SELECT * FROM INS_PLIST");
            while(rs1.next()){
                db.putData("INSERT INTO SELL (BILLID,PID,NAME,UNITS,EXP,UNIT_PRICE,SDATE,STIME,DATE,SUB_TOTAL) VALUES ('"+BILLID+"','"+rs1.getString("PID")+"','"+rs1.getString("NAME")+"','"+rs1.getString("UNITS")+"','"+rs1.getString("EXP")+"','"+rs1.getString("UNIT_PRICE")+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+(Double.parseDouble(rs1.getString("UNITS"))*Double.parseDouble(rs1.getString("UNIT_PRICE")))+"')");
            
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
    
    public BufferedImage scale(BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
    BufferedImage dbi = null;
    if(sbi != null) {
        dbi = new BufferedImage(dWidth, dHeight, imageType);
        Graphics2D g = dbi.createGraphics();
        AffineTransform at = AffineTransform.getScaleInstance(fWidth, fHeight);
        g.drawRenderedImage(sbi, at);
    }
    return dbi;
}
    
    
    
}
