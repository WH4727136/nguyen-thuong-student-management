/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTGiaoVien;
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
public class TTGiaoVienBL {
    public static List<TTGiaoVien> dsGiaoVien() {
        List<TTGiaoVien> rs = null;
        try(Connection ketNoi = DB.getKetNoi()) {
            rs = new ArrayList();
            java.sql.Statement statement = ketNoi.createStatement();
            String sql = "SELECT * FROM GIAOVIEN";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                TTGiaoVien gv = new TTGiaoVien();
                gv.setStrMagv(resultSet.getString("MAGV"));
                gv.setStrTenGV(resultSet.getString("TENGV"));
                gv.setbPhai(resultSet.getBoolean("GT"));
                gv.setDNgaysinh(resultSet.getDate("NGAYSINH"));
                gv.setStrMamh(resultSet.getString("MAMH"));
                rs.add(gv);
                
            }
        } catch (Exception e) {
            System.out.println("Bi loi "+e.getMessage());
        }
        return rs;
    }

    public static int ThemGiaoVien(TTGiaoVien gv) {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "INSERT INTO GIAOVIEN(MAGV,TENGV,GT,NGAYSINH,MAMH)VALUES(?,?,?,?,?)";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            pst.setString(1,gv.getStrMagv());
            pst.setString(2,gv.getStrTenGV());
            pst.setBoolean(3,gv.isbPhai());
            pst.setDate(4,gv.getDNgaysinh());
            pst.setString(5,gv.getStrMamh());
            smt = pst.executeUpdate();
        }catch(Exception ex){
//           JOptionPane.showMessageDialog(null, "Mã Giáo Viên đã tồn tại");
System.out.println("Bị lỗi " + ex.getMessage());
           
        }
        return smt;
    }

    public static void SuaGiaoVien(String magv, String tengv, boolean phai, Date ngaysinh, String mamh)  {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "UPDATE GIAOVIEN SET TENGV = N'"+tengv+"',GT='"+phai+"',NGAYSINH = '"+ngaysinh+"',MAMH='"+mamh+"' WHERE MAGV='"+magv+"'";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            smt = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Bị lỗi " + ex.getMessage());
    }
    }
    
    public static void XoaGiaoVien(String magv) {
        try(Connection ketNoi = DB.getKetNoi())
        {
//                    int row = 0;
           String sql = "DELETE FROM GIAOVIEN WHERE MAGV = N'"+magv+"'";
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
}
