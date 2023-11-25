/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTHocSinh;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thái Dương
 */
public class TTHOCSINHBL {
    public static List<TTHocSinh> dshocsinh() 
 {
    List<TTHocSinh> rs=null;
    try(Connection ketNoi = DB.getKetNoi()){
    rs = new ArrayList<>();
    java.sql.Statement statement = ketNoi.createStatement();
    String sql = "SELECT * FROM HOCSINH ";
    ResultSet resultSet = statement.executeQuery(sql);
    while(resultSet.next())
    {
        TTHocSinh sv = new TTHocSinh();
        sv.setStrMahs(resultSet.getString("MAHS"));
        sv.setStrTenhs(resultSet.getString("TENHS"));
        sv.setStrMalop(resultSet.getString("MALOP"));
        sv.setBphai(resultSet.getBoolean("GT"));
        sv.setDngaysinh(resultSet.getDate("NGAYSINH"));
        rs.add(sv);
    }
    }
    catch(Exception e)
    {
        System.out.println("Bi loi "+e.getMessage());
    }

    return rs;
 }
            public static List<TTHocSinh> timkiemSV(String hoten) 
            {
                List<TTHocSinh> rs=null;
                try(Connection ketNoi = DB.getKetNoi()){
                rs = new ArrayList<>();
                java.sql.Statement statement = ketNoi.createStatement();
                String sql = "SELECT * FROM HOCSINH WHERE TENHS like N'%"+hoten+"%'";
                ResultSet resultSet = statement.executeQuery(sql);
                while(resultSet.next())
            {
                TTHocSinh sv = new TTHocSinh();
                sv.setStrMahs(resultSet.getString("MAHS"));
                sv.setStrTenhs(resultSet.getString("TENHS"));
                sv.setStrMalop(resultSet.getString("MALOP"));
                sv.setBphai(resultSet.getBoolean("GT"));
                sv.setDngaysinh(resultSet.getDate("NGAYSINH"));
                rs.add(sv);
            }
        }
            catch(Exception e)
        {
            System.out.println("Bi loi "+e.getMessage());
 }
 
 return rs;
 }
    public static int ThemHocSinh(TTHocSinh hs) {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "INSERT INTO HOCSINH(MAHS,TENHS,MALOP,GT,NGAYSINH)VALUES(?,?,?,?,?)";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            pst.setString(1,hs.getStrMahs());
            pst.setString(2,hs.getStrTenhs());
            pst.setString(3,hs.getStrMalop());
            pst.setBoolean(4,hs.isBphai());
            pst.setDate(5,hs.getDngaysinh());
            smt = pst.executeUpdate();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lớp này không có trong trường hoặc trùng mã Học sinh.\nVui lòng nhập lại hoặc tạo lớp mới");
           
        }
        return smt;
    }
    public static void XoaHocSinh(String mahs) {
        try(Connection ketNoi = DB.getKetNoi())
        {
           String sql = "DELETE FROM HOCSINH WHERE MAHS = N'"+mahs+"'";
           PreparedStatement statement = ketNoi.prepareStatement(sql);
           statement.execute();
           ketNoi.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Bạn cần phải xóa Lớp Học trước!!");
        }
    }
     public static void SuaHocSinh(String mahs, String tenhs, String malop, boolean phai, Date ngaysinh)  {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "UPDATE HOCSINH SET TENHS = N'"+tenhs+"',MALOP='"+malop+"',GT = '"+phai+"',NGAYSINH='"+ngaysinh+"' WHERE MAHS='"+mahs+"'";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            smt = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Bị lỗi " + ex.getMessage());
    }
    }

     
}
