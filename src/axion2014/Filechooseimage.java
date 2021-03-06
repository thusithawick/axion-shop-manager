/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;




/**
 *
 * @author Thusitha
 */
public class Filechooseimage extends javax.swing.JFrame {
    DBTableToTable d = new DBTableToTable();
    JDBC db = new JDBC();
    public void insert(String s) throws Exception{
        
        Connection con = db.con();
        con.setAutoCommit(false);
        String INSERT_PICTURE="UPDATE IMAGES SET IMAGE = ? WHERE ID = 0";
         
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try
        {
            con.setAutoCommit(false);
            File file = new File(s);
            fis = new FileInputStream(file);
            ps = con.prepareStatement(INSERT_PICTURE);
            ps.setBinaryStream(2, fis, (int) file.length());
            ps.executeUpdate();
            con.commit();
        }
        finally{   if (ps != null) {
            ps.close();
            }
            if (fis != null) {
            fis.close();
        }
        }
    }
    
    public void insertImage(String img) {
 int len;
 Connection conn;
        try {
            conn = db.con();
 String query;
 PreparedStatement pstmt;
 try {
  File file = new File(img);
  FileInputStream fis = new FileInputStream(file);
  len = (int) file.length();
  query = ("UPDATE IMAGES SET IMAGE = ? WHERE ID = 0");
  pstmt = conn.prepareStatement(query);
  pstmt.setBinaryStream(1, fis, len);
  pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
 } catch (Exception e) {
            System.out.println(e);
  }
}
    
    public void getImageData() {
        byte[] fileBytes;
        String query;
        Connection conn;
        try {
            conn = db.con();
        
        try {
    query = "SELECT IMAGE FROM IMAGES WHERE ID = 0";
    Statement state = conn.createStatement();
    ResultSet rs = state.executeQuery(query);
    if (rs.next()) {
    fileBytes = rs.getBytes(1);
    OutputStream targetFile = new FileOutputStream("d://camImg.JPG");
    targetFile.write(fileBytes);
    targetFile.close();
     }} catch (Exception ex) {
            System.out.println(ex);
        }
    } catch (Exception e) {
            System.out.println(e);
     }
   }

    
    
    
    /**
     * Creates new form Filechoose
     */
    public Filechooseimage() {
        initComponents();
        setBounds(200, 125,781,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        try{
                BufferedImage img = null;
                img = ImageIO.read(new File(jFileChooser1.getSelectedFile().getPath()));
                Image dimg = img.getScaledInstance(DashBoard.jPanel21.getWidth(), DashBoard.jPanel21.getHeight(),Image.SCALE_SMOOTH);
                DashBoard.jPanel21.add(new JLabel(new ImageIcon(dimg)));
        }catch (Exception e){
            System.out.println(e);
        }
        dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Filechooseimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filechooseimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filechooseimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filechooseimage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filechooseimage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
