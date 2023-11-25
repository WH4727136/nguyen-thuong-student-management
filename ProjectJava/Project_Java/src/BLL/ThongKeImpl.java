/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LopHocBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thái Dương
 */
public class ThongKeImpl implements ThongKE{

    

//    @Override
//    public List<KhocHocBean> getListKhoaHocBeans() {
//       try {
//            Connection ketNoi = DB.getKetNoi();
//            String sql = "SELECT TENKH,NGAYBATDAU,NGAYKETHUC FROM KHOA_HOC ";
//            List<KhocHocBean> list = new ArrayList<>();
//            PreparedStatement ps = ketNoi.prepareCall(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                KhocHocBean khb = new KhocHocBean();
//                khb.setTenKhoahoc(rs.getString("TENKH"));
//                khb.setNgaybatdau(rs.getDate("NGAYBATDAU"));
//                khb.setNgaykethuc(rs.getDate("NGAYKETTHUC"));
//                list.add(khb);
//            }
//            return list;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }

//    @Override
//    public List<TTBangDiem> getListbangDiem() {
//        try {
//            Connection ketNoi = DB.getKetNoi();
//            String sql = "SELECT MALOP, COUNT(*) AS DIEMTRUNGBINH FROM LOP GROUP BY MALOP";
//            List<TTBangDiem> list = new ArrayList<>();
//            PreparedStatement ps = ketNoi.prepareCall(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                TTBangDiem bangdiem = new TTBangDiem();
//                bangdiem.setStrMaLop(rs.getString("MALOP"));
//                bangdiem.setfDiemTB(rs.getFloat("DIEMTRUNGBINH"));
//                list.add(bangdiem);
//            }
//            return list;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }

    @Override
    public List<LopHocBean> getlistLopHocBean() {
            try {
            Connection ketNoi = DB.getKetNoi();
            String sql = "SELECT MALOP, AVG(DIEMTRUNGBINH) AS DIEMTRUNGBINH  FROM BANGDIEM GROUP BY MALOP";
            List<LopHocBean> list = new ArrayList<>();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LopHocBean bangdiem = new LopHocBean();
                bangdiem.setLop(rs.getString("MALOP"));
                bangdiem.setDiemtrungbinh(rs.getFloat("DIEMTRUNGBINH"));
                list.add(bangdiem);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
