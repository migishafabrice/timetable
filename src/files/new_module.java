/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.awt.Color;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public final class new_module extends javax.swing.JFrame {

    /**
     * Creates new form new_module
     */
    public new_module()
    {
        initComponents();
        load_depart();
        load_trainer();
        load_module();
    }
    public void load_module()
{
    DefaultTableModel t=new DefaultTableModel();
    Object[] col=new Object[5];
        col[0]="Code";
        col[1]="Name";
        col[2]="Periods/week";
        col[3]="Level";
        col[4]="Teacher";
        t.setColumnIdentifiers(col);
        Path p;
        try{
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("module.txt");
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
        Object[] elements=new Object[5];
        String[] parts;
        for(int a=0;a<ls.size();a++)
        {
        parts=ls.get(a).split(",");
         //JOptionPane.showMessageDialog(null, ls.get(a));   
        elements[0]=parts[0];
         elements[1]=parts[1];
          elements[2]=parts[2];
          elements[3]=parts[4];
          elements[4]=parts[5];
        t.addRow(elements);
        }
       tbmodule.setModel(t);
        }
        }
        catch(IOException e)
        {
            
        }
}
    public void load_level(String go)
    {
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
        DefaultListModel ls=new DefaultListModel();
        while((search=rd.readLine())!=null)
        {
           
            if(is && ! search.isEmpty())
            {
                String[] lines=search.split(",");
                if(lines[2].trim().equalsIgnoreCase(go.trim()))
                {
               ls.addElement(lines[1].trim());
                }
               continue;
            }
            
            if(search.contains(s))
            {
                is=true;
                rd.readLine();
                //rd.readLine();
            }
            
        }
       lslevel.setModel(ls);
        }
        }
        catch(IOException e)
        {
            
        }
    }
public void load_depart()
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
           
           
            if(is && ! search.isEmpty())
            {
                
               ls.addElement(search);
               continue;
            }
            
             if(search.contains(s))
            {
                is=true;
                rd.readLine();
                //rd.readLine();
            }
            
        }
       lsdepart.setModel(ls);
        }
        }
        catch(IOException e)
        {
            
        }
    }
public void load_trainer()
    {
        Path p;
        try{
        p =Paths.get("trainer.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
        String s="TRAINERS";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
        FileReader fr=new FileReader("trainer.txt");
        BufferedReader rd=new BufferedReader(fr);
        boolean is=false;
        String search;
        DefaultListModel ls=new DefaultListModel();
        while((search=rd.readLine())!=null)
        {
            
            if(is && ! search.isEmpty() )
            {
                String line[]=search.split(", ");
               ls.addElement(line[1]);
               continue;
            }
            
            if(search.contains(s))
            {
                is=true;
                rd.readLine();
                //rd.readLine();
            }
            
        }
       lstrainer.setModel(ls);
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
        lbdepart = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmodule = new javax.swing.JTable();
        btsave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsdepart = new javax.swing.JList<>();
        lbinfo = new javax.swing.JLabel();
        lbvmanager1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstrainer = new javax.swing.JList<>();
        lbmanager1 = new javax.swing.JLabel();
        txthr = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lslevel = new javax.swing.JList<>();
        lblevel = new javax.swing.JLabel();
        main_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bkpanel.setBackground(new java.awt.Color(153, 153, 153));

        hvpanel.setBackground(new java.awt.Color(204, 204, 204));
        hvpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pground.setBackground(new java.awt.Color(204, 204, 204));
        pground.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Module record");

        lbname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbname.setText("Name:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        lbmanager.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbmanager.setText("Code:");

        lbdepart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbdepart.setText("Department:");

        tbmodule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modules"
            }
        ));
        jScrollPane1.setViewportView(tbmodule);

        btsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btsave.setText("Save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        lsdepart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lsdepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsdepartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lsdepart);

        lbinfo.setBackground(new java.awt.Color(153, 255, 153));
        lbinfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbvmanager1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbvmanager1.setText("Trainer:");

        lstrainer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(lstrainer);

        lbmanager1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbmanager1.setText("Hrs/week:");

        lslevel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(lslevel);

        lblevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblevel.setText("Level:");

        javax.swing.GroupLayout pgroundLayout = new javax.swing.GroupLayout(pground);
        pground.setLayout(pgroundLayout);
        pgroundLayout.setHorizontalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgroundLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbmanager)
                    .addComponent(lbname)
                    .addComponent(lbdepart)
                    .addComponent(lbvmanager1)
                    .addComponent(lbmanager1)
                    .addComponent(lblevel))
                .addGap(25, 25, 25)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(txtname)
                        .addComponent(txthr, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pgroundLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addComponent(lbinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        pgroundLayout.setVerticalGroup(
            pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgroundLayout.createSequentialGroup()
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbname)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbmanager)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbmanager1)
                            .addComponent(txthr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pgroundLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbdepart)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pgroundLayout.createSequentialGroup()
                                .addComponent(lblevel)
                                .addGap(36, 36, 36)))
                        .addGroup(pgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pgroundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lbvmanager1))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsave)
                .addGap(0, 0, Short.MAX_VALUE)
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
        try{
            File f=new File("module.txt");
                if(f.exists())
                {
        p =Paths.get("module.txt");
        List<String> l=Files.lines(p).collect(Collectors.toList());
       String s="MODULES";
        boolean in=l.stream().anyMatch(g->g.equals(s));
        if(in)
        {
         FileWriter wr;
            BufferedWriter br;
           
                
                    wr=new FileWriter(f,true);
                    br=new BufferedWriter(wr);
                    br.newLine();
                    br.write(txtcode.getText()+",\t"+txtname.getText()+",\t"+txthr.getText()+", \t"+lsdepart.getSelectedValue()+", \t"+lslevel.getSelectedValue()+", \t"+lstrainer.getSelectedValue());
                    lbinfo.setText("Module added");
                    lbinfo.setForeground(Color.blue);
                    br.close();
                    
                 }
        else
        {
           FileWriter wr;
            BufferedWriter br;
           
                
                    wr=new FileWriter(f,true);
                    br=new BufferedWriter(wr);
                    br.write("MODULES");
                    br.newLine();
                    br.write("");
                    br.newLine();
                    br.write(txtcode.getText()+",\t"+txtname.getText()+",\t"+txthr.getText()+", \t"+lsdepart.getSelectedValue()+", \t"+lslevel.getSelectedValue()+", \t"+lstrainer.getSelectedValue());
                    lbinfo.setText("Module added");
                    lbinfo.setForeground(Color.blue);
                    br.close();  
        }
            
       
        //lslevel.setModel(ls);
        }
        else
        {
            PrintWriter wr;
           
        wr=new PrintWriter("module.txt");
                     wr.println("MODULES");
                    wr.println("");
                    
                   wr.write(txtcode.getText()+",\t"+txtname.getText()+",\t"+txthr.getText()+", \t"+lsdepart.getSelectedValue()+", \t"+lslevel.getSelectedValue()+", \t"+lstrainer.getSelectedValue());
                    
                    wr.close();  
                    
                   
                    lbinfo.setText("Module added");
                    lbinfo.setForeground(Color.blue);
        }
        }
        catch( IOException e)
        {
       JOptionPane.showMessageDialog(null, e);
        }
        


    }//GEN-LAST:event_btsaveActionPerformed

    private void lsdepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsdepartMouseClicked
        // TODO add your handling code here:
        String v=lsdepart.getSelectedValue();
        load_level(v);
    }//GEN-LAST:event_lsdepartMouseClicked

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
            java.util.logging.Logger.getLogger(new_module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_module().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbdepart;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JLabel lblevel;
    private javax.swing.JLabel lbmanager;
    private javax.swing.JLabel lbmanager1;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbvmanager1;
    private javax.swing.JList<String> lsdepart;
    private javax.swing.JList<String> lslevel;
    private javax.swing.JList<String> lstrainer;
    private javax.swing.JLabel main_title;
    private javax.swing.JPanel pground;
    private javax.swing.JTable tbmodule;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txthr;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
