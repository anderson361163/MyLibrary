/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.interfaces;

import br.com.mylibrary.connection.Conexao;
import br.com.mylibrary.controller.controllerLibrary;
import br.com.mylibrary.daoMyLibrery.daoMyLibrary;
import br.com.mylibrary.model.Book;
import br.com.mylibrary.tablemodel.TableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class frmMyLibrary extends javax.swing.JFrame {

    /**
     * Creates new form frmMyLibrary
     */
    public frmMyLibrary() { 
        initComponents();
        controllerLibrary lib = new controllerLibrary();
        String aa = lib.selectionVersion().getSystem_version();
        txtVersion.setText(aa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plnMaster = new javax.swing.JPanel();
        plnCadastre = new javax.swing.JPanel();
        btnSalve = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModernize = new javax.swing.JButton();
        txtBookOwrne = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        plnSearch = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        lblFind = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLibrary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plnCadastre.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastre of Books"));

        btnSalve.setText("Salve");
        btnSalve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModernize.setText("Modernize");
        btnModernize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModernizeActionPerformed(evt);
            }
        });

        jLabel2.setText("Book Name:");

        jLabel3.setText("Book Owrne:");

        jLabel4.setText("Status:");

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selection a Option ---", "I've already read", "I'm reading", "I did not read" }));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jLabel6.setText("Data de Hoje:");

        javax.swing.GroupLayout plnCadastreLayout = new javax.swing.GroupLayout(plnCadastre);
        plnCadastre.setLayout(plnCadastreLayout);
        plnCadastreLayout.setHorizontalGroup(
            plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnCadastreLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plnCadastreLayout.createSequentialGroup()
                        .addComponent(btnSalve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModernize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(plnCadastreLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plnCadastreLayout.createSequentialGroup()
                        .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookOwrne)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plnCadastreLayout.createSequentialGroup()
                        .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdt)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        plnCadastreLayout.setVerticalGroup(
            plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnCadastreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookOwrne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(plnCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalve)
                    .addComponent(btnDelete)
                    .addComponent(btnModernize))
                .addGap(23, 23, 23))
        );

        lblVersion.setText("System version:");

        txtVersion.setEditable(false);
        txtVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVersionActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        plnSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Your books and your status"));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        lblFind.setText("Type it the book name: ");

        tbLibrary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book name", "Book Owner", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbLibrary);

        javax.swing.GroupLayout plnSearchLayout = new javax.swing.GroupLayout(plnSearch);
        plnSearch.setLayout(plnSearchLayout);
        plnSearchLayout.setHorizontalGroup(
            plnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnSearchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(plnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(plnSearchLayout.createSequentialGroup()
                        .addComponent(lblFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFind)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        plnSearchLayout.setVerticalGroup(
            plnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFind))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plnMasterLayout = new javax.swing.GroupLayout(plnMaster);
        plnMaster.setLayout(plnMasterLayout);
        plnMasterLayout.setHorizontalGroup(
            plnMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnMasterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(plnMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plnCadastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plnMasterLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVersion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        plnMasterLayout.setVerticalGroup(
            plnMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnMasterLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(plnMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVersion)
                    .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plnCadastre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plnMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plnMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
        
        if(!(txtFind.getText().isEmpty())){  
            Book bk = new Book();
            controllerLibrary dao = new controllerLibrary();
        
            int idfind = Integer.parseInt(txtFind.getText());
        
            bk.setId(idfind);
            
            TableModel tb = new TableModel(dao.selection(bk));
            tbLibrary.setModel(tb);
        }else{
             JOptionPane.showMessageDialog(null, "Enter the book code to perform a search");
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnSalveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalveActionPerformed
//        controllerLibrary dao = new controllerLibrary();
//        Book b = new Book();
//        b.setBook_name(txtBookName.getText().toString());
//        b.setBook_owner(txtBookOwrne.getText().toString());
//        b.setStatus(txtStatus.getName());  
//        dao.insert(b);

          JOptionPane.showMessageDialog(null, "We are still designing the features of this button. Wait");
    }//GEN-LAST:event_btnSalveActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed

    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnModernizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModernizeActionPerformed
        String id = txtId.getText();
        String bkn = txtBookName.getText();
        String bko = txtBookOwrne.getText();
        String status = txtStatus.getSelectedItem().toString();
        
        System.out.println(status);
        
        if(id.isEmpty() || status.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error processing your request, please make sure you correctly fill in the fields");
        }else{
            controllerLibrary dao = new controllerLibrary();
            Book b = new Book();
            b.setId(Integer.parseInt(id));
            b.setStatus(status);
            dao.modernize(b);
        }
    }//GEN-LAST:event_btnModernizeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String bkn = txtBookName.getText();
        String bko = txtBookOwrne.getText();
        String status = txtStatus.getName();
   
        if(!(bkn.isEmpty() || bko.isEmpty() || status.isEmpty())){
            controllerLibrary dao = new controllerLibrary();
            Book b = new Book();
            b.setBook_name(bkn);
            b.setBook_owner(bko);
            b.setStatus(status);
            dao.delete(b);
        
        }else{
            JOptionPane.showMessageDialog(null, "Error processing your request, please make sure you correctly fill in the fields");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVersionActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JOptionPane.showMessageDialog(null, "We are still designing the features of this button. Wait");
    }//GEN-LAST:event_btnBackActionPerformed

    /**     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(frmMyLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMyLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMyLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMyLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMyLibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModernize;
    private javax.swing.JButton btnSalve;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel plnCadastre;
    private javax.swing.JPanel plnMaster;
    private javax.swing.JPanel plnSearch;
    private javax.swing.JTable tbLibrary;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookOwrne;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JTextField txtVersion;
    private javax.swing.JTextField txtdt;
    // End of variables declaration//GEN-END:variables
}
