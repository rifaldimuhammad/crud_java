/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import konfigurasi.koneksi;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author rifaldi
 */
public class Form_barang extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    private DefaultTableModel DftTblModel_barang;
    private String sql;

    public Form_barang() {
        initComponents();
        this.tampilData();
    }

    public void tampilData() {
        DftTblModel_barang = new DefaultTableModel();
        DftTblModel_barang.addColumn("Kode Barang");
        DftTblModel_barang.addColumn("Nama Barang");
        DftTblModel_barang.addColumn("Harga");
        DftTblModel_barang.addColumn("Satuan");
        DftTblModel_barang.addColumn("Stok");
        jTable_barang.setModel(DftTblModel_barang);
        Connection conn = koneksi.getConnection();

        try {
            java.sql.Statement stmt = conn.createStatement();
            sql = "SELECT * FROM barang";
            java.sql.ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                DftTblModel_barang.addRow(new Object[]{
                    res.getString("kode_barang"),
                    res.getString("nama_barang"),
                    res.getString("harga"),
                    res.getString("satuan"),
                    res.getString("stok")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jTextField_kode_barang = new javax.swing.JTextField();
        jTextField_nama_barang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_harga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_satuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_stok = new javax.swing.JTextField();
        jButton1_tambah = new javax.swing.JButton();
        jButton2_simpan = new javax.swing.JButton();
        jButton3_edit = new javax.swing.JButton();
        jButton4_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_barang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jTextField_kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kode_barangActionPerformed(evt);
            }
        });

        jTextField_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nama_barangActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga");

        jTextField_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hargaActionPerformed(evt);
            }
        });

        jLabel4.setText("Satuan");

        jTextField_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_satuanActionPerformed(evt);
            }
        });

        jLabel5.setText("Stok");

        jTextField_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_stokActionPerformed(evt);
            }
        });

        jButton1_tambah.setText("Tambah");
        jButton1_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_tambahActionPerformed(evt);
            }
        });

        jButton2_simpan.setText("Simpan");
        jButton2_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_simpanActionPerformed(evt);
            }
        });

        jButton3_edit.setText("Edit");
        jButton3_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_editActionPerformed(evt);
            }
        });

        jButton4_hapus.setText("Hapus");
        jButton4_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_hapusActionPerformed(evt);
            }
        });

        jTable_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_barang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_stok)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 81, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_kode_barang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_nama_barang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_harga))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_satuan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_kode_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_kode_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_kode_barangActionPerformed

    private void jTextField_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nama_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nama_barangActionPerformed

    private void jTextField_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hargaActionPerformed

    private void jTextField_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_satuanActionPerformed

    private void jTextField_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stokActionPerformed

    private void jButton1_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_tambahActionPerformed

    }//GEN-LAST:event_jButton1_tambahActionPerformed

    private void jButton3_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_editActionPerformed
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update barang set nama_barang=?, harga=?, satuan=?, stok=? where kode_barang=?");
            stmt.setString(1, jTextField_nama_barang.getText());
            stmt.setString(2, jTextField_harga.getText());
            stmt.setString(3, jTextField_satuan.getText());
            stmt.setString(4, jTextField_stok.getText());
            stmt.setString(5, jTextField_kode_barang.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            jTextField_nama_barang.setText("");
            jTextField_harga.setText("");
            jTextField_satuan.setText("");
            jTextField_stok.setText("");
            jTextField_kode_barang.setText("");
            tampilData();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton3_editActionPerformed

    private void jButton4_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_hapusActionPerformed
        Connection conn = koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from barang where kode_barang ='" + jTextField_kode_barang.getText() + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                tampilData();
                jTextField_kode_barang.setText("");
                jTextField_nama_barang.setText("");
                jTextField_harga.setText("");
                jTextField_satuan.setText("");
                jTextField_stok.setText("");
                jTextField_kode_barang.requestFocus();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4_hapusActionPerformed

    private void jTable_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_barangMouseClicked
        int baris = jTable_barang.getSelectedRow();
        jTextField_kode_barang.setText(DftTblModel_barang.getValueAt(baris, 0).toString());
        jTextField_nama_barang.setText(DftTblModel_barang.getValueAt(baris, 1).toString());
        jTextField_harga.setText(DftTblModel_barang.getValueAt(baris, 2).toString());
        jTextField_satuan.setText(DftTblModel_barang.getValueAt(baris, 3).toString());
        jTextField_stok.setText(DftTblModel_barang.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_jTable_barangMouseClicked

    private void jButton2_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_simpanActionPerformed
        try {
            Connection conn = koneksi.getConnection();
            //aksi mysql
            PreparedStatement stmt = conn.prepareStatement("insert into barang(nama_barang, harga, satuan, stok)values(?,?,?,?)");

            //ambil dari textfie
            
            stmt.setString(1, jTextField_nama_barang.getText());
            stmt.setString(2, jTextField_harga.getText());
            stmt.setString(3, jTextField_satuan.getText());
            stmt.setString(4, jTextField_stok.getText());
            stmt.executeUpdate();

            //pesan ketika berhasil
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            
//            Mengosongkan textfield
            jTextField_nama_barang.setText("");
            jTextField_harga.setText("");
            jTextField_satuan.setText("");
            jTextField_stok.setText("");
            jTextField_kode_barang.setText("");
            tampilData();

        } catch (SQLException e) {
            //pesan ketika eror
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(Form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_tambah;
    private javax.swing.JButton jButton2_simpan;
    private javax.swing.JButton jButton3_edit;
    private javax.swing.JButton jButton4_hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_barang;
    private javax.swing.JTextField jTextField_harga;
    private javax.swing.JTextField jTextField_kode_barang;
    private javax.swing.JTextField jTextField_nama_barang;
    private javax.swing.JTextField jTextField_satuan;
    private javax.swing.JTextField jTextField_stok;
    // End of variables declaration//GEN-END:variables
}
