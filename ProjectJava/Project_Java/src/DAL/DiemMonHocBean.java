/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Date;

/**
 *
 * @author Thái Dương
 */
public class DiemMonHocBean {
    private String Lop;
    private float Diemtrungbinh;

    public DiemMonHocBean() {
    }

    public DiemMonHocBean(String Lop, float Diemtrungbinh) {
        this.Lop = Lop;
        this.Diemtrungbinh = Diemtrungbinh;
    }

    public String getLop() {
        return Lop;
    }

    public float getDiemtrungbinh() {
        return Diemtrungbinh;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setDiemtrungbinh(float Diemtrungbinh) {
        this.Diemtrungbinh = Diemtrungbinh;
    }

    
    
    
}
