/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Thusitha
 */
public class PutDataToDBFromTable {
    JDBC db =  new JDBC();
    public void putTableIntoDB(JTable tb1, String tb2){
        if(tb1.getColumnCount()==2){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==3){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==4){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==5){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==6){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+","+tb1.getColumnName(5)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"','"+tb1.getValueAt(x, 5)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==7){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+","+tb1.getColumnName(5)+","+tb1.getColumnName(6)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"','"+tb1.getValueAt(x, 5)+"','"+tb1.getValueAt(x, 6)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==8){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+","+tb1.getColumnName(5)+","+tb1.getColumnName(6)+","+tb1.getColumnName(7)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"','"+tb1.getValueAt(x, 5)+"','"+tb1.getValueAt(x, 6)+"','"+tb1.getValueAt(x, 7)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==9){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+","+tb1.getColumnName(5)+","+tb1.getColumnName(6)+","+tb1.getColumnName(7)+","+tb1.getColumnName(8)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"','"+tb1.getValueAt(x, 5)+"','"+tb1.getValueAt(x, 6)+"','"+tb1.getValueAt(x, 7)+"','"+tb1.getValueAt(x, 8)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }else if(tb1.getColumnCount()==10){
            for(int x = 0;x<=tb1.getRowCount();x++){
                try {
                    db.putData("INSERT INTO "+tb2+" ("+tb1.getColumnName(0)+","+tb1.getColumnName(1)+","+tb1.getColumnName(2)+","+tb1.getColumnName(3)+","+tb1.getColumnName(4)+","+tb1.getColumnName(5)+","+tb1.getColumnName(6)+","+tb1.getColumnName(7)+","+tb1.getColumnName(8)+","+tb1.getColumnName(9)+") VALUES ('"+tb1.getValueAt(x, 0)+"','"+tb1.getValueAt(x, 1)+"','"+tb1.getValueAt(x, 2)+"','"+tb1.getValueAt(x, 3)+"','"+tb1.getValueAt(x, 4)+"','"+tb1.getValueAt(x, 5)+"','"+tb1.getValueAt(x, 6)+"','"+tb1.getValueAt(x, 7)+"','"+tb1.getValueAt(x, 8)+"','"+tb1.getValueAt(x, 9)+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
