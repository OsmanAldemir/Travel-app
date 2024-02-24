/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Arayuz;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class insideAdmin extends javax.swing.JFrame {
   DefaultListModel model;

    public insideAdmin() {
        initComponents();
        model = new DefaultListModel();
        listFirma.setModel(model);
       Verilerigöster();
    }
    
    public void Verilerigöster(){

     for(Company a:main.sirketler){
         model.addElement(a.getkad());
     }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFirma = new javax.swing.JList<>();
        btnFirmaEkle = new javax.swing.JButton();
        btnFirmaSil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblHizmetBedeli = new javax.swing.JLabel();
        txtfldHizmetBedeli = new javax.swing.JTextField();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listFirma);

        btnFirmaEkle.setText("Firma Ekle");
        btnFirmaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmaEkleActionPerformed(evt);
            }
        });

        btnFirmaSil.setText("Firma Sil");
        btnFirmaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmaSilActionPerformed(evt);
            }
        });

        jLabel1.setText("Firmalar");

        lblHizmetBedeli.setText("Hizmet Bedeli:");

        txtfldHizmetBedeli.setText("1000");
        txtfldHizmetBedeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldHizmetBedeliActionPerformed(evt);
            }
        });

        btn_geri.setText("Geri");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFirmaSil)
                                    .addComponent(btnFirmaEkle)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_geri)))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblHizmetBedeli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtfldHizmetBedeli, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_geri)
                        .addGap(34, 34, 34)
                        .addComponent(btnFirmaEkle)
                        .addGap(43, 43, 43)
                        .addComponent(btnFirmaSil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHizmetBedeli)
                    .addComponent(txtfldHizmetBedeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirmaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmaEkleActionPerformed
     
           String username = JOptionPane.showInputDialog("Lütfen eklemek istediğiniz firmanın kullanıcı adını giriniz:");
           String password = JOptionPane.showInputDialog("Lütfen eklemek istediğiniz firmanın sifresini giriniz:");

        if (username != null && !username.trim().isEmpty()) {
            model.addElement(username);
            Company company = new Company(username,password);
            main.sirketler.add(company);
           // listFirma.validate();
            //listFirma.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Geçerli bir firma adı girmelisiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFirmaEkleActionPerformed

    private void btnFirmaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmaSilActionPerformed
       
         int selectedFirmaIndex = listFirma.getSelectedIndex();

        if (selectedFirmaIndex == -1 && model.getSize() != 0) {
            JOptionPane.showMessageDialog(this, "Lütfen bir firma seçiniz.", "HATA", JOptionPane.ERROR_MESSAGE);
        } else {
            main.sirketler.remove(selectedFirmaIndex);
        }
    }//GEN-LAST:event_btnFirmaSilActionPerformed

    private void txtfldHizmetBedeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldHizmetBedeliActionPerformed
       int HizmetBedeli = 1000;
       HizmetBedeli = Integer.parseInt((txtfldHizmetBedeli.getText()));  
    }//GEN-LAST:event_txtfldHizmetBedeliActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        AdminFrame geri = new AdminFrame();
        geri.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_geriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insideAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirmaEkle;
    private javax.swing.JButton btnFirmaSil;
    private javax.swing.JButton btn_geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHizmetBedeli;
    private javax.swing.JList<String> listFirma;
    private javax.swing.JTextField txtfldHizmetBedeli;
    // End of variables declaration//GEN-END:variables
}
