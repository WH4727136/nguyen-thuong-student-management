/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.DB;
import BLL.TTHOCSINHBL;
import DAL.TTHocSinh;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Thái Dương
 */
public class JFrameQuanLyHocSinh extends javax.swing.JFrame {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    /**
     * Creates new form FromQuanLyHS
     */
    public JFrameQuanLyHocSinh() {
        initComponents();
        initStudent();
        ProcessCrt(false);
    }

    ArrayList<TTHocSinh> arr =  new ArrayList<TTHocSinh>();
    DefaultTableModel model;
    public void initStudent()
        {
            List<TTHocSinh> listSV;
            listSV = TTHOCSINHBL.dshocsinh();
            if(listSV.size()>0)
        {
            model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
            
            for(TTHocSinh s:listSV) 
        {
            String phai="Nam";
                if(s.isBphai()==false)
            {
                phai = "Nữ" ;
            }
                else
            {
                phai = "Nam" ;
            }
            model.addRow(new Object[]{s.getStrMahs(),s.getStrTenhs(),s.getStrMalop(),phai,s.getDngaysinh()});
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
        jLabel7 = new javax.swing.JLabel();
        Txt_Tenhs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btn_Xoa = new javax.swing.JButton();
        Txt_Lop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Txt_timkiem = new javax.swing.JTextField();
        Txt_Mahs = new javax.swing.JTextField();
        Btn_Them = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btn_tieptuc = new javax.swing.JButton();
        Btn_Sua = new javax.swing.JButton();
        Cmb_fale = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Txt_ngaysinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Danhsachhs = new javax.swing.JTable();
        Btn_quaylai = new javax.swing.JButton();
        Btn_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tim kiếm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Tên học sinh:");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Mã học sinh:");

        Txt_timkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Txt_timkiemCaretUpdate(evt);
            }
        });
        Txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_timkiemActionPerformed(evt);
            }
        });
        Txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_timkiemKeyReleased(evt);
            }
        });

        Btn_Them.setBackground(new java.awt.Color(51, 255, 51));
        Btn_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Them.setText("THÊM");
        Btn_Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ThemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("DANH SÁCH THÔNG TIN HỌC SINH TRƯỜNG NGUYỄN HIỀN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Lớp:");

        Btn_tieptuc.setBackground(new java.awt.Color(255, 153, 153));
        Btn_tieptuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_tieptuc.setForeground(new java.awt.Color(255, 255, 255));
        Btn_tieptuc.setText("THÊM MỚI");
        Btn_tieptuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_tieptuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_tieptucActionPerformed(evt);
            }
        });

        Btn_Sua.setBackground(new java.awt.Color(255, 153, 51));
        Btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Sua.setText("SỬA");
        Btn_Sua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SuaActionPerformed(evt);
            }
        });

        Cmb_fale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cmb_fale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Giới tính:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Ngày sinh:");

        Tbl_Danhsachhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học sinh", "Tên học sinh", "Lớp", "Giới tính", "Ngày sinh"
            }
        ));
        Tbl_Danhsachhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_DanhsachhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Danhsachhs);

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

        Btn_search.setText("Tìm Kiếm");
        Btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Btn_tieptuc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(55, 55, 55)
                        .addComponent(Txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_search)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 124, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(24, 24, 24)
                            .addComponent(Txt_Mahs, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(Cmb_fale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(Txt_Tenhs, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6)
                            .addComponent(Txt_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(73, 73, 73)
                            .addComponent(Txt_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel5)))
                    .addGap(0, 125, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Btn_search))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_tieptuc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(Btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(Txt_Mahs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2))
                        .addComponent(Cmb_fale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Txt_Tenhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel6))
                        .addComponent(Txt_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5)
                    .addGap(0, 503, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_tieptucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_tieptucActionPerformed
        // TODO add your handling code here:
        Txt_Mahs.setText("");
        Txt_Tenhs.setText("");
        Txt_Lop.setText("");
        Txt_ngaysinh.setText("");
        Txt_Mahs.requestFocus();
        ProcessCrt(false);
        this.Btn_Them.setEnabled(true);

    }//GEN-LAST:event_Btn_tieptucActionPerformed

    private void Btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_XoaActionPerformed
        // TODO add your handling code here:
        if(Txt_Mahs.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nhập Mã Học Sinh cần xóa");
            Txt_Mahs.requestFocus();
            return;
        }

        int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa Học Sinh " + Txt_Tenhs.getText()+ " ? ","Confirm",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {
            TTHOCSINHBL.XoaHocSinh(Txt_Mahs.getText());
            model.removeRow(Tbl_Danhsachhs.getSelectedRow());
            Txt_Tenhs.setText("");
            Txt_Lop.setText("");
            Txt_Mahs.setText("");
            Txt_ngaysinh.setText("");

            JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công học sinh");
        }
    }//GEN-LAST:event_Btn_XoaActionPerformed

    private void Btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SuaActionPerformed
        // TODO add your handling code here:

        if(Txt_Mahs.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Mã Học Sinh không được để trống.");
            Txt_Mahs.requestFocus();
            return;
        }
        if(Txt_Tenhs.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tên Học Sinh không được để trống.");
            Txt_Tenhs.requestFocus();
            return;
        }
        if(Txt_Lop.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lớp không được để trống.");
            Txt_Lop.requestFocus();
            return;
        }
        if(Txt_ngaysinh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ngày sinh của Học Sinh không được để trống.");
            Txt_ngaysinh.requestFocus();
            return;
        }

        String mahs = Txt_Mahs.getText();
        String hoten = Txt_Tenhs.getText();
        String malop = Txt_Lop.getText();
        Date ngaysinh = Date.valueOf(Txt_ngaysinh.getText());
        int gt = Cmb_fale.getSelectedIndex();

        boolean phai = false;
        if(gt == 0) phai = true;
        else if(gt ==1) phai = false;

        TTHOCSINHBL.SuaHocSinh(mahs, hoten, malop, phai, ngaysinh);
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin Thành công");
        //refresh table
        model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
        model.setRowCount(0);
        initStudent();
    }//GEN-LAST:event_Btn_SuaActionPerformed

    private void Btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ThemActionPerformed
        // TODO add your handling code here:
        if(Txt_Mahs.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã học sinh cần thêm");
            Txt_Mahs.requestFocus();
            return;
        }
        if(Txt_Tenhs.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên học sinh cần thêm");
            Txt_Tenhs.requestFocus();
            return;
        }
        if(Txt_Lop.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Lớp cần thêm");
            Txt_Lop.requestFocus();
            return;
        }
        if(Txt_ngaysinh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Ngày sinh cần thêm");
            Txt_ngaysinh.requestFocus();
            return;
        }

        String mahs = Txt_Mahs.getText();
        String hoten = Txt_Tenhs.getText();
        String malop = Txt_Lop.getText();
        Date ngaysinh = Date.valueOf(Txt_ngaysinh.getText());

        int gt = Cmb_fale.getSelectedIndex();
        boolean phai = false;
        if(gt == 0) phai = true;
        else if(gt ==1) phai = false;

        TTHocSinh hs = new TTHocSinh(mahs, hoten, malop, phai, ngaysinh);
        int smt = TTHOCSINHBL.ThemHocSinh(hs);
        if(smt>0)
        JOptionPane.showMessageDialog(this, "Đã Thêm Học Sinh Thành Công!");
        model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
        model.setRowCount(0);
         initStudent();

    }//GEN-LAST:event_Btn_ThemActionPerformed

    private void Tbl_DanhsachhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_DanhsachhsMouseClicked
        // TODO add your handling code here:
        Txt_Mahs.setText(String.valueOf(model.getValueAt(Tbl_Danhsachhs.getSelectedRow(), 0)));
        Txt_Tenhs.setText(String.valueOf(model.getValueAt(Tbl_Danhsachhs.getSelectedRow(),1)));
        Cmb_fale.setSelectedItem(String.valueOf(model.getValueAt(Tbl_Danhsachhs.getSelectedRow(),3)));
        Txt_Lop.setText(String.valueOf(model.getValueAt(Tbl_Danhsachhs.getSelectedRow(),2)));
        Txt_ngaysinh.setText(String.valueOf(model.getValueAt(Tbl_Danhsachhs.getSelectedRow(),4)));
        ProcessCrt(false);
        this.Btn_Sua.setEnabled(true);
        this.Btn_Xoa.setEnabled(true);
        this.Txt_Mahs.setEditable(false);
    }//GEN-LAST:event_Tbl_DanhsachhsMouseClicked

    private void Btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_quaylaiActionPerformed
        // TODO add your handling code here:
        JFrameUngDungHeThong udht = new JFrameUngDungHeThong();
        udht.setTitle("QUẢN LÝ HỆ THỐNG");
        udht.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_quaylaiActionPerformed

    private void Txt_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_timkiemKeyReleased

        arr.clear();
        List<TTHocSinh> lisths;
        
        String hoten = Txt_timkiem.getText();
        lisths = TTHOCSINHBL.timkiemSV(hoten);
//        if(lisths.size()<=0)
//        {
//            JOptionPane.showMessageDialog(null, "Khong tim thấy");
//        }
        
            model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
            model.setRowCount(0);
            for(TTHocSinh s: lisths)
            {
                String phai="Nam";
                if(s.isBphai()==false)
            {
                phai = "Nữ" ;
            }
                else
            {
                phai = "Nam" ;
            }
                model.addRow(new Object[]{s.getStrMahs(),s.getStrTenhs(), s.getStrMalop(), phai,s.getDngaysinh()});
            }
        
//          arr.clear();
//        List<TTHocSinh> rs=null;
//        try(Connection ketNoi = DB.getKetNoi()){
//        rs = new ArrayList<>();
//    
//        if(Txt_timkiem.getText().isEmpty())
//            if (Txt_timkiem.getText().chars().allMatch(Character::isDigit));
//                
//        java.sql.Statement statement = ketNoi.createStatement();
//        String sql = "SELECT * FROM HOCSINH WHERE TENHS like N'%" + Txt_timkiem.getText() + "%'";
//         ResultSet resultSet = statement.executeQuery(sql);
//        while(resultSet.next())
// {
//        TTHocSinh sv = new TTHocSinh();
//        sv.setStrMahs(resultSet.getString("MAHS"));
//        sv.setStrTenhs(resultSet.getString("TENHS"));
//        sv.setStrMalop(resultSet.getString("MALOP"));
//        sv.setBphai(resultSet.getBoolean("GT"));
//        sv.setDngaysinh(resultSet.getDate("NGAYSINH"));
//        rs.add(sv);
// }
// }
// catch(Exception e)
// {
// System.out.println("Bi loi "+e.getMessage());
// }
    }//GEN-LAST:event_Txt_timkiemKeyReleased
    
    private void Txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_timkiemActionPerformed
        // TODO add your handling code here:
//                List<TTHocSinh> listSV;
//        String hoten = Txt_Tenhs.getText();
//        listSV = TTHOCSINHBL.timkiemSV(hoten);
//        if (listSV.size() <= 0)
// {
//    JOptionPane.showMessageDialog(null, "Không tìm thấy Hoc Sinh");
// } 
// else
// {
// model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
// for(TTHocSinh s:listSV) 
// {
// model.addRow(new 
//    Object[]{s.getStrMahs(),s.getStrTenhs(),s.getStrMalop(),s.isBphai(),s.getDngaysinh()});
// }
// 
// }

    }//GEN-LAST:event_Txt_timkiemActionPerformed

    private void Btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_searchActionPerformed
        // TODO add your handling code here:
        arr.clear();
        List<TTHocSinh> lisths;
        
        String hoten = Txt_timkiem.getText();
        lisths = TTHOCSINHBL.timkiemSV(hoten);
        if(lisths.size()<=0)
        {
            JOptionPane.showMessageDialog(null, "Khong tim thấy");
        }
        else{
            model = (DefaultTableModel)Tbl_Danhsachhs.getModel();
            model.setRowCount(0);
            for(TTHocSinh s: lisths)
            {
                String phai="Nam";
                if(s.isBphai()==false)
            {
                phai = "Nữ" ;
            }
                else
            {
                phai = "Nam" ;
            }
                model.addRow(new Object[]{s.getStrMahs(),s.getStrTenhs(), s.getStrMalop(), phai,s.getDngaysinh()});
            }
        }
    }//GEN-LAST:event_Btn_searchActionPerformed

    private void Txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Txt_timkiemCaretUpdate
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Txt_timkiemCaretUpdate

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
            java.util.logging.Logger.getLogger(JFrameQuanLyHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQuanLyHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQuanLyHocSinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Sua;
    private javax.swing.JButton Btn_Them;
    private javax.swing.JButton Btn_Xoa;
    private javax.swing.JButton Btn_quaylai;
    private javax.swing.JButton Btn_search;
    private javax.swing.JButton Btn_tieptuc;
    private javax.swing.JComboBox<String> Cmb_fale;
    private javax.swing.JTable Tbl_Danhsachhs;
    private javax.swing.JTextField Txt_Lop;
    private javax.swing.JTextField Txt_Mahs;
    private javax.swing.JTextField Txt_Tenhs;
    private javax.swing.JTextField Txt_ngaysinh;
    private javax.swing.JTextField Txt_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}