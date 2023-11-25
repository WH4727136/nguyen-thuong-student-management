/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;


import DAL.TTNhanVienGiaoVu;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thái Dương
 */
public class TTNhanVienGiaoVuBL {
        public static List<TTNhanVienGiaoVu> dsgiaovu() {
        List<TTNhanVienGiaoVu> rs = null;
        try(Connection ketNoi = DB.getKetNoi()) {
            rs = new ArrayList();
            java.sql.Statement statement = ketNoi.createStatement();
            String sql = "SELECT * FROM NVGIAOVU";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                TTNhanVienGiaoVu gv = new TTNhanVienGiaoVu();
                gv.setStrMaNV(resultSet.getString("MANV"));
                gv.setStrTenNV(resultSet.getString("TENNV"));
                gv.setbPhai(resultSet.getBoolean("GT"));
                gv.setdNgaySinh(resultSet.getDate("NGAYSINH"));
                rs.add(gv);
                
            }
        } catch (Exception e) {
            System.out.println("Bi loi "+e.getMessage());
        }
        return rs;
    }
         public static int ThemNV(TTNhanVienGiaoVu nv) {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "INSERT INTO NVGIAOVU(MANV,TENNV,GT,NGAYSINH)VALUES(?,?,?,?)";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            pst.setString(1,nv.getStrMaNV());
            pst.setString(2,nv.getStrTenNV());
            pst.setBoolean(3,nv.isbPhai());
            pst.setDate(4,nv.getdNgaySinh());
            smt = pst.executeUpdate();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Mã NNhân Viên đã tồn tại");
           System.out.println("Bị lỗi " + ex.getMessage());
           
        }
        return smt;
    }
    public static void XoaNhanVien(String manv) {
        try(Connection ketNoi = DB.getKetNoi())
        {
//                    int row = 0;
           String sql = "DELETE FROM NVGIAOVU WHERE MANV = N'"+manv+"'";
           PreparedStatement statement = ketNoi.prepareStatement(sql);
           statement.execute();
//           row = statement.executeUpdate();
//           if(row > 0)
//               JOptionPane.showMessageDialog(this,"Xóa thanh công");
//           else
              
        }
        catch(Exception e)
        {
            System.out.println("Bị lỗi " + e.getMessage());
        }
    }
     public static void SuaNhanVien(String manv, String tennv, boolean phai, Date ngaysinh)  {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "UPDATE NVGIAOVU SET TENNV = N'"+tennv+"',GT = '"+phai+"',NGAYSINH='"+ngaysinh+"' WHERE MANV='"+manv+"'";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            smt = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Bị lỗi " + ex.getMessage());
    }
    }
}
