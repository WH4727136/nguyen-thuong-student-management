/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DiemMonHocBean;
import DAL.LopHocBean;
import java.util.List;

/**
 *
 * @author Thái Dương
 */
public class ThongKeServiceImpl implements ThongKeService{
    private ThongKE thongKE = null;
    
    public ThongKeServiceImpl(){
        thongKE = new ThongKeImpl();
    }
    
//    @Override 
//    public List<TTBangDiem> gBangDiem() {
//        return thongKE.getListbangDiem();
//    }

//    @Override
//    public List<KhocHocBean> getListKhoaHocBeans() {
//        return thongKE.getListKhoaHocBeans();
//    }

    @Override
    public List<LopHocBean> getListBangDiem() {
      return thongKE.getlistLopHocBean();
    }
    
}
