/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.awt.Color;
import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author Acer
 */
public class new_level extends javax.swing.JFrame {

    /**
     * Creates new form new_level
     */
    ArrayList<String> level;
    public new_level() {
        initComponents();
        load();
    }
public void load_level(String se)
{
     DefaultTableModel t=new DefaultTableModel();
    Object[] col=new Object[2];
        col[0]="Code";
        col[1]="Name";
        t.setColumnIdentifiers(col);
        Path p;
        try{
        p =Paths.get("level.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="LEVELS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("level.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        ArrayList<String> ls=new ArrayList();
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
           
            if(is && !search.isEmpty())
            {
               ls.add(search);
            
            }
            
       }
        Object[] elements=new Object[2];
        String[] parts;
        for(int a=0;a<ls.size();a++)
        {
        parts=ls.get(a).split(",");
         //JOptionPane.showMessageDialog(null, ls.get(a));  
         if(parts[2].trim().equals(se))
         {
        elements[0]=parts[0].trim();
         elements[1]=parts[1].trim();
          t.addRow(elements);
         }
        }
       tblevel.setModel(t);
        }
        }
        catch(IOException e)
        {
            
        }
}
    public void load()
    {
        Path p;
        try{
        p =Paths.get("department.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="DEPARTMENTS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("department.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        DefaultListModel ls=new DefaultListModel();
        while((search=rd.readLine())!=null)
        {
            if(search.contains(s))
            {
                is=true;
                continue;
            }
           
            if(is && !search.isEmpty())
            {
               ls.addElement(search);
               
            }
        }
       lslevel.setModel(ls);
        }
        }
        catch(IOException e)
        {
            
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

        bkpanel = new javax.swing.JPanel();
        hvpanel = new javax.swing.JPanel();
        pground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbmanager = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        lbvmanager = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblevel = new javax.swing.JTable();
        btsave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lslevel = new javax.swing.JList<>();
        lbinfo = new javax.swing.JLabel();
        main_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bkpanel.setBackground(new java.awt.Color(153, 153, 153));

        hvpanel.setBackground(new java.awt.Color(204, 204, 204));
        hvpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pground.setBackground(new java.awt.Color(204, 204, 204));
        pground.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Level record");

        lbname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbname.setText("Name:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        lbmanager.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbmanager.setText("Code:");

        lbvmanager.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbvmanager.setText("Department:");

        tblevel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Levels"
            }
        ));
        jScrollPane1.setViewportView(tblevel);

        btsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btsave.setText("Save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        lslevel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lslevel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lslevelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lslevel);

        lbinfo.setBackground(new java.awt.Color(153, 255, 153));
        lbinfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pgroundLayout = new javax.swing.GroupLayout(pground);
        pground.setLayout(pgroundLayout);
        pgroundLayout.setHorizontalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbmanager)
                    .addComponent(lbname)
                    .addComponent(lbvmanager))
                .addGap(25, 25, 25)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(txtname)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pgroundLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addComponent(lbinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pgroundLayout.setVerticalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pgroundLayout.createSequentialGroup()
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbname)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbmanager)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbvmanager)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(pground, javax.swing.GroupLayout.PREFERRED_SIZE, 841, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        
        
        Path p;
        PrintWriter r=null;
        FileWriter fr=null;
            BufferedWriter br=null;
        File f=new File("level.txt");
            try {
                if(f.exists())
            {
                
                fr=new FileWriter(f,true);
                br=new BufferedWriter(fr);
        p =Paths.get("level.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="LEVELS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
                br.newLine();
                br.write(txtcode.getText()+", \t"+txtname.getText()+", \t"+lslevel.getSelectedValue());
                lbinfo.setText("Level added");
                lbinfo.setForeground(Color.blue);
               // fr.close();
               br.close();
            
        }
        else
        {       br.write("LEVELS");
                br.newLine();
                br.write("");
                br.newLine();
                br.write(txtcode.getText()+", \t"+txtname.getText()+", \t"+lslevel.getSelectedValue());
                lbinfo.setText("Level added");
                lbinfo.setForeground(Color.blue);
                
               // fr.close();
                br.close();   
        }
        
            }
                else
                {
                  
            
                r=new PrintWriter("level.txt");
                r.println("LEVELS");
                r.println("");
                r.println(txtcode.getText()+", \t"+txtname.getText()+", \t"+lslevel.getSelectedValue());
                lbinfo.setText("Level added");
                lbinfo.setForeground(Color.blue);
                r.close();
                }
                
               } catch (IOException e)
               {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
    }//GEN-LAST:event_btsaveActionPerformed

    private void lslevelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lslevelMouseClicked
        // TODO add your handling code here:
        load_level(lslevel.getSelectedValue());
    }//GEN-LAST:event_lslevelMouseClicked

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
            java.util.logging.Logger.getLogger(new_level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bkpanel;
    private javax.swing.JButton btsave;
    private javax.swing.JPanel hvpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JLabel lbmanager;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbvmanager;
    private javax.swing.JList<String> lslevel;
    private javax.swing.JLabel main_title;
    private javax.swing.JPanel pground;
    private javax.swing.JTable tblevel;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
