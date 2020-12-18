/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class JDBC {
    
    public Connection con()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/axiondb", "root", "123");
        return c;
    }
    public void putData(String sql)throws Exception{
        Statement st = con().createStatement();
        st.executeUpdate(sql);
    }
    public ResultSet getData(String sql)throws Exception{
        Statement st = con().createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }public void insertImage(String img){
                int len;
                String query;
                PreparedStatement pstmt;

                try{
                        File file = new File(img);
                        FileInputStream fis = new FileInputStream(file);
                        len = (int)file.length();

//                        query = ("UPDATE item SET image = ? WHERE ItemID = ?");
                        query = ("UPDATE IMAGES SET IMAGE = ? WHERE ID = 0");
                        pstmt = con().prepareStatement(query);

                        // Method used to insert a stream of bytes
                        pstmt.setBinaryStream(1, (InputStream)fis, len);
                        pstmt.executeUpdate();

                }catch (SQLException e){
                        e.printStackTrace();
                }catch (Exception e){
                        e.printStackTrace();
                }
        }

        public void getImageData()
        {

                 byte[] fileBytes;
                 String query = "SELECT IMAGE FROM IMAGES WHERE ID = 0";
                 try
                 {
                         Statement state = con().createStatement();
                         ResultSet rs = state.executeQuery(query);
                         if (rs.next())
                        {
                                  fileBytes = rs.getBytes("IMAGE");
                                  OutputStream targetFile=  
                                  new FileOutputStream("C:/Users/Axion/logo.jpg");

                                  targetFile.write(fileBytes);
                                  targetFile.close();
                        }        

                 }
                 catch (Exception e)
                 {
                         e.printStackTrace();
                 }
        }
    
}
