/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.TTLOPHOCBL;
import DAL.TTLOPHOC;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thái Dương
 */
public class JFrameQuanLyLopHoc extends javax.swing.JFrame {

    /**
     * Creates new form FormQuanLyLopHoc
     */
    public JFrameQuanLyLopHoc() {
        initComponents();
        initStudent();
        ProcessCrt(false);
    }
DefaultTableModel model;
    void initStudent()
        {
            List<TTLOPHOC> listLH;
            listLH = TTLOPHOCBL.dsLopHoc();
            if(listLH.size()>0)
        {
            model = (DefaultTableModel)Tbl_Lophoc.getModel();
            for(TTLOPHOC s: listLH) 
        {
            
            model.addRow(new 
            Object[]{s.getStrMalop(),s.getStrMakhoi(),s.getStrMagv(), s.getiSiso()});
        }
    } 
 }
    
    public void ProcessCrt(boolean b)
{
    this.Btn_Them.setEnabled(b);
    this.Btn_Sua.setEnabled(b);
    this.Btn_Xoa.setEnabled(b);
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
        jLabel2 = new javax.swing.JLabel();
        Txt_Tenlop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_Magiaovien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Khoi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_siso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Lophoc = new javax.swing.JTable();
        Btn_Sua = new javax.swing.JButton();
        Btn_Them = new javax.swing.JButton();
        Btn_Xoa = new javax.swing.JButton();
        Btn_moi = new javax.swing.JButton();
        Btn_quaylai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("QUẢN LÝ THÔNG TIN LỚP HỌC");

        jLabel2.setText("Tên lớp:");

        jLabel5.setText("Mã giáo viên:");

        jLabel6.setText("Khối lớp:");

        jLabel7.setText("Sĩ số lớp:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("DANH SÁCH THÔNG TIN CÁC LỚP HỌC");

        Tbl_Lophoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tbl_Lophoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên lớp", "Khối lớp", "Mã giáo viên ", "Sĩ số lớp"
            }
        ));
        Tbl_Lophoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_LophocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Lophoc);

        Btn_Sua.setBackground(new java.awt.Color(255, 204, 51));
        Btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Sua.setText("SỬA");
        Btn_Sua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SuaActionPerformed(evt);
            }
        });

        Btn_Them.setBackground(new java.awt.Color(153, 255, 51));
        Btn_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Them.setText("THÊM");
        Btn_Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ThemActionPerformed(evt);
            }
        });

        Btn_Xoa.setBackground(new java.awt.Color(255, 51, 51));
        Btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Xoa.setText("XÓA");
        Btn_Xoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_XoaActionPerformed(evt);
            }
        });

        Btn_moi.setBackground(new java.awt.Color(255, 153, 153));
        Btn_moi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_moi.setForeground(new java.awt.Color(255, 255, 255));
        Btn_moi.setText("THÊM MỚI");
        Btn_moi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_moiActionPerformed(evt);
            }
        });

        Btn_quaylai.setBackground(new java.awt.Color(0, 204, 204));
        Btn_quaylai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_quaylai.setForeground(new java.awt.Color(255, 255, 255));
        Btn_quaylai.setText("QUAY LẠI");
        Btn_quaylai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_quaylaiActionPerformed(evt);
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
                                .addGap(271, 271, 271)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Txt_Magiaovien, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Txt_Tenlop, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Txt_Khoi))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Txt_siso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Tenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Khoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Magiaovien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_siso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tbl_LophocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_LophocMouseClicked
        // TODO add your handling code here:
        Txt_Tenlop.setText(String.valueOf(model.getValueAt(Tbl_Lophoc.getSelectedRow(), 0)));
        Txt_Khoi.setText(String.valueOf(model.getValueAt(Tbl_Lophoc.getSelectedRow(),1)));
        Txt_Magiaovien.setText(String.valueOf(model.getValueAt(Tbl_Lophoc.getSelectedRow(),2)));
        Txt_siso.setText(String.valueOf(model.getValueAt(Tbl_Lophoc.getSelectedRow(),3)));
        ProcessCrt(false);
        this.Btn_Sua.setEnabled(true);
        this.Btn_Xoa.setEnabled(true);
    }//GEN-LAST:event_Tbl_LophocMouseClicked

    private void Btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SuaActionPerformed
        // TODO add your handling code here:
        if(Txt_Tenlop.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Tên lớp không được để trống.");
            Txt_Tenlop.requestFocus();
            return;
        }
        if(Txt_Khoi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Khối không được để trống.");
            Txt_Khoi.requestFocus();
            return;
        }
        if(Txt_Magiaovien.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Mã giáo viên không được để trống.");
            Txt_Magiaovien.requestFocus();
            return;
        }
        if(Txt_siso.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Sĩ số lớp của học sinh không được để trống.");
            Txt_siso.requestFocus();
            return;
        }

        String malh = Txt_Tenlop.getText();
        String khoi = Txt_Khoi.getText();
        String magv = Txt_Magiaovien.getText();
        int siso = Integer.parseInt(Txt_siso.getText());

        TTLOPHOCBL.SuaLopHoc(malh, khoi, magv, siso);
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin Thành công");
        //refresh table
        model = (DefaultTableModel)Tbl_Lophoc.getModel();
        model.setRowCount(0);
        initStudent();
    }//GEN-LAST:event_Btn_SuaActionPerformed

    private void Btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ThemActionPerformed
        // TODO add your handling code here:
        if(Txt_Tenlop.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên Lớp cần thêm");
            Txt_Tenlop.requestFocus();
            return;
        }
        if(Txt_Khoi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Khối cần thêm");
            Txt_Khoi.requestFocus();
            return;
        }
        if(Txt_Magiaovien.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã Giáo Viên cần thêm");
            Txt_Magiaovien.requestFocus();
            return;
        }
        if(Txt_siso.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Sĩ Số lớp cần thêm");
            Txt_siso.requestFocus();
            return;
        }

        String malh = Txt_Tenlop.getText();
        String khoi = Txt_Khoi.getText();
        String magv = Txt_Magiaovien.getText();
        int siso = Integer.parseInt(Txt_siso.getText());

        TTLOPHOC lh = new TTLOPHOC(malh, khoi, magv, siso);
        int smt = TTLOPHOCBL.ThemLopHoc(lh);
        if(smt>0)
        JOptionPane.showMessageDialog(this, "Đã Thêm Lớp Thành Công!");
        model = (DefaultTableModel)Tbl_Lophoc.getModel();
        model.setRowCount(0);
        initStudent();

    }//GEN-LAST:event_Btn_ThemActionPerformed

    private void Btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_XoaActionPerformed
        // TODO add your handling code here:
        if(Txt_Tenlop.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nhập Lớp cần xóa");
            Txt_Tenlop.requestFocus();
            return;
        }

        Component rootPane = null;
        int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa Lớp " + Txt_Tenlop.getText()+ " ? ","Confirm",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {

            TTLOPHOCBL.XoaLopHoc(Txt_Tenlop.getText());
            model.removeRow(Tbl_Lophoc.getSelectedRow());
            Txt_Tenlop.setText("");
            Txt_Khoi.setText("");
            Txt_Magiaovien.setText("");
            Txt_siso.setText("");

            JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công Lớp Học");
        }
    }//GEN-LAST:event_Btn_XoaActionPerformed

    private void Btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_moiActionPerformed
        // TODO add your handling code here:
        Txt_Tenlop.setText("");
        Txt_Khoi.setText("");
        Txt_Magiaovien.setText("");
        Txt_siso.setText("");
        Txt_Tenlop.requestFocus();
        ProcessCrt(false);
        this.Btn_Them.setEnabled(true);
    }//GEN-LAST:event_Btn_moiActionPerformed

    private void Btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_quaylaiActionPerformed
        // TODO add your handling code here:
        JFrameUngDungHeThong udht = new JFrameUngDungHeThong();
        udht.setTitle("QUẢN LÝ HỆ THỐNG");
        udht.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_quaylaiActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameQuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQuanLyLopHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Sua;
    private javax.swing.JButton Btn_Them;
    private javax.swing.JButton Btn_Xoa;
    private javax.swing.JButton Btn_moi;
    private javax.swing.JButton Btn_quaylai;
    private javax.swing.JTable Tbl_Lophoc;
    private javax.swing.JTextField Txt_Khoi;
    private javax.swing.JTextField Txt_Magiaovien;
    private javax.swing.JTextField Txt_Tenlop;
    private javax.swing.JTextField Txt_siso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
