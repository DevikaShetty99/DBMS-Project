/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Vector;
import oracle.jdbc.OracleDriver;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sneha
 */
public class VOLUNTEERS extends javax.swing.JFrame {

    /**
     * Creates new form VOLUNTEERS
     */
    public VOLUNTEERS() {
        initComponents();
        table_update();
    }
Connection con1;
        PreparedStatement insert;
        
        private void table_update()        
        {
            int c;
             try {
          DriverManager.registerDriver(new OracleDriver());
			
			con1=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "snehal", "snehal");
            insert = con1.prepareStatement("select * from volunteers order by vid");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Rss=rs.getMetaData();
            c=Rss.getColumnCount();
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            while(rs.next())
            {
                Vector v2=new Vector();
                for(int a=1;a<=c;a++)
                {
                    v2.add(rs.getString("vid"));
                     v2.add(rs.getString("vname"));
                     v2.add(rs.getString("vemail")); 
                     v2.add(rs.getString("vphone"));
                      v2.add(rs.getString("vloc"));
                }
                Df.addRow(v2);
                
            }
            
            
        } catch (SQLException ex) {
           ex.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel1.setText("VOLUNTEER TEAMS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 304, 57));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Volunteer ID", "Volunteer  Name", "Email", "Phone", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 530, 400));

        jButton1.setBackground(new java.awt.Color(51, 102, 0));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Location");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2EDIT.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new TEAMINFO().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name =jTextField1.getText();
         String vmail =jTextField2.getText();
          String vpho =jTextField3.getText();
           String vloc =jTextField4.getText();
         
  
 
        try {
          DriverManager.registerDriver(new OracleDriver());
			
			con1=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "snehal", "snehal");
            insert = con1.prepareStatement("insert into volunteers (vname,vemail,vphone,vloc)values(?,?,?,?)");
            
            insert.setString(1,name);
             insert.setString(2,vmail);
             insert.setString(3,vpho);
             insert.setString(4,vloc);
             
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Added");
            table_update();
            
              jTextField1.setText("");
              jTextField2.setText("");
              jTextField3.setText("");
              jTextField4.setText("");
             jTextField1.requestFocus();
             
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(this,"Please Check the Entered Details");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
        int selin=jTable1.getSelectedRow();
        jTextField1.setText(df.getValueAt(selin,1).toString());
        jTextField2.setText(df.getValueAt(selin,2).toString());
        jTextField3.setText(df.getValueAt(selin,3).toString());
        jTextField4.setText(df.getValueAt(selin,4).toString());
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         int selin=jTable1.getSelectedRow();
         try
         {
          int fid=Integer.parseInt(Df.getValueAt(selin, 0).toString());   
          String name =jTextField1.getText();
         String vmail =jTextField2.getText();
          String vpho =jTextField3.getText();
           String vloc =jTextField4.getText();
            DriverManager.registerDriver(new OracleDriver());
			
			con1=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "snehal", "snehal");
            insert = con1.prepareStatement("update volunteers set vname=?,vemail=?,vphone=?,vloc=? where vid=?");
            JOptionPane.showMessageDialog(this,"Record Updated");
            insert.setString(1,name);
             insert.setString(2,vmail);
             insert.setString(3,vpho);
             insert.setString(4,vloc);
             insert.setInt(5,fid);
                         insert.executeUpdate();

             table_update();
             jButton2.setEnabled(true);
             jTextField1.setText("");
              jTextField2.setText("");
              jTextField3.setText("");
              jTextField4.setText("");
             jTextField1.requestFocus();
             
         }
         catch(Exception e)
         {
           JOptionPane.showMessageDialog(this,"Please select the details to be edited");    
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         int selin=jTable1.getSelectedRow();
          try {
           int fid=Integer.parseInt(Df.getValueAt(selin, 0).toString());
           int dialogResult=JOptionPane.showConfirmDialog(null,"Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);
           if(dialogResult==JOptionPane.YES_OPTION)
           {
                 
          DriverManager.registerDriver(new OracleDriver());
			
			con1=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "snehal", "snehal");
            insert = con1.prepareStatement("delete from volunteers where vid=?");
            insert.setInt(1, fid);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted");
            table_update();
            jButton2.setEnabled(true);
              jTextField1.setText("");
               jTextField2.setText("");
                jTextField3.setText("");
                 jTextField4.setText("");
             jTextField1.requestFocus();
             
           }

            
         
             
        } catch (Exception ex) {
 JOptionPane.showMessageDialog(this,"Please select the Zone to be deleted");        }   
        table_update();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(VOLUNTEERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VOLUNTEERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VOLUNTEERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VOLUNTEERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VOLUNTEERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
