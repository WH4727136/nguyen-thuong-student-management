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
public class TTGiaoVien {
    private String StrMagv;
    private String StrTenGV;
    private boolean bPhai;
    private Date DNgaysinh;
    private String StrMamh;

    public TTGiaoVien(String StrMagv, String StrTenGV, boolean bPhai, Date DNgaysinh, String StrMamh) {
        this.StrMagv = StrMagv;
        this.StrTenGV = StrTenGV;
        this.bPhai = bPhai;
        this.DNgaysinh = DNgaysinh;
        this.StrMamh = StrMamh;
    }

    public TTGiaoVien() {
          this.StrMagv = "";
        this.StrTenGV = "";
        this.bPhai = false;
        this.DNgaysinh = new Date(2023-01-01);
        this.StrMamh = "";
    }

    public String getStrMagv() {
        return StrMagv;
    }

    public void setStrMagv(String StrMagv) {
        this.StrMagv = StrMagv;
    }

    public String getStrTenGV() {
        return StrTenGV;
    }

    public void setStrTenGV(String StrTenGV) {
        this.StrTenGV = StrTenGV;
    }

    public boolean isbPhai() {
        return bPhai;
    }

    public void setbPhai(boolean bPhai) {
        this.bPhai = bPhai;
    }

    public Date getDNgaysinh() {
        return DNgaysinh;
    }

    public void setDNgaysinh(Date DNgaysinh) {
        this.DNgaysinh = DNgaysinh;
    }

    public String getStrMamh() {
        return StrMamh;
    }

    public void setStrMamh(String StrMamh) {
        this.StrMamh = StrMamh;
    }
    
    
}

