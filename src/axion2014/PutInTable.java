/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PutInTable {
    public void putInTable2(JTable tb1,String s1,String s2)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        dtm1.addRow(v1);
    }
    public void putInTable3(JTable tb1,String s1,String s2, String s3)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        dtm1.addRow(v1);
    }
    public void putInTable4(JTable tb1,String s1,String s2, String s3, String s4)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        dtm1.addRow(v1);
    }
    public void putInTable5(JTable tb1,String s1,String s2, String s3, String s4, String s5)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        dtm1.addRow(v1);
    }
    public void putInTable6(JTable tb1,String s1,String s2, String s3, String s4, String s5, String s6)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        v1.add(s6);
        dtm1.addRow(v1);
    }
    public void putInTable7(JTable tb1,String s1,String s2, String s3, String s4, String s5, String s6, String s7)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        v1.add(s6);
        v1.add(s7);
        dtm1.addRow(v1);
    }
    public void putInTable8(JTable tb1,String s1,String s2, String s3, String s4, String s5, String s6, String s7, String s8)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        v1.add(s6);
        v1.add(s7);
        v1.add(s8);
        dtm1.addRow(v1);
    }
    public void putInTable9(JTable tb1,String s1,String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        v1.add(s6);
        v1.add(s7);
        v1.add(s8);
        v1.add(s9);
        dtm1.addRow(v1);
    }
    public void putInTable10(JTable tb1,String s1,String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10)throws Exception{
        DefaultTableModel dtm1 = (DefaultTableModel) tb1.getModel();
        Vector v1 = new Vector();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        v1.add(s4);
        v1.add(s5);
        v1.add(s6);
        v1.add(s7);
        v1.add(s8);
        v1.add(s9);
        v1.add(s10);
        dtm1.addRow(v1);
    }
    public void removeFromTable(JTable tb1){
    DefaultTableModel tm1 = (DefaultTableModel) tb1.getModel();
        if(tm1.getRowCount()>0){
            tm1.removeRow(tm1.getRowCount()-1);
        }
    }
    public void removeAllFromTable(JTable tb1){
    DefaultTableModel tm1 = (DefaultTableModel) tb1.getModel();
        if(tm1.getRowCount()>0){
            for(;tm1.getRowCount()>0;){
                tm1.removeRow(tm1.getRowCount()-1); 
            }
        }
    }
}

