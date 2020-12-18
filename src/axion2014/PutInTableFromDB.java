/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thusitha
 */
public class PutInTableFromDB {
    JDBC db1 = new JDBC();
    PutInTable pit1 = new PutInTable();
    public void putTableFromDB(JTable tb1, String query){
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        if(tb1.getColumnCount()==2){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    pit1.putInTable2(tb1, s1, s2);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==3){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    pit1.putInTable3(tb1, s1, s2, s3);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==4){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    pit1.putInTable4(tb1, s1, s2, s3, s4);
                }
            } catch (Exception ex) {
                System.out.println("error1 "+ex);
            }
        }else if(tb1.getColumnCount()==5){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    pit1.putInTable5(tb1, s1, s2, s3, s4, s5);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==6){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    String s6 = rs1.getString(""+tb1.getColumnName(5)+"");
                    pit1.putInTable6(tb1, s1, s2, s3, s4, s5, s6);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==7){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    String s6 = rs1.getString(""+tb1.getColumnName(5)+"");
                    String s7 = rs1.getString(""+tb1.getColumnName(6)+"");
                    pit1.putInTable7(tb1, s1, s2, s3, s4, s5, s6, s7);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==8){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    String s6 = rs1.getString(""+tb1.getColumnName(5)+"");
                    String s7 = rs1.getString(""+tb1.getColumnName(6)+"");
                    String s8 = rs1.getString(""+tb1.getColumnName(7)+"");
                    pit1.putInTable8(tb1, s1, s2, s3, s4, s5, s6, s7, s8);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==9){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    String s6 = rs1.getString(""+tb1.getColumnName(5)+"");
                    String s7 = rs1.getString(""+tb1.getColumnName(6)+"");
                    String s8 = rs1.getString(""+tb1.getColumnName(7)+"");
                    String s9 = rs1.getString(""+tb1.getColumnName(8)+"");
                    pit1.putInTable9(tb1, s1, s2, s3, s4, s5, s6, s7, s8, s9);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(tb1.getColumnCount()==10){
            try {
                ResultSet rs1 = db1.getData(query);
                while(rs1.next()){
                    String s1 = rs1.getString(""+tb1.getColumnName(0)+"");
                    String s2 = rs1.getString(""+tb1.getColumnName(1)+"");
                    String s3 = rs1.getString(""+tb1.getColumnName(2)+"");
                    String s4 = rs1.getString(""+tb1.getColumnName(3)+"");
                    String s5 = rs1.getString(""+tb1.getColumnName(4)+"");
                    String s6 = rs1.getString(""+tb1.getColumnName(5)+"");
                    String s7 = rs1.getString(""+tb1.getColumnName(6)+"");
                    String s8 = rs1.getString(""+tb1.getColumnName(7)+"");
                    String s9 = rs1.getString(""+tb1.getColumnName(8)+"");
                    String s10 = rs1.getString(""+tb1.getColumnName(9)+"");
                    pit1.putInTable10(tb1, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
