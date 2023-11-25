/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TTLOPHOC;
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
public class TTLOPHOCBL {
    public static List<TTLOPHOC> dsLopHoc() {
        List<TTLOPHOC> rs = null;
        try(Connection ketNoi = DB.getKetNoi()) {
            rs = new ArrayList();
            java.sql.Statement statement = ketNoi.createStatement();
            String sql = "SELECT * FROM LOP";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                TTLOPHOC gv = new TTLOPHOC();
                gv.setStrMalop(resultSet.getString("MALOP"));
                gv.setStrMakhoi(resultSet.getString("MAKHOI"));
                gv.setStrMagv(resultSet.getString("MAGV"));
                gv.setiSiso(resultSet.getInt("SISO"));
                rs.add(gv);
                
            }
        } catch (Exception e) {
            System.out.println("Bi loi "+e.getMessage());
        }
        return rs;
    }
    public static int ThemLopHoc(TTLOPHOC lh) {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "INSERT INTO LOP(MALOP,MAKHOI,MAGV,SISO)VALUES(?,?,?,?)";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            pst.setString(1,lh.getStrMalop());
            pst.setString(2,lh.getStrMakhoi());
            pst.setString(3,lh.getStrMagv());
            pst.setInt(4,lh.getiSiso());
            smt = pst.executeUpdate();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Tên lớp đã tồn tại");
           System.out.println("Bị lỗi " + ex.getMessage());
           
        }
        return smt;
    }
    public static void XoaLopHoc(String lh) {
        try(Connection ketNoi = DB.getKetNoi())
        {

           String sql = "DELETE FROM LOP WHERE MALOP = N'"+lh+"'";
           PreparedStatement statement = ketNoi.prepareStatement(sql);
           statement.execute();
        }
        catch(Exception e)
        {
            System.out.println("Bị lỗi " + e.getMessage());
        }
    }
     public static void SuaLopHoc(String malop, String makhoi, String magv, int siso)  {
        int smt = 0;
        try(Connection ketNoi = DB.getKetNoi()){
            String sql = "UPDATE LOP SET MAKHOI='"+makhoi+"',MAGV = '"+magv+"',SISO='"+siso+"' WHERE MALOP='"+malop+"'";
            PreparedStatement pst = ketNoi.prepareStatement(sql);
            smt = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.println("Bị lỗi " + ex.getMessage());
    }
    }
     
}
