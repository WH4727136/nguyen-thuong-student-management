/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nhamt
 */
public class UsersBL extends DB{
    public Users dangnhap(String username, String password) {
        Users nd = null;
        try(Connection ketNoi = DB.getKetNoi()) {
                String sql = "Select * From  Users where TenTK=? and MatKhau=?";
                PreparedStatement pst = ketNoi.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    nd = new Users();
                    nd.setStrTenTK(rs.getString(1));
                    nd.setStrMK(rs.getString(2));
                    nd.setStrMota(rs.getString(3));
                }               
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    } 
}
