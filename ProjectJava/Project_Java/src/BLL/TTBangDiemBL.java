/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTBangDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thái Dương
 */
public class TTBangDiemBL {
       public static List<TTBangDiem> dsBangDiem() 
 {
    List<TTBangDiem> rs=null;
    try(Connection ketNoi = DB.getKetNoi()){
    rs = new ArrayList<>();
    java.sql.Statement statement = ketNoi.createStatement();
       String sql = "SELECT * FROM BANGDIEM ";
    ResultSet resultSet = statement.executeQuery(sql);
    while(resultSet.next())
    {
        TTBangDiem sv = new TTBangDiem();
        sv.setStrMaBD(resultSet.getString("MABANGDIEM"));
        sv.setStrMahs(resultSet.getString("MAHS"));
        sv.setStrTenhs(resultSet.getString("TENHS"));
        sv.setStrLop(resultSet.getString("MALOP"));
        sv.setStrMaMH(resultSet.getString("MAMH"));
        sv.setfDiemTB(resultSet.getFloat("DIEMTRUNGBINH"));
        sv.setStrHocLuc(resultSet.getString("HOCLUC"));
        sv.setStrManvString(resultSet.getString("MANV"));
        rs.add(sv);
    }
    }
    catch(Exception e)
    {
        System.out.println("Bi loi "+e.getMessage());
    }

    return rs;
 }
//            public static List<TTHocSinh> timkiemSV(String hoten) 
//            {
//                List<TTHocSinh> rs=null;
//                try(Connection ketNoi = DB.getKetNoi()){
//                rs = new ArrayList<>();
//                java.sql.Statement statement = ketNoi.createStatement();
//                String sql = "SELECT * FROM HOCSINH WHERE TENHS like N'%"+hoten+"'";
//                ResultSet resultSet = statement.executeQuery(sql);
//                while(resultSet.next())
//            {
//                TTHocSinh sv = new TTHocSinh();
//                sv.setStrMahs(resultSet.getString("MAHS"));
//                sv.setStrTenhs(resultSet.getString("TENHS"));
//                sv.setStrMalop(resultSet.getString("MALOP"));
//                sv.setBphai(resultSet.getBoolean("GT"));
//                sv.setDngaysinh(resultSet.getDate("NGAYSINH"));
//                rs.add(sv);
//            }
//        }
//            catch(Exception e)
//        {
//            System.out.println("Bi loi "+e.getMessage());
// }
// 
// return rs;
// }
    public static int ThemBangDiem(TTBangDiem bd) {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "INSERT INTO BANGDIEM(MABANGDIEM,MAHS,TENHS,MALOP,MAMH,DIEMTRUNGBINH,HOCLUC,MANV)VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            pst.setString(1,bd.getStrMaBD());
            pst.setString(2,bd.getStrMahs());
            pst.setString(3,bd.getStrTenhs());
            pst.setString(4,bd.getStrLop());
            pst.setString(5,bd.getStrMaMH());
            pst.setFloat(6,bd.getfDiemTB());
            pst.setString(7,bd.getStrHocLuc());
            pst.setString(8, bd.getStrManvString());
            smt = pst.executeUpdate();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Mã Bảng điểm đã tồn tại");
           
        }
        return smt;
    }
    public static void Xoabangdiem(String mabd) {
        try(Connection ketNoi = DB.getKetNoi())
        {
           String sql = "DELETE FROM BANGDIEM WHERE MABANGDIEM = N'"+mabd+"'";
           PreparedStatement statement = ketNoi.prepareStatement(sql);
           statement.execute();
           ketNoi.close();
        }
        catch(Exception e)
        {
            System.out.println("Bị lỗi " + e.getMessage());
        }
    }
     public static void SuaBangdiem(String mabd, String mahs, String tenhs, String lop,  float diemtb, String hocluc, String manv)  {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "UPDATE BANGDIEM SET MAHS = N'"+mahs+"',TENHS='"+tenhs+"',MALOP='"+lop+"',DIEMTRUNGBINH = "+diemtb+",HOCLUC='"+hocluc+"',MANV='"+manv+"' WHERE MABANGDIEM='"+mabd+"'";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            smt = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Bị lỗi " + ex.getMessage());
    }
    }
}
