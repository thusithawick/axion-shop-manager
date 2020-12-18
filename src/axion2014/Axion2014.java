/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Axion2014 {
    public static void main(String[] args) {
        try {
            JDBC db = new JDBC();
            ResultSet rs1 = db.getData("SELECT * FROM THEMES WHERE ID = '0'");
            while(rs1.next()){
                if(rs1.getInt("THEME")==0){
                    new Login().setVisible(true);
                    
                }else if(rs1.getInt("THEME")==1){
                    new Login1().setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        new Login().setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
}
