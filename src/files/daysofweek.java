/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class daysofweek extends javax.swing.JFrame {

    /**
     * Creates new form daysofweek
     */
   public  ArrayList<String> days=new ArrayList();
   int day,maxday;
    DefaultTableModel dy=new DefaultTableModel();
    public daysofweek() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bkpanel = new javax.swing.JPanel();
        hvpanel = new javax.swing.JPanel();
        pground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdays = new javax.swing.JTable();
        btsave = new javax.swing.JButton();
        lbinfo = new javax.swing.JLabel();
        day1 = new javax.swing.JCheckBox();
        day2 = new javax.swing.JCheckBox();
        day3 = new javax.swing.JCheckBox();
        day4 = new javax.swing.JCheckBox();
        day5 = new javax.swing.JCheckBox();
        day6 = new javax.swing.JCheckBox();
        day7 = new javax.swing.JCheckBox();
        main_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bkpanel.setBackground(new java.awt.Color(153, 153, 153));

        hvpanel.setBackground(new java.awt.Color(204, 204, 204));
        hvpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pground.setBackground(new java.awt.Color(204, 204, 204));
        pground.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Working days");

        tbdays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Working days"
            }
        ));
        jScrollPane1.setViewportView(tbdays);

        btsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btsave.setText("Save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        lbinfo.setBackground(new java.awt.Color(153, 255, 153));
        lbinfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        day1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day1.setText("Monday");
        day1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day1MouseClicked(evt);
            }
        });

        day2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day2.setText("Tuesday");
        day2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day2MouseClicked(evt);
            }
        });

        day3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day3.setText("Wenesday");
        day3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day3MouseClicked(evt);
            }
        });

        day4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day4.setText("Thursday");
        day4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day4MouseClicked(evt);
            }
        });

        day5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day5.setText("Friday");
        day5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day5MouseClicked(evt);
            }
        });

        day6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day6.setText("Saturday");
        day6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day6MouseClicked(evt);
            }
        });

        day7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        day7.setText("Sunday");
        day7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                day7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pgroundLayout = new javax.swing.GroupLayout(pground);
        pground.setLayout(pgroundLayout);
        pgroundLayout.setHorizontalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addComponent(lbinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pgroundLayout.createSequentialGroup()
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgroundLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day7)
                            .addComponent(day1)
                            .addComponent(day2)
                            .addComponent(day3)
                            .addComponent(day4)
                            .addComponent(day5)
                            .addComponent(day6))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pgroundLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        pgroundLayout.setVerticalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pgroundLayout.createSequentialGroup()
                        .addComponent(day1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsave)
                .addGap(3, 3, 3)
                .addComponent(lbinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hvpanelLayout = new javax.swing.GroupLayout(hvpanel);
        hvpanel.setLayout(hvpanelLayout);
        hvpanelLayout.setHorizontalGroup(
            hvpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hvpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        hvpanelLayout.setVerticalGroup(
            hvpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hvpanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        main_title.setText("WTM generator");

        javax.swing.GroupLayout bkpanelLayout = new javax.swing.GroupLayout(bkpanel);
        bkpanel.setLayout(bkpanelLayout);
        bkpanelLayout.setHorizontalGroup(
            bkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bkpanelLayout.createSequentialGroup()
                .addGroup(bkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bkpanelLayout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(main_title))
                    .addGroup(bkpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hvpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bkpanelLayout.setVerticalGroup(
            bkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bkpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(main_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hvpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
day=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total of periods per day:", "Total periods per day", HEIGHT));
maxday=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total of periods of subject per day:", "Total periods of subject per day", HEIGHT));
       shuffle.getdaysofweeks(days, day,maxday);
       dispose();

    }//GEN-LAST:event_btsaveActionPerformed

    private void day1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day1MouseClicked
        // TODO add your handling code here:
      if(day1.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day1.getText());
          Object[] row=new Object[1];
          row[0]=day1.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day1.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day1MouseClicked

    private void day2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day2MouseClicked
        // TODO add your handling code here:
        if(day2.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day2.getText());
          Object[] row=new Object[1];
          row[0]=day2.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day2.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day2MouseClicked

    private void day3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day3MouseClicked
        // TODO add your handling code here:
        if(day3.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day3.getText());
          Object[] row=new Object[1];
          row[0]=day3.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day3.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day3MouseClicked

    private void day4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day4MouseClicked
        // TODO add your handling code here:
        if(day4.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day4.getText());
          Object[] row=new Object[1];
          row[0]=day4.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day4.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day4MouseClicked

    private void day5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day5MouseClicked
        // TODO add your handling code here:
        if(day5.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day5.getText());
          Object[] row=new Object[1];
          row[0]=day5.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day5.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day5MouseClicked

    private void day6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day6MouseClicked
        // TODO add your handling code here:
        if(day6.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day6.getText());
          Object[] row=new Object[1];
          row[0]=day6.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day6.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day6MouseClicked

    private void day7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_day7MouseClicked
        // TODO add your handling code here:
        if(day7.isSelected())
      {
          Object[] col=new Object[1];
          col[0]="Working days";
          dy.setColumnIdentifiers(col);
          days.add(day7.getText());
          Object[] row=new Object[1];
          row[0]=day7.getText();
          dy.addRow(row);
          tbdays.setModel(dy);
      }
      else
      {
          for(int s=0;s<days.size();s++)
          {
              if(days.get(s).equals(day7.getText()))
              {
                  days.remove(s);
                  dy.removeRow(s);
                  tbdays.setModel(dy);
              }
          }
      }
    }//GEN-LAST:event_day7MouseClicked

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
            java.util.logging.Logger.getLogger(daysofweek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daysofweek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daysofweek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daysofweek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daysofweek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bkpanel;
    private javax.swing.JButton btsave;
    private javax.swing.JCheckBox day1;
    private javax.swing.JCheckBox day2;
    private javax.swing.JCheckBox day3;
    private javax.swing.JCheckBox day4;
    private javax.swing.JCheckBox day5;
    private javax.swing.JCheckBox day6;
    private javax.swing.JCheckBox day7;
    private javax.swing.JPanel hvpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JLabel main_title;
    private javax.swing.JPanel pground;
    private javax.swing.JTable tbdays;
    // End of variables declaration//GEN-END:variables
}
