/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axion2014;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JRViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
/**
 *
 * @author user
 */
public class DashBoard extends javax.swing.JFrame {

    int jp1width = 50;
    String sellGender;
    public static String USER;
    String PGENDER;
    String epg1;
    String epg2;

    JDBC db = new JDBC();
    Date date = new Date();
    PutInTable pit1 = new PutInTable();
    DBTableToTable ttot = new DBTableToTable();
    PutInTableFromDB pitf1 = new PutInTableFromDB();
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    public static int sw1 = 0;
    LineBorder boder1 = new LineBorder(Color.black, 1, true);
    LineBorder boder2 = new LineBorder(Color.LIGHT_GRAY, 1, true);
    LineBorder boder3 = new LineBorder(Color.gray, 1, true);
    Email email1 = new Email();
    String[] emladd;
    public static String ico1 = "d://camImg.JPG";
    int dec = 0;
    int x3 = 214;

    /*public void RefrshP(){
     try {
     ResultSet rs = db.getData("SELECT * FROM IMAGES WHERE ID = 0");
     while(rs.next()){
     jLabel142.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("IMAGE")))));
     ico1=rs.getString("IMAGE");
     }
     } catch (Exception e) {
     System.out.println(e);
     }
     }*/
    public void logger(String ss1){
        //jLabel154.setVisible(true);
        timer.start();
        //jLabel154.setText(jLabel155.getText());
        Date ddd = new Date();
        try{
        db.putData("INSERT INTO AXLOG (PROCESS,USER,SDATE) VALUES ('"+ss1+"','"+USER+"','"+sdf3.format(ddd)+"')");
        jLabel155.setText(ss1);
        }catch(Exception ew){
            
        }
    }
    
    int x = 0;
    Timer timer = new Timer(5000, new ActionListener() {
    @Override
                public void actionPerformed(ActionEvent e) {
                    //jLabel154.setVisible(false);
                jLabel155.setText("");
                    timer.stop();
                }
    });
    public void exitdb() {
        dispose();
    }

    public void update() {
        try {
            JDBC db = new JDBC();
            ResultSet rs3 = db.getData("SELECT BILLID FROM BILL ORDER BY BILLID DESC LIMIT 1");
            while (rs3.next()) {
                jLabel12.setText(String.valueOf(rs3.getInt("BILLID") + 1));
                jLabel19.setText(String.valueOf(rs3.getInt("BILLID") + 1));
                jLabel108.setText(String.valueOf(rs3.getInt("BILLID") + 1));
                jLabel80.setText(String.valueOf(rs3.getInt("BILLID") + 1));
            }
        } catch (Exception e) {
            System.out.println("e");
        }
    }

    public static void removeSelected() {
        jTabbedPane10.remove(jTabbedPane10.getSelectedIndex());

    }

    public void colorchooser() {
        jColorChooser1.getColor();
    }

    public void colorChooser(Color a, Color b, Color c, Color d, Color ec, Color f) {

        jToolBar1.setBackground(a);
        jPanel1.setBackground(a);
        jToolBar2.setBackground(a);

        //menupa
        jTabbedPane1.setBackground(b);
        jPanel4.setBackground(b);
        jPanel5.setBackground(b);
                //toolpal

                //Calculator.jPanel2.setBackground(c);
        //PPList.jPanel2.setBackground(c);
        //PRList.jPanel2.setBackground(c);
        try {

            Calculator.jPanel2.setBackground(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            PPList.jPanel2.setBackground(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            PRList.jPanel2.setBackground(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            home.jPanel2.setBackground(c);
        } catch (Exception e) {
            System.out.println(e);
        }
                //innertabs

        jTabbedPane2.setBackground(d);
        jTabbedPane3.setBackground(d);
        jTabbedPane4.setBackground(d);
        jTabbedPane5.setBackground(d);
        jTabbedPane6.setBackground(d);
        jTabbedPane7.setBackground(d);
        jTabbedPane8.setBackground(d);
        jTabbedPane9.setBackground(d);
        jTabbedPane10.setBackground(d);
        jTabbedPane11.setBackground(d);
        jTabbedPane12.setBackground(d);
        StoreReports.jTabbedPane1.setBackground(ec);                
        jTabbedPane12.setBackground(d);
        jPanel21.setBackground(b);

                //jDesktopPane1.setBackground(d);
        //pane
        jPanel12.setBackground(ec);
        jPanel13.setBackground(ec);
        jPanel14.setBackground(ec);
        jPanel15.setBackground(ec);
        jPanel16.setBackground(ec);
        jPanel17.setBackground(ec);
        jPanel18.setBackground(ec);
        jPanel19.setBackground(ec);
        jPanel20.setBackground(ec);
        jPanel22.setBackground(ec);
        jPanel23.setBackground(ec);
        jPanel25.setBackground(ec);
        jPanel26.setBackground(ec);
        jPanel27.setBackground(ec);
        jPanel28.setBackground(ec);
        jPanel29.setBackground(ec);
        jPanel30.setBackground(ec);
        jPanel31.setBackground(ec);
        jPanel32.setBackground(ec);
        jPanel33.setBackground(ec);
        jPanel34.setBackground(ec);
        jPanel35.setBackground(ec);
        jPanel36.setBackground(ec);
        jPanel37.setBackground(ec);
        jPanel38.setBackground(ec);
        jPanel39.setBackground(ec);
        jPanel40.setBackground(ec);
        jPanel41.setBackground(ec);
        jPanel42.setBackground(ec);
        jPanel43.setBackground(ec);
        jPanel44.setBackground(ec);
        jPanel45.setBackground(ec);
        jPanel46.setBackground(ec);
        jPanel47.setBackground(ec);
        jPanel48.setBackground(ec);
        jPanel49.setBackground(ec);
        jPanel50.setBackground(ec);
        jPanel51.setBackground(ec);
        jPanel52.setBackground(ec);
        jPanel53.setBackground(ec);
        jPanel54.setBackground(ec);
        jPanel55.setBackground(ec);
        jPanel56.setBackground(ec);
        jPanel57.setBackground(ec);
        jPanel58.setBackground(ec);
        sell.setBackground(ec);
        purchase.setBackground(ec);
        store.setBackground(ec);
        accounts.setBackground(ec);
        people.setBackground(ec);
        settings.setBackground(ec);
        easypay.setBackground(ec);
        jPanel60.setBackground(ec);
        jPanel61.setBackground(ec);
        jPanel62.setBackground(ec);
        jPanel63.setBackground(ec);
        jPanel64.setBackground(ec);
        jPanel65.setBackground(ec);
        jPanel66.setBackground(ec);
        jPanel67.setBackground(ec);
        jPanel70.setBackground(ec);
        jPanel71.setBackground(ec);
        jPanel73.setBackground(ec);
        jPanel74.setBackground(ec);
        jPanel75.setBackground(ec);
        jPanel76.setBackground(ec);
        jPanel77.setBackground(ec);
        jPanel78.setBackground(ec);
        jPanel79.setBackground(ec);
        jPanel80.setBackground(ec);
        jPanel81.setBackground(ec);
        jPanel82.setBackground(ec);
        jPanel83.setBackground(ec);
        jPanel84.setBackground(ec);
        jPanel85.setBackground(ec);
        jPanel86.setBackground(ec);
        jPanel87.setBackground(ec);
        jPanel88.setBackground(ec);
        jPanel89.setBackground(ec);
        jPanel90.setBackground(ec);
        jPanel91.setBackground(ec);
        StoreReports.jPanel2.setBackground(ec);
        StoreReports.jPanel3.setBackground(ec);
        StoreReports.jPanel5.setBackground(ec);
        StoreReports.jPanel1.setBackground(ec);

                //tables
        jTable1.setBackground(f);
        jTable2.setBackground(f);
        jTable3.setBackground(f);
        jTable4.setBackground(f);
        jTable5.setBackground(f);
        jTable6.setBackground(f);
        jTable7.setBackground(f);
        jTable8.setBackground(f);
        jTable10.setBackground(f);
        jTable11.setBackground(f);
        jTable12.setBackground(f);
        jTable13.setBackground(f);
        jTable14.setBackground(f);
        jTable15.setBackground(f);
        jTable16.setBackground(f);
        jTable17.setBackground(f);
        jTable18.setBackground(f);
    }

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        //load storereport
        StoreReports str = new StoreReports();
        str.loadreports();
        jTabbedPane1.add("Reports", str.jPanel1);
        jLabel68.setText(USER);
        //jTabbedPane1.removeAll();
        
        Logs logs = new Logs();
        jTabbedPane7.add("Log",logs.jPanel2);
        
        

        pit1.removeAllFromTable(jTable5);
        pitf1.putTableFromDB(jTable5, "SELECT * FROM PRODUCTS");
        //store

        home hom = new home();
        jTabbedPane10.add("Start", hom.jPanel2);

        pit1.removeAllFromTable(jTable6);
        pitf1.putTableFromDB(jTable6, "SELECT * FROM BILL WHERE DATE LIKE '" + sdf1.format(date) + "'");
        pit1.removeAllFromTable(jTable7);
        pitf1.putTableFromDB(jTable7, "SELECT * FROM TRANSACTIONS WHERE DATE LIKE '" + sdf1.format(date) + "'");
        //accounts

        try {
            pitf1.putTableFromDB(jTable11, "SELECT DISTINCT * FROM CUSTOMER,SUPPLIER,EMPLOYEE,BONDS,OTHER");
        } catch (Exception ex) {
            System.out.println(ex);
        }//peaple

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    
        
        ImageIcon icon3 = new ImageIcon("images/golden.jpg");

        //jLabel154.setIcon (icon3);

    
        try {
            ResultSet rs = db.getData("SELECT * FROM COLORS WHERE ID = '1'");
        while (rs.next()) {
            Color a = new Color(rs.getInt("A"));
            System.out.println("a");
            Color b = new Color(rs.getInt("B"));
            System.out.println("b");
            Color c = new Color(rs.getInt("C"));
            System.out.println("c");
            Color d = new Color(rs.getInt("D"));
            System.out.println("d");
            Color ecab = new Color(rs.getInt("E"));
            System.out.println("e");
            Color f = new Color(rs.getInt("F"));
            System.out.println("f");
            colorChooser(a, b, c, d, ecab, f);
            System.out.println("ok");
        }
    }
    catch (Exception e2

    
        ) {
            System.out.println(e2);
    }

    System.out.println (USER);

    
        try {
            BufferedImage image;
        image = ImageIO.read(new File(ico1));
        jLabel142.setIcon(new ImageIcon(image));
        jLabel151.setIcon(new ImageIcon(image));
    }
    catch (Exception e

    
        ) {
            System.out.println(e);
    }

    
        try {
            ResultSet rs = db.getData("SELECT * FROM BILLSETTINGS WHERE ID = 0");
        while (rs.next()) {
            jTextField66.setText(rs.getString("NAME"));
            jTextField67.setText(rs.getString("ADDS"));
            jTextField68.setText(rs.getString("CON"));
            jTextField69.setText(rs.getString("EML"));
            jTextField70.setText(rs.getString("WEB"));
            jTextField71.setText(rs.getString("MAS"));
        }
    }
    catch (Exception e

    
        ) {
            System.out.println(e);
    }

    
        try {
            ResultSet rs = db.getData("SELECT * FROM BILLSETTINGS WHERE ID = 1");
        while (rs.next()) {
            jTextField73.setText(rs.getString("NAME"));
            jTextField75.setText(rs.getString("ADDS"));
            jTextField76.setText(rs.getString("CON"));
            jTextField74.setText(rs.getString("EML"));
            jTextField72.setText(rs.getString("WEB"));
            jTextField77.setText(rs.getString("MAS"));
        }
    }
    catch (Exception e

    
        ) {
            System.out.println(e);
    }

    
        try {
            db.putData("DELETE FROM ins_plist");
        db.putData("DELETE FROM ins_pulist");
    }
    catch (Exception e

    
        ) {
            System.out.println(e);
    }
        
        logger(USER+" logged in");

}
public void RefreshAll(){          
        pit1.removeAllFromTable(jTable2);
        pitf1.putTableFromDB(jTable2,"SELECT * FROM BILL WHERE DATE = '"+sdf1.format(date)+"'");  
        pit1.removeAllFromTable(jTable4);
        pitf1.putTableFromDB(jTable4,"SELECT * FROM BILL WHERE DATE = '"+sdf1.format(date)+"'");
        pit1.removeAllFromTable(jTable5);
        pitf1.putTableFromDB(jTable5, "SELECT * FROM PRODUCTS");         
        pit1.removeAllFromTable(jTable9);
        pitf1.putTableFromDB(jTable9,"SELECT * FROM BILL WHERE TYPE = 'PURCHASE' AND DATE = '"+sdf1.format(date)+"'");
        pit1.removeAllFromTable(jTable6);
        pitf1.putTableFromDB(jTable6,"SELECT * FROM BILL WHERE DATE = '"+sdf1.format(date)+"'");
        pit1.removeAllFromTable(jTable7);
        pitf1.putTableFromDB(jTable7,"SELECT * FROM TRANSACTIONS WHERE DATE = '"+sdf1.format(date)+"'");
        pit1.removeAllFromTable(jTable11);
        if(jComboBox3.getSelectedIndex()==0){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT DISTINCT * FROM CUSTOMER,SUPPLIER,EMPLOYEE,BONDS,OTHER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==1){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM CUSTOMER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==2){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM SUPPLIER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==3){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM EMPLOYEE");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==4){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM BONDS");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==5){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM OTHER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        pit1.removeAllFromTable(jTable12);
        pitf1.putTableFromDB(jTable12, "SELECT * FROM BILL");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel70 = new javax.swing.JLabel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jScrollPane33 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel111 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel122 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        sell = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton63 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jTextField70 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jTextField66 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jButton61 = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        jTextField71 = new javax.swing.JTextField();
        jPanel90 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel142 = new javax.swing.JLabel();
        jButton60 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jPanel91 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        purchase = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jTextField72 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jPanel93 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel151 = new javax.swing.JLabel();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jPanel94 = new javax.swing.JPanel();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        store = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox();
        jButton10 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField23 = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        accounts = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jTextField21 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        people = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField31 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField32 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jTextField33 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jButton22 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel28 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox();
        jButton33 = new javax.swing.JButton();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel59 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTable18 = new javax.swing.JTable();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jTextField63 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        jColorChooser2 = new javax.swing.JColorChooser();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        jColorChooser3 = new javax.swing.JColorChooser();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jColorChooser4 = new javax.swing.JColorChooser();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        jColorChooser5 = new javax.swing.JColorChooser();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jPanel58 = new javax.swing.JPanel();
        jColorChooser6 = new javax.swing.JColorChooser();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jTextField61 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel107 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        easypay = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel44 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jTextField44 = new javax.swing.JTextField();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jTextField45 = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jPanel46 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jTextField50 = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jTextField51 = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jPanel43 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel48 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jButton38 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jTextField57 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel133 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jTextField65 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel70.setText("jLabel70");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Axion Shop Manager 1.3");
        setUndecorated(true);

        jLabel67.setText("USER :");

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jToolBar1.setFloatable(false);

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sell1.png"))); // NOI18N
        jLabel111.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel111MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel111MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel111MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel111MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel111);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buy.png"))); // NOI18N
        jLabel110.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel110MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel110MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel110MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel110MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel110);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store1.png"))); // NOI18N
        jLabel109.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel109MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel109MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel109MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel109MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel109MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel109);

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vbv.png"))); // NOI18N
        jLabel123.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel123MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel123MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel123);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock1.png"))); // NOI18N
        jLabel116.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel116MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel116MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel116MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel116MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel116MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel116);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accounts_1.png"))); // NOI18N
        jLabel112.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel112MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel112MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel112MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel112MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel112MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel112);

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Transaction.png"))); // NOI18N
        jLabel124.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel124MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel124MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel124);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people1.png"))); // NOI18N
        jLabel113.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel113MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel113MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel113MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel113MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel113MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel113);

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WritePage-512.png"))); // NOI18N
        jLabel125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel125MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel125MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel125);

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Attendence.png"))); // NOI18N
        jLabel126.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel126MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel126MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel126);

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings1.png"))); // NOI18N
        jLabel115.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel115MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel115MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel115MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel115MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel115MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel115);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/epa1.png"))); // NOI18N
        jLabel114.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel114MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel114MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel114MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel114MouseReleased(evt);
            }
        });
        jToolBar1.add(jLabel114);

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transactions1.png"))); // NOI18N
        jLabel127.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel127MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel127MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel127);

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contacts.png"))); // NOI18N
        jLabel128.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel128MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel128MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel128);

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New Mail.png"))); // NOI18N
        jLabel129.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel129MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel129MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel129);

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail Box.png"))); // NOI18N
        jLabel130.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel130MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel130MouseExited(evt);
            }
        });
        jToolBar1.add(jLabel130);

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reports.png"))); // NOI18N
        jToolBar1.add(jLabel152);

        jToolBar2.setFloatable(false);

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Note.png"))); // NOI18N
        jLabel122.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel122MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel122MouseExited(evt);
            }
        });
        jToolBar2.add(jLabel122);

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Product list.png"))); // NOI18N
        jLabel120.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel120MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel120MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel120MouseExited(evt);
            }
        });
        jToolBar2.add(jLabel120);

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cal.png"))); // NOI18N
        jLabel117.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel117MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel117MouseEntered(evt);
            }
        });
        jToolBar2.add(jLabel117);

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people list.png"))); // NOI18N
        jLabel121.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel121MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel121MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel121MouseExited(evt);
            }
        });
        jToolBar2.add(jLabel121);

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_check-512.png"))); // NOI18N
        jLabel153.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel153MouseClicked(evt);
            }
        });
        jToolBar2.add(jLabel153);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel131.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel131MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel131)
                .addGap(5, 5, 5)
                .addComponent(jLabel67)
                .addGap(5, 5, 5)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "EXP", "UNITS", "UNIT_PRICE", "DISCOUNT", "SUB_TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("EXP");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("UNITS");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("UNIT_PRICE");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("DISCOUNT");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("SUB_TOTAL");
        }

        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Payments"));

        jLabel5.setText("METHOD :");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DERECT" }));

        jLabel10.setText("DETAILS :");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, 245, Short.MAX_VALUE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setText("TOTAL :");

        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer"));

        jCheckBox1.setText("Insert Customer Info");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("NIC :");
        jLabel4.setEnabled(false);

        jCheckBox2.setText("New Customer");
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("NAME :");
        jLabel6.setEnabled(false);

        jLabel7.setText("CONTACT :");
        jLabel7.setEnabled(false);

        jTextField4.setEnabled(false);

        jTextField6.setEnabled(false);

        jTextField7.setEnabled(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MR");
        jRadioButton1.setEnabled(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MRS");
        jRadioButton2.setEnabled(false);

        jLabel8.setText("EMAIL :");
        jLabel8.setEnabled(false);

        jTextField8.setEnabled(false);

        jLabel9.setText("ADDRESS :");
        jLabel9.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel38Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8))))
                        .addContainerGap())))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(8, 8, 8)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel11.setText("BILL ID :");

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product"));

        jLabel1.setText("PID :");

        jLabel2.setText("UNITS :");

        jLabel3.setText("DISCOUNT :");

        jTextField3.setText("0");

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REMOVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton63.setText("PRINT & SAVE");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton63)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("New Bill", jPanel12);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "UNITS", "EXP", "UNIT_PRICE", "SUB_TOTAL"
            }
        ));
        jScrollPane14.setViewportView(jTable10);

        jLabel14.setText("TO :");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILLID", "INCOME", "WAGES", "NIC", "USER", "METHOD", "SDATE", "STIME", "DETAILS"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel13.setText("FROM :");

        jButton4.setText("BUILD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane14))
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Bills", jPanel13);

        jPanel89.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Basic Info"));

        jLabel136.setText("ADDRESS :");

        jLabel141.setText("WEB SITE :");

        jLabel139.setText("CONTACTS :");

        jLabel140.setText("EMAILS :");

        jLabel138.setText("IMAGE LOCATION");

        jLabel137.setText("COMPANY NAME :");

        jButton61.setText("SELECT");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jLabel143.setText("MASSAGE :");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel137)
                    .addComponent(jLabel138)
                    .addComponent(jLabel136)
                    .addComponent(jLabel139)
                    .addComponent(jLabel140)
                    .addComponent(jLabel141)
                    .addComponent(jLabel143))
                .addGap(18, 18, 18)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField66)
                    .addComponent(jTextField67)
                    .addComponent(jTextField68)
                    .addComponent(jTextField69)
                    .addComponent(jTextField70)
                    .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jTextField71))
                .addContainerGap())
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel137)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(jButton61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox6.setText("WARRANTY");

        jCheckBox7.setText("USER");

        jCheckBox8.setText("PRODUCT NAME");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jCheckBox6)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox8)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel142.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton60.setText("SAVE SETTINGS");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton62.setText("PREVIEW");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jPanel91.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preview"));
        jPanel91.setMinimumSize(new java.awt.Dimension(327, 0));

        jTabbedPane13.setMaximumSize(new java.awt.Dimension(450, 32767));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton62))
                    .addComponent(jPanel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addComponent(jPanel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton60)
                            .addComponent(jButton62))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Bill Settings", jPanel14);

        javax.swing.GroupLayout sellLayout = new javax.swing.GroupLayout(sell);
        sell.setLayout(sellLayout);
        sellLayout.setHorizontalGroup(
            sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        sellLayout.setVerticalGroup(
            sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Sell", sell);

        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer"));

        jLabel23.setText("NIC :");
        jLabel23.setEnabled(false);

        jCheckBox4.setText("Supplier");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel24.setText("NAME :");
        jLabel24.setEnabled(false);

        jLabel25.setText("CONTACT :");
        jLabel25.setEnabled(false);

        jTextField12.setEnabled(false);

        jTextField13.setEnabled(false);

        jTextField14.setEnabled(false);

        jLabel27.setText("ADDRESS :");
        jLabel27.setEnabled(false);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jScrollPane5.setViewportView(jTextArea2);

        jCheckBox5.setText("New Supplier");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel32.setText("EMAILS");
        jLabel32.setEnabled(false);

        jTextField19.setEnabled(false);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel32)
                            .addComponent(jLabel24))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(71, 71, 71)
                        .addComponent(jTextField12)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "EXP", "UNITS", "BUY_PRICE", "UNIT_PRICE", "SUB_TOTAL"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jButton8.setText("SAVE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel30.setText("TOTAL :");

        jLabel18.setText("BILL ID :");

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product"));

        jLabel20.setText("PID :");

        jLabel21.setText("UNITS :");

        jLabel22.setText("BUY_PRICE");

        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("REMOVE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("New Product");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel26.setText("NAME :");
        jLabel26.setEnabled(false);

        jLabel28.setText("UNIT_PRICE :");
        jLabel28.setEnabled(false);

        jLabel29.setText("DISCOUNT :");
        jLabel29.setEnabled(false);

        jLabel31.setText("EXP :");
        jLabel31.setEnabled(false);

        jTextField15.setEnabled(false);

        jTextField16.setEnabled(false);

        jTextField17.setEnabled(false);

        jDateChooser3.setEnabled(false);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField11)
                            .addComponent(jTextField9)))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16)
                            .addComponent(jTextField17)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("New Bill", jPanel15);

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILLID", "INCOME", "WAGES", "NIC", "USER", "METHOD", "SDATE", "STIME", "DETAILS"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        jDateChooser4.setDateFormatString("yyyy-MM-dd");

        jDateChooser5.setDateFormatString("yyyy-MM-dd");

        jLabel34.setText("TO :");

        jButton9.setText("BUILD");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel33.setText("FROM :");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Bills", jPanel16);

        jPanel92.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Basic Info"));

        jTextField72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField72ActionPerformed(evt);
            }
        });

        jLabel144.setText("ADDRESS :");

        jLabel145.setText("WEB SITE :");

        jLabel146.setText("CONTACTS :");

        jLabel147.setText("EMAILS :");

        jLabel148.setText("IMAGE LOCATION");

        jLabel149.setText("COMPANY NAME :");

        jButton64.setText("SELECT");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jLabel150.setText("MASSAGE :");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149)
                    .addComponent(jLabel148)
                    .addComponent(jLabel144)
                    .addComponent(jLabel146)
                    .addComponent(jLabel147)
                    .addComponent(jLabel145)
                    .addComponent(jLabel150))
                .addGap(18, 18, 18)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField73)
                    .addComponent(jTextField75)
                    .addComponent(jTextField76)
                    .addComponent(jTextField74)
                    .addComponent(jTextField72)
                    .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jTextField77))
                .addContainerGap())
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel149)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel148)
                    .addComponent(jButton64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel93.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox9.setText("WARRANTY");

        jCheckBox10.setText("USER");

        jCheckBox11.setText("PRODUCT NAME");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jCheckBox9)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox11)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox10)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel151.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton65.setText("SAVE SETTINGS");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setText("PREVIEW");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jPanel94.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preview"));
        jPanel94.setMinimumSize(new java.awt.Dimension(327, 0));

        jTabbedPane14.setMaximumSize(new java.awt.Dimension(450, 32767));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton66))
                    .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(jPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton65)
                            .addComponent(jButton66))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Bill Settings", jPanel17);

        javax.swing.GroupLayout purchaseLayout = new javax.swing.GroupLayout(purchase);
        purchase.setLayout(purchaseLayout);
        purchaseLayout.setHorizontalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        purchaseLayout.setVerticalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseLayout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Purchase", purchase);

        jComboBox5.setEditable(true);
        jComboBox5.setMaximumRowCount(4);
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton10.setText("BUILD");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "MANUFACTURE", "UNITS", "BUY_PRICE", "UNIT_PRICE", "EXP", "DESCRIPTION"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Products List", jPanel18);

        jButton19.setText("DELETE");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton17.setText("INSERT");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("UPDATE");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel47.setText("EXP :");

        jLabel46.setText("UNIT_PRICE :");

        jLabel51.setText("CATEGORY :");

        jLabel45.setText("NAME :");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField18.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel44.setText("PID :");

        jTextField23.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel51))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22)
                            .addComponent(jTextField27)
                            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField20))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel50.setText("DESCRIPTION :");

        jLabel49.setText("MANUFACTURE :");

        jTextField24.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabel48.setText("BUY_PRICE :");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane11.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton14.setText("DECREASE");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton13.setText("INCREASE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton15.setText("RESET");

        jLabel52.setText("UNITS :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addContainerGap())
        );

        jButton16.setText("SEARCH");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Manage Products", jPanel19);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "UNITS", "EXP", "BUY_PRICE", "SUB_TOTAL"
            }
        ));
        jScrollPane12.setViewportView(jTable8);

        jLabel54.setText("TO :");

        jButton20.setText("BUILD");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel53.setText("FROM :");

        jTable9.setAutoCreateRowSorter(true);
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILLID", "INCOME", "WAGES", "NIC", "USER", "METHOD", "SDATE", "STIME", "DETAILS"
            }
        ));
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable9);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Stocks", jPanel20);

        javax.swing.GroupLayout storeLayout = new javax.swing.GroupLayout(store);
        store.setLayout(storeLayout);
        storeLayout.setHorizontalGroup(
            storeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        storeLayout.setVerticalGroup(
            storeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storeLayout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Store", store);

        jTable7.setAutoCreateRowSorter(true);
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRANID", "INCOME", "WAGES", "USER", "SDATE", "STIME", "TRANSFER_FROM", "TRANSFER_TO", "DESCRIPTION"
            }
        ));
        jScrollPane9.setViewportView(jTable7);

        jDateChooser7.setDateFormatString("yyyy-MM-dd");

        jLabel36.setText("FROM :");

        jButton11.setText("BUILD");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jDateChooser6.setDateFormatString("yyyy-MM-dd");

        jLabel35.setText("TO :");

        jTable6.setAutoCreateRowSorter(true);
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILLID", "INCOME", "WAGES", "NIC", "USER", "METHOD", "SDATE", "STIME", "DETAILS", "TYPE"
            }
        ));
        jScrollPane8.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel70Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)))
                .addContainerGap())
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Transactions", jPanel22);

        jLabel41.setText("DESCRIPTION :");

        jLabel37.setText("TRANSACTION :");

        jLabel39.setText("FROM :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INCOME", "WAGES" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel38.setText("TO :");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane10.setViewportView(jTextArea3);

        jLabel40.setText("AMOUNT :");

        jLabel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel42.setText("TRANID :");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, 273, Short.MAX_VALUE)
                            .addComponent(jTextField21)
                            .addComponent(jTextField28)
                            .addComponent(jTextField29)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton12.setText("SAVE");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("New Transaction", jPanel23);

        javax.swing.GroupLayout accountsLayout = new javax.swing.GroupLayout(accounts);
        accounts.setLayout(accountsLayout);
        accountsLayout.setHorizontalGroup(
            accountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        accountsLayout.setVerticalGroup(
            accountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsLayout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Accounts", accounts);

        jLabel55.setText("CATEGORY :");

        jButton21.setText("BUILD");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "CUSTOMER", "SUPPLIER", "EMPLOYEE", "BONDS", "OTHER" }));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "GENDER", "NAME", "ADDRESS", "CONTACT", "EMAIL", "CAREER", "WORK_ADDRESS", "WORK_CONTACT"
            }
        ));
        jScrollPane15.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton21)))
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55))
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("People", jPanel25);

        jLabel56.setText("NIC :");

        jLabel57.setText("CATEGORY :");

        jLabel58.setText("FULL_NAME :");

        jLabel59.setText("CONTACT :");

        jLabel60.setText("HOME_ADDRESS :");

        jLabel61.setText("CAREER :");

        jLabel62.setText("WORK_ADDRESS :");

        jLabel63.setText("CONTACT :");

        jLabel64.setText("EMAIL :");

        jLabel65.setText("DESCRIPTION :");

        jLabel66.setText("GENDER :");

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CUSTOMER", "SUPPLIER", "EMPLOYEE", "BONDS", "OTHER" }));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("MR");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("MRS");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane16.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane17.setViewportView(jTextArea6);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane18.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel66)
                            .addComponent(jLabel59))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField32)
                            .addComponent(jTextField31)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField30)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane18))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane16))
                .addGap(65, 65, 65))
        );

        jButton22.setText("SAVE");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Manage People", jPanel26);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Attendance", jPanel27);

        javax.swing.GroupLayout peopleLayout = new javax.swing.GroupLayout(people);
        people.setLayout(peopleLayout);
        peopleLayout.setHorizontalGroup(
            peopleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        peopleLayout.setVerticalGroup(
            peopleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peopleLayout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("People", people);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nimbus Look And Feel", "Metal Look And Feel" }));

        jButton33.setText("Apply");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jTable18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME"
            }
        ));
        jScrollPane32.setViewportView(jTable18);

        jButton53.setText("REFRESH");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setText("APPLY");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("DELETE");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jLabel132.setText("NAME :");

        jButton56.setText("SAVE CURRENT COLORS");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setText("DEFAULT");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addComponent(jButton53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton55))
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addComponent(jLabel132)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField63)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton56)
                            .addComponent(jButton57))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton53)
                    .addComponent(jButton54)
                    .addComponent(jButton55)
                    .addComponent(jButton57))
                .addGap(42, 42, 42)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132)
                    .addComponent(jButton56))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Colors", jPanel59);

        jButton41.setText("Apply & Save");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("Restore Default");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jButton41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41)
                    .addComponent(jButton42))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Tool Bar", jPanel53);

        jButton43.setText("Apply & Save");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText("Restore Default");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jButton43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton43)
                    .addComponent(jButton44))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Menu Pallete", jPanel54);

        jButton45.setText("Apply & Save");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("Restore Default");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(jButton45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton46)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45)
                    .addComponent(jButton46))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Tool Palette", jPanel55);

        jButton47.setText("Apply & Save");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setText("Restore Default");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jButton47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton48)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(jColorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton47)
                    .addComponent(jButton48))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Outer Line", jPanel56);

        jButton49.setText("Apply & Save");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("Restore Default");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(jButton49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton50)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(jColorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton49)
                    .addComponent(jButton50))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Panels", jPanel57);

        jButton51.setText("Apply & Save");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setText("Restore Default");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addComponent(jButton51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton52)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addComponent(jColorChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton51)
                    .addComponent(jButton52))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Tables", jPanel58);

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane12)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton33)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Apearance", jPanel28);

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Peference", jPanel29);

        jLabel105.setText("USER NAME :");

        jLabel106.setText("PASSWORD :");

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Access into Sell Panel", null},
                {"Sell", null},
                {"View Sales Bills", null},
                {"Change Sales Bill Settings", null},
                {"Access into Purchase Panel", null},
                {"Purchase Products", null},
                {"View Purchase Bills", null},
                {"Change Purchase Bill Settings", null},
                {"Access into Store Panel", null},
                {"View Products", null},
                {"Manage Products", null},
                {"View Stocks", null},
                {"View Store Settings", null},
                {"Access into Account Panel", null},
                {"View People List", null},
                {"Manage People", null},
                {"Control Attendence", null},
                {"Access into Settings", null},
                {"Change Apearence", null},
                {"Change Preference", null},
                {"Change Users (Full Control)", null},
                {"Access into Easy Payment Methods", null},
                {"Get Installments", null},
                {"View Easy Payment Customer List", null},
                {"Manage Easy Payment Customers Info", null},
                {"Change Terms and Conditions", null},
                {"Access into Communication", null},
                {"View Contacats", null},
                {"Send Emails", null},
                {"View Massage Box", null},
                {"Change Massage Settings", null}
            },
            new String [] {
                "PRIVILADGE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane21.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(1).setMinWidth(80);
            jTable14.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable14.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        jButton29.setText("INSERT");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("UPDATE");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("DELETE");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel107.setText("EMPLOYEE ID :");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31)
                        .addGap(433, 433, 433))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel106))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1)
                                    .addComponent(jTextField61)
                                    .addComponent(jTextField62))))
                        .addContainerGap())))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(jButton30)
                    .addComponent(jButton31)))
        );

        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USER"
            }
        ));
        jTable15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable15MouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(jTable15);

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane22))
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane7.addTab("User Accounts", jPanel30);

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", settings);

        jTabbedPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane8MouseClicked(evt);
            }
        });

        jButton28.setText("SAVE");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel101.setText("BILLID :");

        jLabel102.setText("EPID :");

        jLabel103.setText("DUE :");

        jLabel104.setText("AMOUNT :");

        jButton27.setText("CALCULATE");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jTextField58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField58ActionPerformed(evt);
            }
        });

        jLabel108.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addGap(56, 56, 56))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(68, 68, 68)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField59, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel102)
                            .addComponent(jLabel104))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField58)
                            .addComponent(jTextField60, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel101)
                        .addComponent(jLabel102)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addGap(234, 234, 234))
        );

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addComponent(jButton28)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("New Instalment", jPanel32);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "P" }));

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EPID", "TOTAL_PAYABLE", "UNIT_PRICE", "TERM", "LASTDATE", "BASIC", "MONTHLY", "CUSTOMER_NIC", "CUSTOMER"
            }
        ));
        jScrollPane20.setViewportView(jTable13);

        jButton32.setText("BUILD");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton32)))
                .addContainerGap())
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("EP list", jPanel33);

        jLabel69.setText("EPID :");

        jLabel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton25.setText("FIND");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jTabbedPane9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane9MouseClicked(evt);
            }
        });

        jLabel71.setText("PID :");

        jLabel72.setText("UNIT_PRICE :");

        jLabel73.setText("MONTHS :");

        jLabel74.setText("INTEREST :");

        jLabel75.setText("BASIC :");

        jLabel76.setText("FINE :");

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jButton23.setText("CALCULATE");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel77.setText("MONTHLY :");

        jLabel78.setText("TOTAL_PAY :");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField54))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel76))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField36)
                                    .addComponent(jTextField38)
                                    .addComponent(jTextField39))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)
                            .addComponent(jLabel72)
                            .addComponent(jLabel78))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField56)
                            .addComponent(jTextField37)
                            .addComponent(jTextField40)
                            .addComponent(jTextField41))))
                .addContainerGap())
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel74)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel75)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel72)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("PLAN", jPanel44);

        jLabel81.setText("NIC :");

        jLabel83.setText("FULL_NAME :");

        jLabel84.setText("CONTACT :");

        jLabel85.setText("HOME_ADDRESS :");

        jLabel86.setText("CAREER :");

        jLabel87.setText("WORK_ADDRESS :");

        jLabel88.setText("CONTACT :");

        jLabel89.setText("EMAIL :");

        jLabel90.setText("DESCRIPTION :");

        jLabel91.setText("GENDER :");

        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setSelected(true);
        jRadioButton7.setText("MR");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("MRS");

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane23.setViewportView(jTextArea11);

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane24.setViewportView(jTextArea12);

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane25.setViewportView(jTextArea13);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83)
                            .addComponent(jLabel91)
                            .addComponent(jLabel84)
                            .addComponent(jLabel89))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField47)
                            .addComponent(jTextField44)
                            .addComponent(jTextField43)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField42)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel90))
                .addGap(17, 17, 17)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane25))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel83)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("CUSTOMER", jPanel45);

        jLabel82.setText("NIC :");

        jLabel92.setText("FULL_NAME :");

        jLabel93.setText("CONTACT :");

        jLabel94.setText("HOME_ADDRESS :");

        jLabel95.setText("CAREER :");

        jLabel96.setText("WORK_ADDRESS :");

        jLabel97.setText("CONTACT :");

        jLabel98.setText("EMAIL :");

        jLabel99.setText("DESCRIPTION :");

        jLabel100.setText("GENDER :");

        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setSelected(true);
        jRadioButton9.setText("MR");

        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setText("MRS");

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jScrollPane26.setViewportView(jTextArea14);

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jScrollPane27.setViewportView(jTextArea15);

        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jScrollPane28.setViewportView(jTextArea16);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel92)
                            .addComponent(jLabel100)
                            .addComponent(jLabel93)
                            .addComponent(jLabel98))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField53)
                            .addComponent(jTextField50)
                            .addComponent(jTextField49)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField48)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel99))
                .addGap(17, 17, 17)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane28))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(jLabel92)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("BONDS", jPanel46);

        jButton26.setText("REFRESH");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SDATE", "STIME", "INCOME", "BILLID", "USER", "NIC"
            }
        ));
        jScrollPane19.setViewportView(jTable12);

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton26)))
                .addContainerGap())
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("INSTALMENTS", jPanel43);

        jButton24.setText("SAVE");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel79.setText("BILL ID :");

        jButton1.setText("UPDATE");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane9)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addComponent(jButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel69)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton25))
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane9)
                .addGap(12, 12, 12)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Manage EP", jPanel34);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Terms & Condition", jPanel35);

        javax.swing.GroupLayout easypayLayout = new javax.swing.GroupLayout(easypay);
        easypay.setLayout(easypayLayout);
        easypayLayout.setHorizontalGroup(
            easypayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );
        easypayLayout.setVerticalGroup(
            easypayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(easypayLayout.createSequentialGroup()
                .addComponent(jTabbedPane8)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Easy Payments", easypay);

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("Contacts", jPanel48);

        jTextArea8.setColumns(20);
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jScrollPane31.setViewportView(jTextArea8);

        jButton38.setText("SAVE");

        jButton37.setText("SEND");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sending Options"));

        buttonGroup5.add(jRadioButton5);
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("One Recepient");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton6);
        jRadioButton6.setText("Group");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton11);
        jRadioButton11.setText("Selected Recepient");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jLabel118.setText("Recepient Email Address :");

        jLabel119.setText("Recepient Group :");

        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "CUSTOMER", "SUPPLIER", "EMPLOYEE", "BONDS", "OTHER" }));

        jTable16.setAutoCreateRowSorter(true);
        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "EMAIL"
            }
        ));
        jScrollPane29.setViewportView(jTable16);

        jTable17.setAutoCreateRowSorter(true);
        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "EMAIL"
            }
        ));
        jScrollPane30.setViewportView(jTable17);

        jButton34.setText("ADD");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("REMOVE");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("LOAD");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton39.setText("ADD ALL");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("REMOVE ALL");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel118)
                            .addComponent(jLabel119))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton36))
                            .addComponent(jTextField57)))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton11))
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jButton34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40)))
                        .addGap(0, 395, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34)
                    .addComponent(jButton35)
                    .addComponent(jButton39)
                    .addComponent(jButton40)))
        );

        jLabel133.setText("SUBJECT :");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel133)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField64)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel84Layout.createSequentialGroup()
                                .addComponent(jButton37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton37)
                    .addComponent(jButton38))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("New Email", jPanel49);

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("Massage Box", jPanel50);

        jLabel134.setText("OFFICIAL EMAIL ADDRESS :");

        jLabel135.setText("PASSWORD :");

        jPasswordField2.setText("password");
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton58.setText("SAVE");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setText("SAVE");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134)
                    .addComponent(jLabel135))
                .addGap(18, 18, 18)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField65)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton58)
                    .addComponent(jButton59))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59))
                .addContainerGap(508, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("Settings", jPanel51);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane11)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane11)
        );

        jTabbedPane1.addTab("Communication", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(214, 600));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 600));
        jPanel4.setPreferredSize(new java.awt.Dimension(214, 600));

        jTabbedPane10.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane10.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setMinimumSize(new java.awt.Dimension(0, 45));

        jLabel155.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane33.setViewportView(jPanel21);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu4.setText("jMenu4");
        jMenu2.add(jMenu4);

        jMenu5.setText("jMenu5");
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("View");

        jMenuItem11.setText("Change Background");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu15.setText("Tools");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Show Working Area");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu15.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Show Tool Pallete");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu15.add(jCheckBoxMenuItem1);

        jMenuItem6.setText("Calculator");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem6);

        jMenuItem7.setText("Products");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem7);

        jMenuItem8.setText("People");
        jMenu15.add(jMenuItem8);

        jMenuItem9.setText("Notes");
        jMenu15.add(jMenuItem9);

        jMenuBar1.add(jMenu15);

        jMenu16.setText("Help");

        jMenuItem3.setText("Shortcuts");
        jMenu16.add(jMenuItem3);

        jMenuItem10.setText("User Guide");
        jMenu16.add(jMenuItem10);

        jMenuItem2.setText("About");
        jMenu16.add(jMenuItem2);

        jMenuBar1.add(jMenu16);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pit1.removeAllFromTable(jTable1);
        try {
            ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS WHERE PID = "+jTextField1.getText()+"");
            while(rs1.next()){
                db.putData("INSERT INTO INS_PLIST (PID, NAME, UNITS, EXP, UNIT_PRICE, DISCOUNT) VALUES ('"+jTextField1.getText()+"','"+rs1.getString("NAME")+"','"+jTextField2.getText()+"','"+rs1.getString("EXP")+"','"+rs1.getString("UNIT_PRICE")+"','"+jTextField3.getText()+"')");
            }
            ResultSet rs2 = db.getData("SELECT PID,NAME,EXP,SUM(UNITS),UNIT_PRICE,DISCOUNT FROM INS_PLIST GROUP BY PID");
            while(rs2.next()){
                pit1.putInTable7(jTable1, rs2.getString("PID"), rs2.getString("NAME"), rs2.getString("EXP"), rs2.getString("SUM(UNITS)"), rs2.getString("UNIT_PRICE"), rs2.getString("DISCOUNT"), String.valueOf((rs2.getDouble("UNIT_PRICE")-rs2.getDouble("DISCOUNT"))*rs2.getDouble("SUM(UNITS)")));
                jLabel16.setText(String.valueOf((rs2.getDouble("UNIT_PRICE")-rs2.getDouble("DISCOUNT"))*rs2.getDouble("SUM(UNITS)")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pit1.removeFromTable(jTable1);
        try {
            ResultSet rs2 = db.getData("SELECT SUM(UNITS) AS SUNITS,UNIT_PRICE,DISCOUNT FROM INS_PLIST GROUP BY PID");
            while(rs2.next()){
                jLabel16.setText(String.valueOf((rs2.getDouble("UNIT_PRICE")-rs2.getDouble("DISCOUNT"))*rs2.getDouble("SUNITS")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            db.putData("DELETE FROM INS_PLIST WHERE PID = '"+jTextField1.getText()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jLabel4.setEnabled(true);
            jTextField4.setEnabled(true);
            jCheckBox2.setEnabled(true);
        }else{
            jLabel4.setEnabled(false);
            jTextField4.setEnabled(false);
            jCheckBox2.setEnabled(false);
            jCheckBox2.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
            jLabel6.setEnabled(true);
            jLabel7.setEnabled(true);
            jLabel8.setEnabled(true);
            jLabel9.setEnabled(true);
            jTextField6.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextArea1.setEnabled(true);
            jRadioButton1.setEnabled(true);
            jRadioButton2.setEnabled(true);
        }else{
            jLabel6.setEnabled(false);
            jLabel7.setEnabled(false);
            jLabel8.setEnabled(false);
            jLabel9.setEnabled(false);
            jTextField6.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
            jTextArea1.setEnabled(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jRadioButton1.isSelected()){
            sellGender = "Mr";
        }else{
            sellGender = "Mrs";
        }
        try {
            ResultSet rs3 = db.getData("SELECT BILLID FROM BILL ORDER BY BILLID DESC LIMIT 1");
            while(rs3.next()){
                jLabel12.setText(String.valueOf(rs3.getInt("BILLID")+1));
            }
            if(jCheckBox1.isSelected()){
                if(jCheckBox2.isSelected()){
                    db.putData("INSERT INTO CUSTOMER (NIC,GENDER,NAME,CONTACT,EMAIL,ADDRESS) VALUES ('"+jTextField4.getText()+"','"+sellGender+"','"+jTextField6.getText()+"','"+jTextField7.getText()+"','"+jTextField8.getText()+"','"+jTextArea1.getText()+"'");
                    db.putData("INSERT INTO BILL (BILLID, INCOME, SDATE, STIME, DATE, METHOD, DETAILS, NIC, USER, TYPE) VALUES ('"+jLabel12.getText()+"', "+jLabel16.getText()+"', '"+sdf1.format(date)+"', '"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+jComboBox1.getSelectedItem()+"','"+jTextField5.getText()+"','"+jTextField4.getText()+"','"+USER+"','SALES')");
                }else{
                    
                    db.putData("INSERT INTO BILL (BILLID,INCOME,SDATE,STIME,DATE,METHOD,DETAILS,NIC, USER, TYPE) VALUES ('"+jLabel12.getText()+"','"+jLabel16.getText()+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+jComboBox1.getSelectedItem()+"','"+jTextField5.getText()+"','"+jTextField4.getText()+"','"+USER+"','SALES')");
                }
            }else{
                    
                    db.putData("INSERT INTO BILL (BILLID,INCOME,SDATE,STIME,DATE,METHOD,DETAILS, USER, TYPE) VALUES ('"+jLabel12.getText()+"','"+jLabel16.getText()+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+jComboBox1.getSelectedItem()+"','"+jTextField5.getText()+"','"+USER+"','SALES')");
            }
            logger("In sale Bill "+jLabel12.getText()+" Issued");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ttot.tableToTableSELL(jLabel12.getText());
        try {
            db.putData("DELETE FROM INS_PLIST");
        } catch (Exception e) {
            System.out.println(e);
        }
        update();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        pit1.removeAllFromTable(jTable2);
        pitf1.putTableFromDB(jTable2,"SELECT * FROM BILL WHERE DATE BETWEEN '"+sdf1.format(jDateChooser1.getDate())+"' AND '"+sdf1.format(jDateChooser2.getDate())+"'");
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(this, "Insert Valid Time Range");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pit1.removeAllFromTable(jTable3);
            
        if(jCheckBox3.isSelected()){
            try {
                db.putData("INSERT INTO PRODUCTS (PID,NAME,UNITS,UNIT_PRICE,BUY_PRICE,EXP) VALUES ('"+jTextField9.getText()+"','"+jTextField15.getText()+"','"+jTextField10.getText()+"','"+jTextField16.getText()+"','"+jTextField11.getText()+"','"+sdf1.format(jDateChooser3.getDate())+"')");
                db.putData("INSERT INTO INS_PULIST (PID,NAME,UNITS,UNIT_PRICE,BUY_PRICE,EXP) VALUES ('"+jTextField9.getText()+"','"+jTextField15.getText()+"','"+jTextField10.getText()+"','"+jTextField16.getText()+"','"+jTextField11.getText()+"','"+sdf1.format(jDateChooser3.getDate())+"')");
                ResultSet rs1 =  db.getData("SELECT PID,NAME,UNITS,UNIT_PRICE,BUY_PRICE,SUM(BUY_PRICE*UNITS) AS SUNITS FROM INS_PULIST GROUP BY PID");
                while(rs1.next()){
                    pit1.putInTable7(jTable3, rs1.getString("PID"), rs1.getString("NAME"), rs1.getString("EXP"), rs1.getString("UNITS"), rs1.getString("BUY_PRICE"), rs1.getString("UNIT_PRICE"), rs1.getString("SUNITS"));
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else{
             try {
                ResultSet rs2= db.getData("SELECT * FROM PRODUCTS WHERE PID = "+jTextField9.getText()+"");
                while(rs2.next()){
                    db.putData("INSERT INTO INS_PULIST (PID,NAME,UNITS,UNIT_PRICE,BUY_PRICE,EXP) VALUES ('"+rs2.getString("PID")+"','"+rs2.getString("NAME")+"','"+jTextField10.getText()+"','"+rs2.getString("UNIT_PRICE")+"','"+rs2.getString("BUY_PRICE")+"','"+rs2.getString("EXP")+"')");
                    ResultSet rs1 =  db.getData("SELECT PID,EXP,NAME,SUM(UNITS),UNIT_PRICE,BUY_PRICE,SUM(BUY_PRICE*UNITS) AS SUNITS FROM INS_PULIST GROUP BY PID");
                    while(rs1.next()){
                        pit1.putInTable7(jTable3, rs1.getString("PID"), rs1.getString("NAME"), rs1.getString("EXP"), rs1.getString("SUM(UNITS)"), rs1.getString("BUY_PRICE"), rs1.getString("UNIT_PRICE"), rs1.getString("SUNITS"));
                    }
                }
                
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        }
            try {
                ResultSet rs3 = db.getData("SELECT SUM(UNITS*UNIT_PRICE) AS TOTAL FROM INS_PULIST");
                while(rs3.next()){
                    jLabel17.setText(rs3.getString("TOTAL"));
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            db.putData("DELETE FROM INS_PULIST WHERE PID = '"+jTextField9.getText()+"'");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        if(jCheckBox3.isSelected()){
            jLabel26.setEnabled(true);
            jLabel28.setEnabled(true);
            jLabel29.setEnabled(true);
            jLabel31.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField16.setEnabled(true);
            jTextField17.setEnabled(true);
            jDateChooser3.setEnabled(true);
        }else{
            jLabel26.setEnabled(false);
            jLabel28.setEnabled(false);
            jLabel29.setEnabled(false);
            jLabel31.setEnabled(false);
            jTextField15.setEnabled(false);
            jTextField16.setEnabled(false);
            jTextField17.setEnabled(false);
            jDateChooser3.setEnabled(false);
        
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected()){
            jLabel23.setEnabled(true);
            jTextField12.setEnabled(true);
            jCheckBox5.setEnabled(true);
        }else{
            jLabel23.setEnabled(false);
            jLabel24.setEnabled(false);
            jLabel25.setEnabled(false);
            jLabel27.setEnabled(false);
            jLabel32.setEnabled(false);
            jTextField13.setEnabled(false);
            jTextField14.setEnabled(false);
            jTextField12.setEnabled(false);
            jTextField19.setEnabled(false);
            jTextArea2.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox5.setSelected(false);
        
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        try{
        if(jCheckBox4.isSelected()){
            if(jCheckBox5.isSelected()){
                db.putData("INSERT INTO SUPPLIER (NIC,NAME,CONTACT,EMAIL,ADDRESS) VALUES ('"+jTextField12.getText()+"','"+jTextField13.getText()+"','"+jTextField14.getText()+"','"+jTextField19.getText()+"','"+jTextArea2.getText()+"')");
                db.putData("INSERT INTO BILL (BILLID, WAGES, SDATE, STIME, DATE, NIC, USER, TYPE) VALUES ('"+jLabel19.getText()+"','"+jLabel17.getText()+"','"+sdf1.format(date)+"', '"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+jTextField12.getText()+"','"+USER+"','PURCHASE')");
            }else{
                
                db.putData("INSERT INTO BILL (BILLID, WAGES, SDATE, STIME, DATE, NIC, USER, TYPE) VALUES ('"+jLabel19.getText()+"','"+jLabel17.getText()+"','"+sdf1.format(date)+"', '"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+jTextField12.getText()+"','"+USER+"','PURCHASE')");
            }
        }else{
                
                db.putData("INSERT INTO BILL (BILLID, WAGES, SDATE, STIME, DATE, USER, TYPE) VALUES ('"+jLabel19.getText()+"','"+jLabel17.getText()+"','"+sdf1.format(date)+"', '"+sdf2.format(date)+"','"+sdf1.format(date)+"','"+USER+"','PURCHASE')");
        }
        }catch(Exception e){
            System.out.println(e);
           
        }
        ttot.tableToTable(jLabel19.getText());
        try {
            db.putData("DELETE FROM INS_PULIST");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        update();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected()){
            jLabel24.setEnabled(true);
            jLabel25.setEnabled(true);
            jLabel27.setEnabled(true);
            jLabel32.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField13.setEnabled(true);
            jTextField19.setEnabled(true);
            jTextArea2.setEnabled(true);
        }else{
            jLabel24.setEnabled(false);
            jLabel25.setEnabled(false);
            jLabel27.setEnabled(false);
            jLabel32.setEnabled(false);
            jTextField13.setEnabled(false);
            jTextField14.setEnabled(false);
            jTextField19.setEnabled(false);
            jTextArea2.setEnabled(false);
        
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{
        pit1.removeAllFromTable(jTable4);
        pitf1.putTableFromDB(jTable4,"SELECT * FROM BILL WHERE DATE BETWEEN '"+sdf1.format(jDateChooser4.getDate())+"' AND '"+sdf1.format(jDateChooser5.getDate())+"'");
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, "Insert Valid Time Range");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(jComboBox5.getSelectedIndex()==0){
            pit1.removeAllFromTable(jTable5);
            pitf1.putTableFromDB(jTable5, "SELECT * FROM PRODUCTS");
        }else{
            pit1.removeAllFromTable(jTable5);
            pitf1.putTableFromDB(jTable5, "SELECT * FROM PRODUCTS WHERE CATEGORY LIKE '"+jComboBox5.getSelectedItem()+"%'");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try{
        pit1.removeAllFromTable(jTable6);
        pitf1.putTableFromDB(jTable6,"SELECT * FROM BILL WHERE DATE BETWEEN '"+sdf1.format(jDateChooser6.getDate())+"' AND '"+sdf1.format(jDateChooser7.getDate())+"'");
        pit1.removeAllFromTable(jTable7);
        pitf1.putTableFromDB(jTable7,"SELECT * FROM TRANSACTIONS WHERE DATE BETWEEN '"+sdf1.format(jDateChooser6.getDate())+"' AND '"+sdf1.format(jDateChooser7.getDate())+"'");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Insert Valid Time Range");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(jComboBox2.getSelectedIndex()==0){
            try {
                db.putData("INSERT INTO TRANSACTIONS (TRANSFER_TO,TRANSFER_FROM,INCOME,DESCRIPTION,USER,SDATE,STIME,DATE) VALUES ('"+jTextField28.getText()+"','"+jTextField29.getText()+"',"+jTextField21.getText()+",'"+jTextArea3.getText()+"','"+USER+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"')");
                ResultSet rs1 = db.getData("SELECT * FROM TRANSACTIONS ORDER BY TRANID DESC LIMIT 1");
                while(rs1.next()){
                    jLabel43.setText(String.valueOf(rs1.getInt("TRANID")+1));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            try {
                db.putData("INSERT INTO TRANSACTIONS (TRANSFER_TO,TRANSFER_FROM,WAGES,DESCRIPTION,USER,SDATE,STIME,DATE) VALUES ('"+jTextField28.getText()+"','"+jTextField29.getText()+"',"+jTextField21.getText()+",'"+jTextArea3.getText()+"','"+USER+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"')");
                ResultSet rs1 = db.getData("SELECT * FROM TRANSACTIONS ORDER BY TRANID DESC LIMIT 1");
                while(rs1.next()){
                    jLabel43.setText(String.valueOf(rs1.getInt("TRANID")+1));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
            logger("Made a new Transaction "+jTextField21.getText());
            
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        if(jTabbedPane1.getSelectedIndex()==0){
            System.out.println("0");
            update();
        }else if(jTabbedPane1.getSelectedIndex()==1){
            System.out.println("1");
            update();
        
        }else if(jTabbedPane1.getSelectedIndex()==2){
            System.out.println("2");
            
            try {
                ResultSet rs1 = db.getData("SELECT DISTINCT CATEGORY FROM PRODUCTS");
                while(rs1.next()){
                    jComboBox5.addItem(rs1.getString("CATEGORY"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }else if(jTabbedPane1.getSelectedIndex()==3){
            System.out.println("3");
            try {
                ResultSet rs1 = db.getData("SELECT * FROM TRANSACTIONS ORDER BY TRANID DESC LIMIT 1");
                while(rs1.next()){
                    jLabel43.setText(String.valueOf(rs1.getInt("TRANID")+1));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }else if(jTabbedPane1.getSelectedIndex()==4){
            System.out.println("4");
        
        }else if(jTabbedPane1.getSelectedIndex()==5){
            System.out.println("5");
            pit1.removeAllFromTable(jTable15);
            pitf1.putTableFromDB(jTable15, "SELECT * FROM ADMINISTRATION");
        
        }else if(jTabbedPane1.getSelectedIndex()==6){
            System.out.println("6");
            try {
            ResultSet rs1 =  db.getData("SELECT EPID FROM EASYPAYMENT ORDER BY EPID DESC LIMIT 1");
            while(rs1.next()){
                jTextField55.setText(String.valueOf(rs1.getString("EPID")+1));
                update();
            }
            } catch (Exception e) {
                System.out.println(e);
            }
            update();
        
        }else if(jTabbedPane1.getSelectedIndex()==7){
            System.out.println("7");
        
        }else{
            System.out.println("0");
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        try {
            db.putData("DELETE FROM PRODUCTS WHERE PID = '"+jTextField18.getText()+"'");
            logger("Deleted "+jTextField20.getText()+" Product from Database");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS WHERE PID = '"+jTextField18.getText()+"'");
            while(rs1.next()){
                jTextField20.setText(rs1.getString("NAME"));
                jTextField22.setText(rs1.getString("UNIT_PRICE"));
                jTextField23.setDate(rs1.getDate("EXP"));
                jTextField27.setText(rs1.getString("CATEGORY"));
                jTextField24.setText(rs1.getString("BUY_PRICE"));
                jTextField25.setText(rs1.getString("MANUFACTURE"));
                jTextArea4.setText(rs1.getString("DESCRIPTION"));
                jTextField26.setText(rs1.getString("UNITS"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        try {
            db.putData("INSERT INTO PRODUCTS (PID, NAME, UNIT_PRICE, EXP, UNITS, BUY_PRICE, MANUFACTURE, DESCRIPTION, CATEGORY) values ("+jTextField18.getText()+",'"+jTextField20.getText()+"','"+jTextField22.getText()+"','"+sdf1.format(jTextField23.getDate())+"','"+jTextField26.getText()+"','"+jTextField24.getText()+"','"+jTextField25.getText()+"','"+jTextArea4.getText()+"','"+jTextField27.getText()+"')");
            logger("Inserted new Product "+jTextField20.getText());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jTextField26.setText(String.valueOf(Double.parseDouble(jTextField26.getText())+1.0));
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jTextField26.setText(String.valueOf(Double.parseDouble(jTextField26.getText())-1.0));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:       
        try{
        pit1.removeAllFromTable(jTable9);
        pitf1.putTableFromDB(jTable9,"SELECT * FROM BILL WHERE TYPE = 'PURCHASE' AND DATE BETWEEN '"+sdf1.format(jDateChooser8.getDate())+"' AND '"+sdf1.format(jDateChooser9.getDate())+"'");
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, "Insert Valid Time Range");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
        pit1.removeAllFromTable(jTable8);
        pitf1.putTableFromDB(jTable8,"SELECT STOCKID, BILLID, PID, NAME, SUM(UNITS) AS UNITS, EXP, SDATE, STIME, DATE, BUY_PRICE, SUB_TOTAL FROM STOCKS WHERE BILLID = '"+jTable9.getValueAt(jTable9.getSelectedRow(), 0)+"' GROUP BY PID");
    }//GEN-LAST:event_jTable9MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        pit1.removeAllFromTable(jTable10);
        pitf1.putTableFromDB(jTable10,"SELECT STOCKID, BILLID, PID, NAME, SUM(UNITS) AS UNITS, EXP, SDATE, STIME, DATE, UNIT_PRICE, SUB_TOTAL FROM SELL WHERE BILLID = '"+jTable2.getValueAt(jTable2.getSelectedRow(), 0)+"' GROUP BY PID");
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        pit1.removeAllFromTable(jTable11);
        if(jComboBox3.getSelectedIndex()==0){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM CUSTOMER,SUPPLIER,EMPLOYEE,BONDS,OTHER GROUP BY NIC ");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==1){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM CUSTOMER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==2){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM SUPPLIER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==3){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM EMPLOYEE");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==4){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM BONDS");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox3.getSelectedIndex()==5){
            try {
                pitf1.putTableFromDB(jTable11, "SELECT * FROM OTHER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){
            PGENDER = "MR";
        }else{
            PGENDER = "MRS";
        }
        if(jComboBox4.getSelectedIndex()==0){
            try {
                db.putData("INSERT INTO CUSTOMER (NIC,NAME,GENDER,CONTACT,EMAIL,ADDRESS,CAREER,WORK_ADDRESS,WORK_CONTACT,DESCRIPTION) VALUES ('"+jTextField30.getText()+"','"+jTextField31.getText()+"','"+PGENDER+"','"+jTextField32.getText()+"','"+jTextField35.getText()+"','"+jTextArea5.getText()+"','"+jTextField33.getText()+"','"+jTextArea6.getText()+"','"+jTextField34.getText()+"','"+jTextArea7.getText()+"')");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox4.getSelectedIndex()==1){
            try {
                db.putData("INSERT INTO SUPPLIER (NIC,NAME,GENDER,CONTACT,EMAIL,ADDRESS,CAREER,WORK_ADDRESS,WORK_CONTACT,DESCRIPTION) VALUES ('"+jTextField30.getText()+"','"+jTextField31.getText()+"','"+PGENDER+"','"+jTextField32.getText()+"','"+jTextField35.getText()+"','"+jTextArea5.getText()+"','"+jTextField33.getText()+"','"+jTextArea6.getText()+"','"+jTextField34.getText()+"','"+jTextArea7.getText()+"')");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox4.getSelectedIndex()==2){
            try {
                db.putData("INSERT INTO EMPLOYEE (NIC,NAME,GENDER,CONTACT,EMAIL,ADDRESS,CAREER,WORK_ADDRESS,WORK_CONTACT,DESCRIPTION) VALUES ('"+jTextField30.getText()+"','"+jTextField31.getText()+"','"+PGENDER+"','"+jTextField32.getText()+"','"+jTextField35.getText()+"','"+jTextArea5.getText()+"','"+jTextField33.getText()+"','"+jTextArea6.getText()+"','"+jTextField34.getText()+"','"+jTextArea7.getText()+"')");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox4.getSelectedIndex()==3){
            try {
                db.putData("INSERT INTO BONDS (NIC,NAME,GENDER,CONTACT,EMAIL,ADDRESS,CAREER,WORK_ADDRESS,WORK_CONTACT,DESCRIPTION) VALUES ('"+jTextField30.getText()+"','"+jTextField31.getText()+"','"+PGENDER+"','"+jTextField32.getText()+"','"+jTextField35.getText()+"','"+jTextArea5.getText()+"','"+jTextField33.getText()+"','"+jTextArea6.getText()+"','"+jTextField34.getText()+"','"+jTextArea7.getText()+"')");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox4.getSelectedIndex()==4){
            try {
                db.putData("INSERT INTO OTHER (NIC,NAME,GENDER,CONTACT,EMAIL,ADDRESS,CAREER,WORK_ADDRESS,WORK_CONTACT,DESCRIPTION) VALUES ('"+jTextField30.getText()+"','"+jTextField31.getText()+"','"+PGENDER+"','"+jTextField32.getText()+"','"+jTextField35.getText()+"','"+jTextArea5.getText()+"','"+jTextField33.getText()+"','"+jTextArea6.getText()+"','"+jTextField34.getText()+"','"+jTextArea7.getText()+"')");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        /*try {
            ResultSet rs1 = db.getData("SELECT UNIT_PRICE FROM PRODUCTS WHERE PID = '"+jTextField36.getText()+"'");
            while(rs1.next()){
                jTextField56.setText(rs1.getString("UNIT_PRICE"));
                double unit_price; double basic; double interest; double months;
                unit_price = Double.parseDouble(jTextField41.getText());
                basic = Double.parseDouble(jTextField37.getText());
                interest = Double.parseDouble(jTextField40.getText());
                months = Double.parseDouble(jTextField38.getText());
                jTextField54.setText(String.valueOf((unit_price-basic)*(1+(interest/100)/months)));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }*/
        try {
            ResultSet rs1 = db.getData("SELECT TOTAL_PAYABLE FROM PRODUCTS WHERE PID = '"+jTextField36.getText()+"'");
            while(rs1.next()){
                jTextField56.setText(rs1.getString("TOTAL_PAYABLE"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        if(jRadioButton7.isSelected()){
            epg1 = "MR";
        }else{
            epg1 = "MRS";
        }
        if(jRadioButton9.isSelected()){
            epg2 = "MR";
        }else{
            epg2 = "MRS";
        }
        try {
            db.putData("INSERT INTO EASYPAYMENT (PID,MONTHS,FINE,MONTHLY,INTEREST,BASIC,UNIT_PRICE,CUSTOMER_NIC,CUSTOMER,BOND_NIC,TOTAL_PAYABLE) VALUES ('"+jTextField36.getText()+"','"+jTextField38.getText()+"','"+jTextField39.getText()+"','"+jTextField54.getText()+"','"+jTextField40.getText()+"','"+jTextField37.getText()+"','"+jTextField41.getText()+"','"+jTextField42.getText()+"','"+jTextField43.getText()+"','"+jTextField48.getText()+"','"+jTextField56.getText()+"')");
            try {
                ResultSet rs1 = db.getData("SELECT * FROM CUSTOMER WHERE NIC = '"+jTextField42.getText()+"'");
                while(rs1.next()){
                    if(rs1.getString("NIC").equals(jTextField42.getText())){
                        db.putData("INSERT INTO CUSTOMER (NIC,GENDER,NAME,EMAIL,CONTACT,ADDRESS,CAREER,WORK_CONTACT,WORK_ADDRESS,DESCRIPTION) VALUES ('"+jTextField42.getText()+"','"+epg1+"','"+jTextField43.getText()+"','"+jTextField47.getText()+"','"+jTextField44.getText()+"','"+jTextArea11.getText()+"','"+jTextField45.getText()+"','"+jTextField46.getText()+"','"+jTextArea12.getText()+"','"+jTextArea13.getText()+"')");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                ResultSet rs2 = db.getData("SELECT * FROM BONDS WHERE NIC = '"+jTextField48.getText()+"'");
                while(rs2.next()){
                    if(rs2.getString("NIC").equals(jTextField48.getText())){
                        db.putData("INSERT INTO CUSTOMER (NIC,GENDER,NAME,EMAIL,CONTACT,ADDRESS,CAREER,WORK_CONTACT,WORK_ADDRESS,DESCRIPTION) VALUES ('"+jTextField42.getText()+"','"+epg1+"','"+jTextField43.getText()+"','"+jTextField47.getText()+"','"+jTextField44.getText()+"','"+jTextArea11.getText()+"','"+jTextField45.getText()+"','"+jTextField46.getText()+"','"+jTextArea12.getText()+"','"+jTextArea13.getText()+"')");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            db.putData("INSERT INTO BONDS (NIC,GENDER,NAME,EMAIL,CONTACT,ADDRESS,CAREER,WORK_CONTACT,WORK_ADDRESS,DESCRIPTION) VALUES ('"+jTextField48.getText()+"','"+epg2+"','"+jTextField49.getText()+"','"+jTextField53.getText()+"','"+jTextField50.getText()+"','"+jTextArea14.getText()+"','"+jTextField51.getText()+"','"+jTextField52.getText()+"','"+jTextArea15.getText()+"','"+jTextArea16.getText()+"')");
            db.putData("INSERT INTO BILL (BILLID,INCOME,SDATE,STIME,DATE,METHOD,NIC,USER,TYPE,EPID) VALUES ('"+jLabel80.getText()+"','"+jTextField37.getText()+"','"+sdf1.format(date)+"','"+sdf2.format(date)+"','"+sdf1.format(date)+"','DERECT','"+jTextField42.getText()+"','"+USER+"','EASY PAYMENTS','"+jTextField55.getText()+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs1 = db.getData("SELECT UNIT_PRICE FROM PRODUCTS WHERE PID = '"+jTextField36.getText()+"'");
            while(rs1.next()){
                jTextField56.setText(rs1.getString("UNIT_PRICE"));
                double unit_price; double basic; double interest; double months;
                unit_price = Double.parseDouble(jTextField41.getText());
                basic = Double.parseDouble(jTextField37.getText());
                interest = Double.parseDouble(jTextField40.getText());
                months = Double.parseDouble(jTextField38.getText());
                jTextField54.setText(String.valueOf((unit_price-basic)*(1+(interest/100)/months)));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ResultSet rs1 = db.getData("SELECT TOTAL_PAYABLE FROM PRODUCTS WHERE PID = '"+jTextField36.getText()+"'");
            while(rs1.next()){
                jTextField56.setText(rs1.getString("TOTAL_PAYABLE"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTabbedPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane8MouseClicked
        // TODO add your handling code here:
        try {
            ResultSet rs1 =  db.getData("SELECT EPID FROM EASYPAYMENT ORDER BY EPID DESC LIMIT 1");
            while(rs1.next()){
                jTextField55.setText(rs1.getString("EPID"));
                update();
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jTabbedPane8MouseClicked

    private void jTabbedPane9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane9MouseClicked

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        pitf1.putTableFromDB(jTable12, "SELECT * FROM BILL WHERE EPID = '"+jTextField55.getText()+"'");
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
    try {
        // TODO add your handling code here:
        jComboBox5.removeAllItems();
        jComboBox5.addItem("ALL");
        ResultSet rs1 = db.getData("SELECT DISTINCT CATEGORY FROM PRODUCTS");
        while(rs1.next()){
            jComboBox5.addItem(rs1.getString("CATEGORY"));
        }
    } catch (Exception ex) {
        System.out.println(ex);
    }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField58ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs1 = db.getData("SELECT * FROM easypayment WHERE EPID = '"+jTextField58.getText()+"'");
            while(rs1.next()){
                db.putData("UPDATE easypayment SET TOTAL_PAYABLE = '"+(Double.parseDouble(rs1.getString("TOTAL_PAYABLE"))-Double.parseDouble(jTextField60.getText()))+"', LASTDATE = '"+sdf1.format(date)+"' WHERE EPID = '"+jTextField58.getText()+"'");
                db.putData("INSERT INTO BILL (BILLID,INCOME,SDATE,STIME,DATE,METHOD,USER,TYPE) VALUES ('"+jLabel108.getText()+"','"+jTextField60.getText()+"', '"+sdf1.format(date)+"', '"+sdf2.format(date)+"','"+sdf1.format(date)+"','DERECT','"+USER+"','EASY PAYMENTS')");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
            update();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs1 = db.getData("SELECT * FROM easypayment WHERE EPID = '"+jTextField58.getText()+"'");
            while(rs1.next()){
                String lastday = rs1.getString("LASTDATE");
                long theday = Date.parse(lastday);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton27ActionPerformed
    
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        
        pit1.removeAllFromTable(jTable15);
        try {
            
        int key1 = JOptionPane.showConfirmDialog(this, "you are creating a User Acount that can be Access to Axion, Allow this User Account");
        logger("Created New User Account "+jTextField61.getText());
        if(key1==0){
            db.putData("INSERT INTO ADMINISTRATION (USER,PASSWORD) VALUES ('"+jTextField61.getText()+"','"+new String (jPasswordField1.getText())+"')");
            for(int x=0;x<=jTable14.getRowCount();x++){
                int z = x+1;
                    if((boolean) jTable14.getValueAt(x, 1)){
                        db.putData("UPDATE ADMINISTRATION SET f"+z+" = '1' WHERE USER = '"+jTextField61.getText()+"'");
                    }else{
                        db.putData("UPDATE ADMINISTRATION SET f"+z+" = '0' WHERE USER = '"+jTextField61.getText()+"'");
                    }
            }
            
            JOptionPane.showMessageDialog(this, "new User Account has Created");
        }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
        pitf1.putTableFromDB(jTable15, "SELECT * FROM ADMINISTRATION");
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
            pit1.removeAllFromTable(jTable15);
        try{
            for(int x=0;x<=jTable14.getRowCount();x++){
                int z = x+1;
                    if((boolean) jTable14.getValueAt(x, 1)){
                        db.putData("UPDATE ADMINISTRATION SET f"+z+" = '1' WHERE USER = '"+jTextField61.getText()+"'");
                    }else{
                        db.putData("UPDATE ADMINISTRATION SET f"+z+" = '0' WHERE USER = '"+jTextField61.getText()+"'");
                    }
                    
            }
            logger("Updated User Account "+jTextField61.getText());
        }catch(Exception e){
            System.out.println(e);
        
        }finally{
        
        pitf1.putTableFromDB(jTable15, "SELECT * FROM ADMINISTRATION");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTable15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable15MouseClicked
        // TODO add your handling code here:
        jTextField61.setText(String.valueOf(jTable15.getValueAt(jTable15.getSelectedRow(), 1)));
        try {
            DefaultTableModel dtm1 = (DefaultTableModel) jTable14.getModel();
            for(int x=0;x<30;x++){
                ResultSet rs1 = db.getData("SELECT * FROM ADMINISTRATION WHERE USER = '"+jTextField61.getText()+"'");
                while(rs1.next()){
                    int z = x+5;
                    int z1 = rs1.getInt(z);
                    if(z1==1){
                        dtm1.setValueAt(true, x, 1);
                    }else if (z1==0){
                        dtm1.setValueAt(false, x, 1);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable15MouseClicked

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        
        try{
        int key1 = JOptionPane.showConfirmDialog(this, "This User Account will be Deleted and Cannot be Undone, Are you Sure ?");
        if(key1==0){
            pit1.removeAllFromTable(jTable15);
            System.out.println(sw1);
            
        }
        }catch(Exception ee){
            
        }
        
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs1 = db.getData("SELECT * FROM easypayment WHERE EPID = '"+jTextField55.getText()+"'");
            while(rs1.next()){
                jTextField36.setText(rs1.getString("EPID"));
                jTextField38.setText(rs1.getString("MONTHS"));
                jTextField39.setText(rs1.getString("FINE"));
                jTextField54.setText(rs1.getString("MONTHLY"));
                jTextField40.setText(rs1.getString("INTEREST"));
                jTextField37.setText(rs1.getString("BASIC"));
                jTextField41.setText(rs1.getString("UNIT_PRICE"));
                jTextField56.setText(rs1.getString("TOTAL_PAYABLE"));
                ResultSet rs2 = db.getData("SELECT * FROM CUSTOMER WHERE NIC = '"+rs1.getString("CUSTOMER_NIC")+"'");
                while(rs2.next()){
                    jTextField42.setText(rs2.getString("NIC"));
                    jTextField43.setText(rs2.getString("NAME"));
                    jTextField44.setText(rs2.getString("CONTACT"));
                    jTextField47.setText(rs2.getString("EMAIL"));
                    jTextArea11.setText(rs2.getString("ADDRESS"));
                    jTextField45.setText(rs2.getString("CAREER"));
                    jTextArea12.setText(rs2.getString("WORK_ADDRESS"));
                    jTextField46.setText(rs2.getString("WORK_CONTACT"));
                    jTextArea13.setText(rs2.getString("DESCRIPTION"));
                    if(rs2.getString("GENDER").equalsIgnoreCase("Mrs")){
                        jRadioButton8.setSelected(true);
                        jRadioButton7.setSelected(false);
                    }else{
                        jRadioButton8.setSelected(false);
                        jRadioButton7.setSelected(true);
                    }
                }
                ResultSet rs3 = db.getData("SELECT * FROM BONDS WHERE NIC = '"+rs1.getString("BOND_NIC")+"'");
                while(rs3.next()){
                    jTextField48.setText(rs3.getString("NIC"));
                    jTextField49.setText(rs3.getString("NAME"));
                    jTextField50.setText(rs3.getString("CONTACT"));
                    jTextField53.setText(rs3.getString("EMAIL"));
                    jTextArea14.setText(rs3.getString("ADDRESS"));
                    jTextField51.setText(rs3.getString("CAREER"));
                    jTextArea15.setText(rs3.getString("WORK_ADDRESS"));
                    jTextField52.setText(rs3.getString("WORK_CONTACT"));
                    jTextArea16.setText(rs3.getString("DESCRIPTION"));
                    
                    if(rs3.getString("GENDER").equalsIgnoreCase("Mrs")){
                        jRadioButton10.setSelected(true);
                        jRadioButton9.setSelected(false);
                    }else{
                        jRadioButton10.setSelected(false);
                        jRadioButton9.setSelected(true);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        pitf1.putTableFromDB(jTable12, "SELECT * FROM BILL WHERE EPID = '"+jTextField55.getText()+"'");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if(jComboBox6.getSelectedIndex()==0){
            pitf1.putTableFromDB(jTable13, "SELECT * FROM easypayment");
        }else{
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if(jComboBox7.getSelectedIndex()==0){
            try {
                db.putData("UPDATE THEMES SET THEME = 1 WHERE ID = 0");
                new Axion2014();
                dispose();
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if(jComboBox7.getSelectedIndex()==1){
            try {
                db.putData("UPDATE THEMES SET THEME = 0 WHERE ID = 0");
                new Axion2014();
                dispose();
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jLabel109MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MouseEntered
        // TODO add your handling code here:
        jLabel109.setBorder(boder1);
        jLabel109.setToolTipText("Store");
    }//GEN-LAST:event_jLabel109MouseEntered

    private void jLabel109MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MouseExited
        // TODO add your handling code here:
        jLabel109.setBorder(boder2);
    }//GEN-LAST:event_jLabel109MouseExited

    private void jLabel110MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseEntered
        // TODO add your handling code here:
        jLabel110.setBorder(boder1);
        jLabel110.setToolTipText("Purchase");
    }//GEN-LAST:event_jLabel110MouseEntered

    private void jLabel110MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseExited
        // TODO add your handling code here:
        jLabel110.setBorder(boder2);
    }//GEN-LAST:event_jLabel110MouseExited

    private void jLabel111MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseEntered
        // TODO add your handling code here:
        jLabel111.setBorder(boder1);
        
        jLabel111.setToolTipText("Sell");
    }//GEN-LAST:event_jLabel111MouseEntered

    private void jLabel111MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseExited
        // TODO add your handling code here:
        jLabel111.setBorder(boder2);
    }//GEN-LAST:event_jLabel111MouseExited

    private void jLabel112MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseEntered
        // TODO add your handling code here:
        jLabel112.setBorder(boder1);
        jLabel112.setToolTipText("Accounts");
    }//GEN-LAST:event_jLabel112MouseEntered

    private void jLabel112MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseExited
        // TODO add your handling code here:
        jLabel112.setBorder(boder2);
    }//GEN-LAST:event_jLabel112MouseExited

    private void jLabel113MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseEntered
        // TODO add your handling code here:
        jLabel113.setBorder(boder1);
        jLabel113.setToolTipText("People");
    }//GEN-LAST:event_jLabel113MouseEntered

    private void jLabel113MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseExited
        // TODO add your handling code here:
        jLabel113.setBorder(boder2);
    }//GEN-LAST:event_jLabel113MouseExited

    private void jLabel114MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseEntered
        // TODO add your handling code here:
        jLabel114.setBorder(boder1);
        jLabel114.setToolTipText("Easy Payments List");
    }//GEN-LAST:event_jLabel114MouseEntered

    private void jLabel114MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseExited
        // TODO add your handling code here:
        jLabel114.setBorder(boder2);
    }//GEN-LAST:event_jLabel114MouseExited

    private void jLabel116MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseEntered
        // TODO add your handling code here:
        jLabel116.setBorder(boder1);
        jLabel116.setToolTipText("Stocks");
    }//GEN-LAST:event_jLabel116MouseEntered

    private void jLabel116MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseExited
        // TODO add your handling code here:
        jLabel116.setBorder(boder2);
    }//GEN-LAST:event_jLabel116MouseExited

    private void jLabel115MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseEntered
        // TODO add your handling code here:
        jLabel115.setBorder(boder1);
        jLabel115.setToolTipText("Settings");
    }//GEN-LAST:event_jLabel115MouseEntered

    private void jLabel115MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseExited
        // TODO add your handling code here:
        jLabel115.setBorder(boder2);
    }//GEN-LAST:event_jLabel115MouseExited

    private void jLabel109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel109MouseClicked

    private void jLabel109MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MousePressed
        // TODO add your handling code here:
        jLabel109.setBorder(boder3);
    }//GEN-LAST:event_jLabel109MousePressed

    private void jLabel109MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MouseReleased
        // TODO add your handling code here:
        jLabel109.setBorder(boder1);
    }//GEN-LAST:event_jLabel109MouseReleased

    private void jLabel110MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MousePressed
        // TODO add your handling code here:
        jLabel110.setBorder(boder2);
    }//GEN-LAST:event_jLabel110MousePressed

    private void jLabel110MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseReleased
        // TODO add your handling code here:
        jLabel110.setBorder(boder1);
    }//GEN-LAST:event_jLabel110MouseReleased

    private void jLabel111MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MousePressed
        // TODO add your handling code here:
        jLabel111.setBorder(boder2);
    }//GEN-LAST:event_jLabel111MousePressed

    private void jLabel111MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseReleased
        // TODO add your handling code here:
        jLabel111.setBorder(boder1);
    }//GEN-LAST:event_jLabel111MouseReleased

    private void jLabel112MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MousePressed
        // TODO add your handling code here:
        jLabel112.setBorder(boder2);
    }//GEN-LAST:event_jLabel112MousePressed

    private void jLabel112MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseReleased
        // TODO add your handling code here:
        jLabel112.setBorder(boder1);
    }//GEN-LAST:event_jLabel112MouseReleased

    private void jLabel113MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MousePressed
        // TODO add your handling code here:
        jLabel113.setBorder(boder2);
    }//GEN-LAST:event_jLabel113MousePressed

    private void jLabel113MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseReleased
        // TODO add your handling code here:
        jLabel113.setBorder(boder1);
    }//GEN-LAST:event_jLabel113MouseReleased

    private void jLabel114MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MousePressed
        // TODO add your handling code here:
        jLabel114.setBorder(boder2);
    }//GEN-LAST:event_jLabel114MousePressed

    private void jLabel114MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseReleased
        // TODO add your handling code here:
        jLabel114.setBorder(boder1);
    }//GEN-LAST:event_jLabel114MouseReleased

    private void jLabel116MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MousePressed
        // TODO add your handling code here:
        jLabel116.setBorder(boder2);
    }//GEN-LAST:event_jLabel116MousePressed

    private void jLabel116MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseReleased
        // TODO add your handling code here:
        jLabel116.setBorder(boder1);
    }//GEN-LAST:event_jLabel116MouseReleased

    private void jLabel115MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MousePressed
        // TODO add your handling code here:
        jLabel115.setBorder(boder2);
    }//GEN-LAST:event_jLabel115MousePressed

    private void jLabel115MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseReleased
        // TODO add your handling code here:
        jLabel115.setBorder(boder1);
    }//GEN-LAST:event_jLabel115MouseReleased

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel110MouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel112MouseClicked

    private void jLabel113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel113MouseClicked

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel116MouseClicked

    private void jLabel115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        jTabbedPane4.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel115MouseClicked

    private void jLabel117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseClicked
        // TODO add your handling code here:
        Calculator cal = new Calculator();
        
        
        
        Component[] c=jTabbedPane10.getComponents();
        boolean b=true;
        for (int j = 0; j < c.length; j++) {
                System.out.println(jTabbedPane10.getTitleAt(j));
            if(jTabbedPane10.getTitleAt(j).equals("Calculator")){
                b=false;
                jTabbedPane10.setSelectedIndex(j);
            }
        }
        if (b) {
            jTabbedPane10.add("Calculator",cal.jPanel2);
        try {
            ResultSet rs = db.getData("SELECT * FROM COLORS WHERE ID = '"+jTable18.getValueAt(jTable18.getSelectedRow(), 0)+"'");
            while(rs.next()){
                Color c1 = new Color(rs.getInt("C"));
                Calculator.jPanel2.setBackground(c1);
                PPList.jPanel2.setBackground(c1);
                PRList.jPanel2.setBackground(c1);
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
        
            jTabbedPane10.setSelectedComponent(cal.jPanel2);
        }
        
    }//GEN-LAST:event_jLabel117MouseClicked

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton5.isSelected()){
            jLabel118.setEnabled(true);
            jTextField57.setEnabled(true);
            jLabel119.setEnabled(false);
            jComboBox8.setEnabled(false);
            jButton36.setEnabled(false);
            jTable16.setEnabled(false);
            jTable17.setEnabled(false);
            jButton34.setEnabled(false);
            jButton35.setEnabled(false);
            jButton39.setEnabled(false);
            jButton40.setEnabled(false);
        }
        
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton6.isSelected()){
            jLabel118.setEnabled(false);
            jTextField57.setEnabled(false);
            jLabel119.setEnabled(true);
            jComboBox8.setEnabled(true);
            jButton36.setEnabled(true);
            jTable16.setEnabled(true);
            jTable17.setEnabled(false);
            jButton34.setEnabled(false);
            jButton35.setEnabled(false);
            jButton39.setEnabled(false);
            jButton40.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton11.isSelected()){
            jLabel118.setEnabled(false);
            jTextField57.setEnabled(false);
            jLabel119.setEnabled(true);
            jComboBox8.setEnabled(true);
            jButton36.setEnabled(true);
            jTable16.setEnabled(true);
            jTable17.setEnabled(true);
            jButton34.setEnabled(true);
            jButton35.setEnabled(true);
            jButton39.setEnabled(true);
            jButton40.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here
        pit1.removeAllFromTable(jTable16);
        if(jComboBox8.getSelectedIndex()==0){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM CUSTOMER,SUPPLIER,EMPLOYEE,BONDS,OTHER GROUP BY NIC");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox8.getSelectedIndex()==1){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM CUSTOMER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox8.getSelectedIndex()==2){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM SUPPLIER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox8.getSelectedIndex()==3){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM EMPLOYEE");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox8.getSelectedIndex()==4){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM BONDS");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else if(jComboBox8.getSelectedIndex()==5){
            try {
                pitf1.putTableFromDB(jTable16, "SELECT * FROM OTHER");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        //DefaultTableModel dtm = jTable17.getModel();
        try{
            pit1.putInTable2(jTable17, String.valueOf(jTable16.getValueAt(jTable16.getSelectedRow(), 0)), String.valueOf(jTable16.getValueAt(jTable16.getSelectedRow(), 1)));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jLabel131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseClicked
        // TODO add your handling code here:
        new Exit().setVisible(true);
        
    }//GEN-LAST:event_jLabel131MouseClicked

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
                Color a = jColorChooser1.getColor();
                jToolBar1.setBackground(a);
                jPanel1.setBackground(a);
                jToolBar2.setBackground(a);
                try{
                    db.putData("UPDATE COLORS SET A = '"+jColorChooser1.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
                Color b = jColorChooser2.getColor();
            
                jTabbedPane1.setBackground(b);
                jPanel4.setBackground(b);
                jPanel5.setBackground(b);
                try{
                    db.putData("UPDATE COLORS SET B = '"+jColorChooser2.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
                
                try{
                    
                Color c = jColorChooser3.getColor();
                Calculator.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                Color c = jColorChooser3.getColor();
                    
                PPList.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    
                Color c = jColorChooser3.getColor();
                PRList.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    
                Color c = jColorChooser3.getColor();
                home.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }

                try{
                    db.putData("UPDATE COLORS SET C = '"+jColorChooser3.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
                Color d = jColorChooser4.getColor();
                jTabbedPane2.setBackground(d);
                jTabbedPane3.setBackground(d);
                jTabbedPane4.setBackground(d);
                jTabbedPane5.setBackground(d);
                jTabbedPane6.setBackground(d);
                jTabbedPane7.setBackground(d);
                jTabbedPane8.setBackground(d);
                jTabbedPane9.setBackground(d);
                jTabbedPane10.setBackground(d);
                jTabbedPane11.setBackground(d);
                jTabbedPane12.setBackground(d);
                jPanel21.setBackground(d);
                //jDesktopPane1.setBackground(d);
                try{
                    db.putData("UPDATE COLORS SET E = '"+jColorChooser5.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
                Color e = jColorChooser5.getColor();
                jPanel12.setBackground(e);
                jPanel13.setBackground(e);
                jPanel14.setBackground(e);
                jPanel15.setBackground(e);
                jPanel16.setBackground(e);
                jPanel17.setBackground(e);
                jPanel18.setBackground(e);
                jPanel19.setBackground(e);
                jPanel20.setBackground(e);
                jPanel22.setBackground(e);
                jPanel23.setBackground(e);
                jPanel25.setBackground(e);
                jPanel26.setBackground(e);
                jPanel27.setBackground(e);
                jPanel28.setBackground(e);
                jPanel29.setBackground(e);
                jPanel30.setBackground(e);
                jPanel31.setBackground(e);
                jPanel32.setBackground(e);
                jPanel33.setBackground(e);
                jPanel34.setBackground(e);
                jPanel35.setBackground(e);
                jPanel36.setBackground(e);
                jPanel37.setBackground(e);
                jPanel38.setBackground(e);
                jPanel39.setBackground(e);
                jPanel40.setBackground(e);
                jPanel41.setBackground(e);
                jPanel42.setBackground(e);
                jPanel43.setBackground(e);
                jPanel44.setBackground(e);
                jPanel45.setBackground(e);
                jPanel46.setBackground(e);
                jPanel47.setBackground(e);
                jPanel48.setBackground(e);
                jPanel49.setBackground(e);
                jPanel50.setBackground(e);
                jPanel51.setBackground(e);
                jPanel52.setBackground(e);
                jPanel53.setBackground(e);
                jPanel54.setBackground(e);
                jPanel55.setBackground(e);
                jPanel56.setBackground(e);
                jPanel57.setBackground(e);
                jPanel58.setBackground(e);
                sell.setBackground(e);
                purchase.setBackground(e);
                store.setBackground(e);
                accounts.setBackground(e);
                people.setBackground(e);
                settings.setBackground(e);
                easypay.setBackground(e);
                jPanel60.setBackground(e);
                jPanel61.setBackground(e);
                jPanel62.setBackground(e);
                jPanel63.setBackground(e);
                jPanel64.setBackground(e);
                jPanel65.setBackground(e);
                jPanel66.setBackground(e);
                jPanel67.setBackground(e);
                jPanel70.setBackground(e);
                jPanel71.setBackground(e);
                jPanel73.setBackground(e);
                jPanel74.setBackground(e);
                jPanel75.setBackground(e);
                jPanel76.setBackground(e);
                jPanel77.setBackground(e);
                jPanel78.setBackground(e);
                jPanel79.setBackground(e);
                jPanel80.setBackground(e);
                jPanel81.setBackground(e);
                jPanel82.setBackground(e);
                jPanel83.setBackground(e);
                jPanel84.setBackground(e);
                jPanel85.setBackground(e);
                jPanel86.setBackground(e);
                jPanel87.setBackground(e);
                jPanel88.setBackground(e);
                jPanel89.setBackground(e);
                jPanel90.setBackground(e);
                jPanel91.setBackground(e);
                StoreReports.jPanel2.setBackground(e);
                StoreReports.jPanel3.setBackground(e);
                StoreReports.jPanel5.setBackground(e);
                StoreReports.jPanel1.setBackground(e);
                
                try{
                    db.putData("UPDATE COLORS SET E = '"+jColorChooser5.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e1){
                    System.out.println(e1);
                }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
                Color f = jColorChooser6.getColor();
                jTable1.setBackground(f);
                jTable2.setBackground(f);
                jTable3.setBackground(f);
                jTable4.setBackground(f);
                jTable5.setBackground(f);
                jTable6.setBackground(f);
                jTable7.setBackground(f);
                jTable8.setBackground(f);
                jTable10.setBackground(f);
                jTable11.setBackground(f);
                jTable12.setBackground(f);
                jTable13.setBackground(f);
                jTable14.setBackground(f);
                jTable15.setBackground(f);
                jTable16.setBackground(f);
                jTable17.setBackground(f);
                jTable18.setBackground(f);
                try{
                    db.putData("UPDATE COLORS SET F = '"+jColorChooser6.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        Color f = new java.awt.Color(240, 240, 240);
                jTable1.setBackground(f);
                jTable2.setBackground(f);
                jTable3.setBackground(f);
                jTable4.setBackground(f);
                jTable5.setBackground(f);
                jTable6.setBackground(f);
                jTable7.setBackground(f);
                jTable8.setBackground(f);
                jTable10.setBackground(f);
                jTable11.setBackground(f);
                jTable12.setBackground(f);
                jTable13.setBackground(f);
                jTable14.setBackground(f);
                jTable15.setBackground(f);
                jTable16.setBackground(f);
                jTable17.setBackground(f);
                jTable18.setBackground(f);
                try{
                    db.putData("UPDATE COLORS SET F = '"+jColorChooser6.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        Color a = new java.awt.Color(240, 240, 240);
                jToolBar1.setBackground(a);
                jPanel1.setBackground(a);
                jToolBar2.setBackground(a);
                try{
                    db.putData("UPDATE COLORS SET A = '"+jColorChooser1.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        Color b = new java.awt.Color(240, 240, 240);
                jTabbedPane1.setBackground(b);
                jPanel4.setBackground(b);
                jPanel5.setBackground(b);
                try{
                    db.putData("UPDATE COLORS SET B = '"+jColorChooser2.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        Color c = new java.awt.Color(240, 240, 240);
                Calculator.jPanel2.setBackground(c);
                PPList.jPanel2.setBackground(c);
                PRList.jPanel2.setBackground(c);
                try{
                    
                Calculator.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    
                PPList.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    
                PRList.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    
                home.jPanel2.setBackground(c);
                }catch(Exception e){
                    System.out.println(e);
                }
                try{
                    db.putData("UPDATE COLORS SET C = '"+jColorChooser3.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        Color b = new java.awt.Color(240, 240, 240);
                jTabbedPane2.setBackground(b);
                jTabbedPane3.setBackground(b);
                jTabbedPane4.setBackground(b);
                jTabbedPane5.setBackground(b);
                jTabbedPane6.setBackground(b);
                jTabbedPane7.setBackground(b);
                jTabbedPane8.setBackground(b);
                jTabbedPane9.setBackground(b);
                jTabbedPane10.setBackground(b);
                jTabbedPane11.setBackground(b);
                jTabbedPane12.setBackground(b);                
                jTabbedPane12.setBackground(b);
                jPanel21.setBackground(b);
                //jDesktopPane1.setBackground(b);
                try{
                    db.putData("UPDATE COLORS SET D = '"+jColorChooser4.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        Color e = new java.awt.Color(240, 240, 240);
                jPanel12.setBackground(e);
                jPanel13.setBackground(e);
                jPanel14.setBackground(e);
                jPanel15.setBackground(e);
                jPanel16.setBackground(e);
                jPanel17.setBackground(e);
                jPanel18.setBackground(e);
                jPanel19.setBackground(e);
                jPanel20.setBackground(e);
                jPanel22.setBackground(e);
                jPanel23.setBackground(e);
                jPanel25.setBackground(e);
                jPanel26.setBackground(e);
                jPanel27.setBackground(e);
                jPanel28.setBackground(e);
                jPanel29.setBackground(e);
                jPanel30.setBackground(e);
                jPanel31.setBackground(e);
                jPanel32.setBackground(e);
                jPanel33.setBackground(e);
                jPanel34.setBackground(e);
                jPanel35.setBackground(e);
                jPanel36.setBackground(e);
                jPanel37.setBackground(e);
                jPanel38.setBackground(e);
                jPanel39.setBackground(e);
                jPanel40.setBackground(e);
                jPanel41.setBackground(e);
                jPanel42.setBackground(e);
                jPanel43.setBackground(e);
                jPanel44.setBackground(e);
                jPanel45.setBackground(e);
                jPanel46.setBackground(e);
                jPanel47.setBackground(e);
                jPanel48.setBackground(e);
                jPanel49.setBackground(e);
                jPanel50.setBackground(e);
                jPanel51.setBackground(e);
                jPanel52.setBackground(e);
                jPanel53.setBackground(e);
                jPanel54.setBackground(e);
                jPanel55.setBackground(e);
                jPanel56.setBackground(e);
                jPanel57.setBackground(e);
                jPanel58.setBackground(e);
                sell.setBackground(e);
                purchase.setBackground(e);
                store.setBackground(e);
                accounts.setBackground(e);
                people.setBackground(e);
                settings.setBackground(e);
                easypay.setBackground(e);
                jPanel60.setBackground(e);
                jPanel61.setBackground(e);
                jPanel62.setBackground(e);
                jPanel63.setBackground(e);
                jPanel64.setBackground(e);
                jPanel65.setBackground(e);
                jPanel66.setBackground(e);
                jPanel67.setBackground(e);
                jPanel70.setBackground(e);
                jPanel71.setBackground(e);
                jPanel73.setBackground(e);
                jPanel74.setBackground(e);
                jPanel75.setBackground(e);
                jPanel76.setBackground(e);
                jPanel77.setBackground(e);
                jPanel78.setBackground(e);
                jPanel79.setBackground(e);
                jPanel80.setBackground(e);
                jPanel81.setBackground(e);
                jPanel82.setBackground(e);
                jPanel83.setBackground(e);
                jPanel84.setBackground(e);
                jPanel85.setBackground(e);
                jPanel86.setBackground(e);
                jPanel87.setBackground(e);
                jPanel88.setBackground(e);
                jPanel89.setBackground(e);
                jPanel90.setBackground(e);
                jPanel91.setBackground(e);
                StoreReports.jPanel2.setBackground(e);
                StoreReports.jPanel3.setBackground(e);
                StoreReports.jPanel5.setBackground(e);
                StoreReports.jPanel1.setBackground(e);
                try{
                    db.putData("UPDATE COLORS SET E = '"+jColorChooser5.getColor().getRGB()+"' WHERE ID = 1");
                }catch(Exception e1){
                    System.out.println(e1);
                }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        pit1.removeAllFromTable(jTable18);
        pitf1.putTableFromDB(jTable18, "SELECT * FROM COLORS WHERE ID > 1");
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs = db.getData("SELECT * FROM COLORS WHERE ID = '"+jTable18.getValueAt(jTable18.getSelectedRow(), 0)+"'");
            while(rs.next()){
            db.putData("UPDATE COLORS SET A ='"+rs.getInt("A")+"',B='"+rs.getInt("B")+"',C='"+rs.getInt("C")+"',D='"+rs.getInt("D")+"',E='"+rs.getInt("E")+"',F='"+rs.getInt("F")+"' WHERE ID=1");
                Color a = new Color(rs.getInt("A"));
                Color b = new Color(rs.getInt("B"));
                Color c = new Color(rs.getInt("C"));
                Color d = new Color(rs.getInt("D"));
                Color ec = new Color(rs.getInt("E"));
                Color f = new Color(rs.getInt("F"));
                colorChooser(a, b, c, d, ec, f);
                logger("Applied "+rs.getString("NAME")+" Color Theme");
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
        
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        
        int key1 = JOptionPane.showConfirmDialog(this, "Will be Deleted, Are you Sure ?");
        if(key1==0){
            logger("Deleted Color Theme");
        try {
            db.putData("DELETE FROM COLORS WHERE ID = '"+jTable18.getValueAt(jTable18.getSelectedRow(), 0)+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        pit1.removeAllFromTable(jTable18);
        
        pitf1.putTableFromDB(jTable18, "SELECT * FROM COLORS WHERE ID > 1");
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        logger("Crated Color Theme "+jTextField63.getText());
        try {
            db.putData("INSERT INTO COLORS (NAME,A,B,C,D,E,F) VALUES ('"+jTextField63.getText()+"','"+jColorChooser1.getColor().getRGB()+"','"+jColorChooser2.getColor().getRGB()+"','"+jColorChooser3.getColor().getRGB()+"','"+jColorChooser4.getColor().getRGB()+"','"+jColorChooser5.getColor().getRGB()+"','"+jColorChooser6.getColor().getRGB()+"')");
            JOptionPane.showMessageDialog(this,"Succesfuly Saved");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        pit1.removeAllFromTable(jTable18);
        pitf1.putTableFromDB(jTable18, "SELECT * FROM COLORS WHERE ID > 1");
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
       Color def = new Color(240,240,240);
        colorChooser(def, def, def, def, def, def);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jLabel123MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseEntered
        // TODO add your handling code here:
        jLabel123.setBorder(boder1);
        jLabel123.setToolTipText("Product List");
    }//GEN-LAST:event_jLabel123MouseEntered

    private void jLabel124MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseEntered
        // TODO add your handling code here:
        jLabel124.setBorder(boder1);
        jLabel124.setToolTipText("New Transaction");
    }//GEN-LAST:event_jLabel124MouseEntered

    private void jLabel125MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseEntered
        // TODO add your handling code here:
        jLabel125.setBorder(boder1);
        jLabel125.setToolTipText("Manage People");
    }//GEN-LAST:event_jLabel125MouseEntered

    private void jLabel126MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseEntered
        // TODO add your handling code here:
        jLabel126.setBorder(boder1);
        jLabel126.setToolTipText("Attendence");
    }//GEN-LAST:event_jLabel126MouseEntered

    private void jLabel127MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel127MouseEntered
        // TODO add your handling code here:
        jLabel127.setBorder(boder1);
        jLabel127.setToolTipText("New Instalment");
    }//GEN-LAST:event_jLabel127MouseEntered

    private void jLabel128MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel128MouseEntered
        // TODO add your handling code here:
        jLabel128.setBorder(boder1);
        jLabel128.setToolTipText("Contacts");
    }//GEN-LAST:event_jLabel128MouseEntered

    private void jLabel129MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel129MouseEntered
        // TODO add your handling code here:
        jLabel129.setBorder(boder1);
        jLabel129.setToolTipText("New Email");
    }//GEN-LAST:event_jLabel129MouseEntered

    private void jLabel130MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel130MouseEntered
        // TODO add your handling code here:
        jLabel130.setBorder(boder1);
        jLabel130.setToolTipText("Massage Box");
    }//GEN-LAST:event_jLabel130MouseEntered

    private void jLabel122MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseEntered
        // TODO add your handling code here:
        jLabel122.setBorder(boder1);
        jLabel122.setToolTipText("Notes");
    }//GEN-LAST:event_jLabel122MouseEntered

    private void jLabel120MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseEntered
        // TODO add your handling code here:
        jLabel120.setBorder(boder1);
        jLabel120.setToolTipText("Product List");
    }//GEN-LAST:event_jLabel120MouseEntered

    private void jLabel121MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseEntered
        // TODO add your handling code here:
        jLabel121.setBorder(boder1);
        jLabel121.setToolTipText("People List");
    }//GEN-LAST:event_jLabel121MouseEntered

    private void jLabel123MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseExited
        // TODO add your handling code here:
        jLabel123.setBorder(boder2);
    }//GEN-LAST:event_jLabel123MouseExited

    private void jLabel124MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseExited
        // TODO add your handling code here:
        jLabel124.setBorder(boder2);
    }//GEN-LAST:event_jLabel124MouseExited

    private void jLabel125MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseExited
        // TODO add your handling code here:
        jLabel125.setBorder(boder2);
    }//GEN-LAST:event_jLabel125MouseExited

    private void jLabel126MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseExited
        // TODO add your handling code here:
        jLabel126.setBorder(boder2);
    }//GEN-LAST:event_jLabel126MouseExited

    private void jLabel127MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel127MouseExited
        // TODO add your handling code here:
        jLabel127.setBorder(boder2);
    }//GEN-LAST:event_jLabel127MouseExited

    private void jLabel128MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel128MouseExited
        // TODO add your handling code here:
        jLabel128.setBorder(boder2);
    }//GEN-LAST:event_jLabel128MouseExited

    private void jLabel129MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel129MouseExited
        // TODO add your handling code here:
        jLabel129.setBorder(boder2);
    }//GEN-LAST:event_jLabel129MouseExited

    private void jLabel130MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel130MouseExited
        // TODO add your handling code here:
        jLabel130.setBorder(boder2);
    }//GEN-LAST:event_jLabel130MouseExited

    private void jLabel122MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseExited
        // TODO add your handling code here:
        jLabel122.setBorder(boder2);
    }//GEN-LAST:event_jLabel122MouseExited

    private void jLabel120MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseExited
        // TODO add your handling code here:
        jLabel120.setBorder(boder2);
    }//GEN-LAST:event_jLabel120MouseExited

    private void jLabel121MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseExited
        // TODO add your handling code here:
        jLabel121.setBorder(boder2);
    }//GEN-LAST:event_jLabel121MouseExited

    private void jLabel117MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseEntered

        jLabel117.setToolTipText("Calculator");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel117MouseEntered

    private void jLabel120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseClicked
        // TODO add your handling code here:
        PRList pr = new PRList();
        
        
        Component[] c=jTabbedPane10.getComponents();
        boolean b=true;
        for (int j = 0; j < c.length; j++) {
                System.out.println(jTabbedPane10.getTitleAt(j));
            if(jTabbedPane10.getTitleAt(j).equals("Products")){
                b=false;
                jTabbedPane10.setSelectedIndex(j);
            }
        }
        if (b) {
        jTabbedPane10.add("Products",pr.jPanel2);
        try {
            ResultSet rs = db.getData("SELECT * FROM COLORS WHERE ID = '"+jTable18.getValueAt(jTable18.getSelectedRow(), 0)+"'");
            while(rs.next()){
                Color c1 = new Color(rs.getInt("C"));
                Calculator.jPanel2.setBackground(c1);
                PPList.jPanel2.setBackground(c1);
                PRList.jPanel2.setBackground(c1);
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
            jTabbedPane10.setSelectedComponent(pr.jPanel2);
        
        }
    }//GEN-LAST:event_jLabel120MouseClicked

    private void jLabel121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseClicked
        // TODO add your handling code here:
        PRList pp = new PRList();
        
        
        Component[] c=jTabbedPane10.getComponents();
        boolean b=true;
        for (int j = 0; j < c.length; j++) {
                System.out.println(jTabbedPane10.getTitleAt(j));
            if(jTabbedPane10.getTitleAt(j).equals("People")){
                b=false;
                jTabbedPane10.setSelectedIndex(j);
            }
        }
        if (b) {
        jTabbedPane10.add("People",pp.jPanel2);
        try {
            ResultSet rs = db.getData("SELECT * FROM COLORS WHERE ID = '"+jTable18.getValueAt(jTable18.getSelectedRow(), 0)+"'");
            while(rs.next()){
                Color c1 = new Color(rs.getInt("C"));
                Calculator.jPanel2.setBackground(c1);
                PPList.jPanel2.setBackground(c1);
                PRList.jPanel2.setBackground(c1);
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
        
            jTabbedPane10.setSelectedComponent(pp.jPanel2);
        }
    }//GEN-LAST:event_jLabel121MouseClicked

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        try{
            db.putData("UPDATE MSETTINGS SET SETTINGS = '"+jTextField65.getText()+"' WHERE ID = 0");
        }catch(Exception e1){
            System.out.println(e1);
        }
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        try{
            db.putData("UPDATE MSETTINGS SET SETTINGS = '"+new String(jPasswordField2.getPassword())+"' WHERE ID = 1");
        }catch(Exception e1){
            System.out.println(e1);
        }
        
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        // TODO add your handling code here:
        jPasswordField2.setText("password");
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        for(int n = 0; n<=jTable16.getRowCount();n++){
            
        try{
            pit1.putInTable2(jTable17, String.valueOf(jTable16.getValueAt(n, 0)), String.valueOf(jTable16.getValueAt(n, 1)));
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel dtm1 = (DefaultTableModel) jTable17.getModel();
            dtm1.removeRow(jTable17.getSelectedRow());
        
                                            
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        pit1.removeAllFromTable(jTable17);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        
        int key1 = JOptionPane.showConfirmDialog(this, "Do you want to Send this Email to Selected Recepients");
        if(key1==0){
        if(jRadioButton5.isSelected()){
            try{
            ResultSet rs1 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 0");
            ResultSet rs2 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 1");
            if(rs1.next() && rs2.next()){
                String[] eadd= new String[1];
                eadd[0]=jTextField57.getText();
                System.out.println("g="+rs1.getString("SETTINGS")+"p="+rs2.getString("SETTINGS")+"s="+eadd+"sub="+jTextField64.getText()+"bo="+jTextArea8.getText());
                email1.sendFromGMail(rs1.getString("SETTINGS"), rs2.getString("SETTINGS"), eadd, jTextField64.getText(), jTextArea8.getText());
            }
            }catch(Exception e){
                System.out.println(e);
            
            }
        }else if(jRadioButton6.isSelected()){
            try{
            ResultSet rs1 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 0");
            ResultSet rs2 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 1");
            if(rs1.next() && rs2.next()){
                emladd=null;
                for(int n =0; n<=jTable16.getRowCount();n++){
                    emladd[n] = String.valueOf(jTable16.getValueAt(n, 1));
                }
                email1.sendFromGMail(rs1.getString("SETTINGS"), rs2.getString("SETTINGS"), emladd, jTextField64.getText(), jTextArea8.getText());
            }
            }catch(Exception e){
                System.out.println(e);
            
            }
        
        }else if(jRadioButton11.isSelected()){
            
            try{
            ResultSet rs1 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 0");
            ResultSet rs2 = db.getData("SELECT * FROM MSETTINGs WHERE ID = 1");
            if(rs1.next() && rs2.next()){
                emladd=null;
                for(int n =0; n<=jTable17.getRowCount();n++){
                    emladd[n] = String.valueOf(jTable17.getValueAt(n, 1));
                }
                email1.sendFromGMail(rs1.getString("SETTINGS"), rs2.getString("SETTINGS"), emladd, jTextField64.getText(), jTextArea8.getText());
            }
            }catch(Exception e){
                System.out.println(e);
            
            }
        }
    }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        new Filechoose().setVisible(true);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        try {
            //JRTableModelDataSource drts = 
            
                jTabbedPane13.removeAll();
                JRTableModelDataSource jtb = new JRTableModelDataSource(jTable1.getModel());
                    Map<String,Object> para = new HashMap<String, Object>();
                    JasperReport jp = JasperCompileManager.compileReport("C:\\axionreports/invoice2.jrxml");
                    para.put("cname", jTextField66.getText());
                    //ResultSet rs = db.getData("SELECT * FROM IMAGES WHERE ID = 0");
                    //RefrshP();
                    para.put("bill", jLabel12.getText());
                    para.put("pic", ico1);
                    para.put("tot", jLabel16.getText());
                    para.put("user", USER);
                    para.put("add", jTextField67.getText());
                    para.put("con", jTextField68.getText());
                    para.put("date", sdf3.format(date));
                    para.put("email", jTextField69.getText());
                    para.put("web", jTextField70.getText());
                    para.put("mas", jTextField71.getText());
                    
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jp, para,jtb);
                    //JasperViewer.viewReport(jasperPrint, true);
                    JRViewer v = new JRViewer(jasperPrint);
                    jTabbedPane13.add(v);
                    v.setZoomRatio((float)0.5);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        try {
            db.putData("UPDATE BILLSETTINGS SET NAME = '"+jTextField66.getText()+"', ADDS = '"+jTextField67.getText()+"', CON = '"+jTextField68.getText()+"', EML = '"+jTextField69.getText()+"', WEB = '"+jTextField70.getText()+"', MAS = '"+jTextField71.getText()+"' WHERE ID = 0");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        new Filechoose().setVisible(true);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        try {
            db.putData("UPDATE BILLSETTINGS SET NAME = '"+jTextField66.getText()+"', ADDS = '"+jTextField67.getText()+"', CON = '"+jTextField68.getText()+"', EML = '"+jTextField69.getText()+"', WEB = '"+jTextField70.getText()+"', MAS = '"+jTextField71.getText()+"' WHERE ID = 1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        try {
            //JRTableModelDataSource drts = 
            
                jTabbedPane13.removeAll();
                JRTableModelDataSource jtb = new JRTableModelDataSource(jTable1.getModel());
                    Map<String,Object> para = new HashMap<String, Object>();
                    JasperReport jp = JasperCompileManager.compileReport("C:\\axionreports/invoice2.jrxml");
                    para.put("cname", jTextField73.getText());
                    //ResultSet rs = db.getData("SELECT * FROM IMAGES WHERE ID = 0");
                    //RefrshP();
                    para.put("bill", jLabel19.getText());
                    para.put("pic", ico1);
                    para.put("tot", jLabel17.getText());
                    para.put("user", USER);
                    para.put("add", jTextField75.getText());
                    para.put("con", jTextField76.getText());
                    para.put("date", sdf3.format(date));
                    para.put("email", jTextField74.getText());
                    para.put("web", jTextField72.getText());
                    para.put("mas", jTextField77.getText());
                    
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jp, para,jtb);
                    //JasperViewer.viewReport(jasperPrint, true);
                    JRViewer v = new JRViewer(jasperPrint);
                    jTabbedPane14.add(v);
                    v.setZoomRatio((float)0.5);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jTextField72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField72ActionPerformed

    private void jLabel153MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel153MouseClicked
        // TODO add your handling code here:
        if(dec%2==1){
            dispose();
            setUndecorated(true);
            setVisible(true);
        }else{
            dispose();
            setUndecorated(false);
            setVisible(true);
        }
        dec++;
    }//GEN-LAST:event_jLabel153MouseClicked

    
    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxMenuItem1.isSelected()){
            jPanel4.setVisible(true);
        }else{
            jPanel4.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxMenuItem2.isSelected()){
            jPanel3.setVisible(true);
        }else{
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        new Filechooseimage().setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accounts;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JPanel easypay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JColorChooser jColorChooser4;
    private javax.swing.JColorChooser jColorChooser5;
    private javax.swing.JColorChooser jColorChooser6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    public static javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    public static javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    public static javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable18;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private com.toedter.calendar.JDateChooser jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JPanel people;
    private javax.swing.JPanel purchase;
    private javax.swing.JPanel sell;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel store;
    // End of variables declaration//GEN-END:variables
}
