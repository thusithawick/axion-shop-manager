/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package axion2014;

//import static axion2014.DashBoard.jLabel12;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Thusitha
 */


public class StoreReports extends javax.swing.JFrame {
    
            Date d3 = new Date();
            Date d4 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            int y=0;
            String dt = "2008-01-01";
            JDBC db = new JDBC();
            ResultSet rs;
            PutInTableFromDB pitf1 = new PutInTableFromDB();
            PutInTable pit1 = new PutInTable();
            
     public void loadreports(){
         aaappp1();
         aaappp2();
         aaappp3();
     }
            
     public void PieChart(String chartTitle) {
            //super(applicationTitle);
            // This will create the dataset 
            PieDataset dataset = createDataset();
            // based on the dataset we create the chart
            JFreeChart chart = createChart(dataset, chartTitle);
            // we put the chart into a panel
            //ChartPanel chartPanel = new ChartPanel(chart);
            // default size
            //chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
            // add it to our application
            //setContentPane(chartPanel);
            saveChart1(chart);
            
        }
     public void aaappp1(){
     //PRODUCTS PIE CHART
        
        PieChart("Store");
        
        //TABLE
        
                Date d5 = new Date();
                try {
                    c.setTime(sdf.parse(sdf.format(d5)));
                } catch (ParseException ex) {
                    Logger.getLogger(StoreReports.class.getName()).log(Level.SEVERE, null, ex);
                }
                c.add(Calendar.MONTH, 1);  // number of days to add
                String d6 = sdf.format(c.getTime());
                pit1.removeAllFromTable(jTable2);
                pitf1.putTableFromDB(jTable2, "SELECT * FROM PRODUCTS WHERE EXP BETWEEN '2014-01-01' AND '"+d6+"' ORDER BY EXP ASC");
                
        //MINIMUM
                
                
                DefaultCategoryDataset categoryDataset3 = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS ORDER BY UNITS ASC LIMIT 10");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset3.setValue(rs1.getInt("UNITS"), rs1.getString("NAME"), rs1.getString("NAME"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
                
            JFreeChart chart = ChartFactory.createBarChart
                ("Store Filled With", // Title
                "Product",  // X-Axis label
                "Quantity",// Y-Axis label
                categoryDataset3,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart3(chart);
                
                //Maximum
                
                
                DefaultCategoryDataset categoryDataset4 = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS ORDER BY UNITS DESC LIMIT 10");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset4.setValue(rs1.getInt("UNITS"), rs1.getString("NAME"), rs1.getString("NAME"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
                
            JFreeChart chart1 = ChartFactory.createBarChart
                ("Store Out Of", // Title
                "Product",  // X-Axis label
                "Quantity",// Y-Axis label
                categoryDataset3,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart4(chart1);
     }
     
     public void aaappp2(){
     
        //try {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
            Date d7 = new Date();
                try {
                    ResultSet rs1 = db.getData("SELECT SUM(INCOME), SUM(WAGES), SDATE FROM BILL WHERE DATE BETWEEN '2014-01-01' AND '"+sdf.format(d7)+"' GROUP BY SDATE");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset.setValue(rs1.getInt("SUM(WAGES)"), "Wages", rs1.getString("SDATE"));
                        categoryDataset.setValue(rs1.getInt("SUM(INCOME)"), "Income", rs1.getString("SDATE"));
                    }
                    /*if(rs1.next()){
                        categoryDataset.setValue(rs1.getDouble("SUM(INCOME)"), dt, c.getTime());
                    }else{
                        categoryDataset.setValue(0, dt, c.getTime());
                    
                    }*/
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                       // categoryDataset.setValue(100, "fgfgdg", "gsfgs");
                }
                
                        /*categoryDataset.setValue(100, "fgfgdg", "gsfgs");
                        categoryDataset.setValue(342, "242r", "ge2r");
                        categoryDataset.setValue(544, "sfaa", "gsf3gs");*/
                
                
                //}
            JFreeChart chart = ChartFactory.createLineChart
                ("Accounts", // Title
                "Date",  // X-Axis label
                "Income",// Y-Axis label
                categoryDataset,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart(chart);
         /*} catch (Exception ex) {
             System.out.println(ex);
         }*/
        
     }
     
     public void aaappp3(){
         Date d7 = new Date();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT COUNT(BILLID),COUNT(INCOME),COUNT(WAGES),SDATE FROM BILL WHERE DATE BETWEEN '2014-01-01' AND '"+sdf.format(d7)+"' GROUP BY SDATE");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset.setValue(rs1.getInt("COUNT(BILLID)"), "Bills", rs1.getString("SDATE"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
            JFreeChart chart = ChartFactory.createLineChart
                ("Daily Bills Count", // Title
                "Date",  // X-Axis label
                "Income",// Y-Axis label
                categoryDataset,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart5(chart);
        
        
     }
     
     private PieDataset createDataset(){
        DefaultPieDataset result = new DefaultPieDataset();
         try {
                    ResultSet rs1 = db.getData("SELECT SUM(UNITS), CATEGORY FROM PRODUCTS GROUP BY CATEGORY");
                    while(rs1.next()){
                        System.out.println("begun");
                        if(rs1.getString("CATEGORY")==null){
                        result.setValue("Other",rs1.getDouble("SUM(UNITS)"));
                        }else{
                        result.setValue(rs1.getString("CATEGORY"),rs1.getDouble("SUM(UNITS)"));
                        }
                    }
         } catch (Exception e) {
             System.out.println(e);
         }
        //result.setValue("Linux", 29);
        return result;
        }
     private JFreeChart createChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart(title,  // chart title
        dataset,  // data
        true,  // include legend
        true,
            false);
        /*PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);*/
        return chart;
        }
    /**
     * Creates new form StoreReports
     */
    public StoreReports() {
        initComponents();
    }
    public void saveChart(JFreeChart chart){
            String fileName="D:/myCategoryChart.jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(fileName), chart, 640, 480);
                jLabel3.setIcon(new ImageIcon(ImageIO.read(new File("D:/myCategoryChart.jpg")).getScaledInstance(jLabel3.getWidth()-5, jLabel3.getHeight()-5, Image.SCALE_SMOOTH)));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Problem occurred creating chart.");
            }
    }
    
    public void saveChart1(JFreeChart chart){
            String fileName="D:/Store1.jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(fileName), chart, 640, 480);
                System.out.println("print");
                jLabel4.setIcon(new ImageIcon(ImageIO.read(new File("D:/Store1.jpg")).getScaledInstance(jLabel4.getWidth()-5, jLabel4.getHeight()-5, Image.SCALE_SMOOTH)));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Problem occurred creating chart.");
            }
    }
    
    public void saveChart3(JFreeChart chart){
            String fileName="D:/Store2.jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(fileName), chart, 640, 480);
                System.out.println("print");
                jLabel5.setIcon(new ImageIcon(ImageIO.read(new File("D:/Store2.jpg")).getScaledInstance(jLabel5.getWidth()-5, jLabel5.getHeight()-5, Image.SCALE_SMOOTH)));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Problem occurred creating chart.");
            }
    }
    
    public void saveChart4(JFreeChart chart){
            String fileName="D:/Store3.jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(fileName), chart, 640, 480);
                System.out.println("print");
                jLabel6.setIcon(new ImageIcon(ImageIO.read(new File("D:/Store3.jpg")).getScaledInstance(jLabel6.getWidth()-5, jLabel6.getHeight()-5, Image.SCALE_SMOOTH)));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Problem occurred creating chart.");
            }
    }
    
    
    public void saveChart5(JFreeChart chart){
            String fileName="D:/Store4.jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(fileName), chart, 640, 480);
                System.out.println("print");
                jLabel7.setIcon(new ImageIcon(ImageIO.read(new File("D:/Store4.jpg")).getScaledInstance(jLabel3.getWidth()-5, jLabel3.getHeight()-5, Image.SCALE_SMOOTH)));
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Problem occurred creating chart.");
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(714, 490));

        jLabel4.setToolTipText("Product Categories and Units in Store");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setMaximumSize(new java.awt.Dimension(18, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(3, 3));

        jLabel5.setToolTipText("Store is Full with this Products");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setToolTipText("Store is Out of These Products");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable2.setBackground(new java.awt.Color(255, 153, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "UNITS", "EXP"
            }
        ));
        jTable2.setToolTipText("Products Expired and Expiring in a Month");
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Products", jPanel3);

        jLabel1.setText("FROM :");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("TO :");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jButton1.setText("BUILD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setToolTipText("Accounts of all Income and Wages");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Accounts Chart", jPanel2);

        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setToolTipText("Daily Issued Bills");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDateChooser3.setDateFormatString("yyyy-MM-dd");

        jDateChooser4.setDateFormatString("yyyy-MM-dd");

        jLabel8.setText("FROM :");

        jLabel9.setText("TO :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(11, 11, 11)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sales", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //try {
        Date d1 = jDateChooser1.getDate();
        Date d2 = jDateChooser2.getDate();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
            /*for(int x = 0;x<=(d2.getDate()-d1.getDate());x++){
                y = d3.getDate()+x;
                c.setTime(sdf.parse(sdf.format(d1)));
                c.add(Calendar.DATE, y);  // number of days to add
                dt = sdf.format(c.getTime());*/
                try {
                    ResultSet rs1 = db.getData("SELECT SUM(INCOME), SUM(WAGES), SDATE FROM BILL WHERE DATE BETWEEN '"+sdf.format(d1)+"' AND '"+sdf.format(d2)+"' GROUP BY SDATE");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset.setValue(rs1.getInt("SUM(WAGES)"), "Wages", rs1.getString("SDATE"));
                        categoryDataset.setValue(rs1.getInt("SUM(INCOME)"), "Income", rs1.getString("SDATE"));
                    }
                    /*if(rs1.next()){
                        categoryDataset.setValue(rs1.getDouble("SUM(INCOME)"), dt, c.getTime());
                    }else{
                        categoryDataset.setValue(0, dt, c.getTime());
                    
                    }*/
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                       // categoryDataset.setValue(100, "fgfgdg", "gsfgs");
                }
                
                        /*categoryDataset.setValue(100, "fgfgdg", "gsfgs");
                        categoryDataset.setValue(342, "242r", "ge2r");
                        categoryDataset.setValue(544, "sfaa", "gsf3gs");*/
                
                
                //}
            JFreeChart chart = ChartFactory.createLineChart
                ("Accounts", // Title
                "Date",  // X-Axis label
                "Income",// Y-Axis label
                categoryDataset,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart(chart);
         /*} catch (Exception ex) {
             System.out.println(ex);
         }*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:''
        //PRODUCTS PIE CHART
        
        PieChart("Store");
        
        //TABLE
        
                Date d5 = new Date();
                try {
                    c.setTime(sdf.parse(sdf.format(d5)));
                } catch (ParseException ex) {
                    Logger.getLogger(StoreReports.class.getName()).log(Level.SEVERE, null, ex);
                }
                c.add(Calendar.MONTH, 1);  // number of days to add
                String d6 = sdf.format(c.getTime());
                pit1.removeAllFromTable(jTable2);
                pitf1.putTableFromDB(jTable2, "SELECT * FROM PRODUCTS WHERE EXP BETWEEN '2014-01-01' AND '"+d6+"' ORDER BY EXP ASC");
                
        //MINIMUM
                
                
                DefaultCategoryDataset categoryDataset3 = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS ORDER BY UNITS ASC LIMIT 10");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset3.setValue(rs1.getInt("UNITS"), rs1.getString("NAME"), rs1.getString("NAME"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
                
            JFreeChart chart = ChartFactory.createBarChart
                ("Store Filled With", // Title
                "Product",  // X-Axis label
                "Quantity",// Y-Axis label
                categoryDataset3,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart3(chart);
                
                //Maximum
                
                
                DefaultCategoryDataset categoryDataset4 = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT * FROM PRODUCTS ORDER BY UNITS DESC LIMIT 10");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset4.setValue(rs1.getInt("UNITS"), rs1.getString("NAME"), rs1.getString("NAME"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
                
            JFreeChart chart1 = ChartFactory.createBarChart
                ("Store Out Of", // Title
                "Product",  // X-Axis label
                "Quantity",// Y-Axis label
                categoryDataset3,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart4(chart1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Date d1 = jDateChooser3.getDate();
        Date d2 = jDateChooser4.getDate();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
                try {
                    ResultSet rs1 = db.getData("SELECT COUNT(BILLID),COUNT(INCOME),COUNT(WAGES),SDATE FROM BILL WHERE DATE BETWEEN '"+sdf.format(d1)+"' AND '"+sdf.format(d2)+"' GROUP BY SDATE");
                    while(rs1.next()){
                        System.out.println("begun");
                        categoryDataset.setValue(rs1.getInt("COUNT(BILLID)"), "Bills", rs1.getString("SDATE"));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }finally{
                }
            JFreeChart chart = ChartFactory.createLineChart
                ("Daily Bills Count", // Title
                "Date",  // X-Axis label
                "Income",// Y-Axis label
                categoryDataset,  // Dataset
                PlotOrientation.VERTICAL,
                true,  // Show legend
                true,
                false
                );
                saveChart5(chart);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param NITSargs the command line arguments
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
            java.util.logging.Logger.getLogger(StoreReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
