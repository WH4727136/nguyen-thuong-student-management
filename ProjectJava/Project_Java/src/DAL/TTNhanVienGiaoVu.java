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
public class TTNhanVienGiaoVu {
    private String StrMaNV;
    private String StrTenNV;
    private boolean bPhai;
    private Date dNgaySinh;

    public TTNhanVienGiaoVu(String StrMaNV, String StrTenNV, boolean bPhai, Date dNgaySinh) {
        this.StrMaNV = StrMaNV;
        this.StrTenNV = StrTenNV;
        this.bPhai = bPhai;
        this.dNgaySinh = dNgaySinh;
    }

    public TTNhanVienGiaoVu() {
        this.StrMaNV = "";
        this.StrTenNV = "";
        this.bPhai = false;
        this.dNgaySinh = new Date(2023-01-01);
    }

    public String getStrMaNV() {
        return StrMaNV;
    }

    public void setStrMaNV(String StrMaNV) {
        this.StrMaNV = StrMaNV;
    }

    public String getStrTenNV() {
        return StrTenNV;
    }

    public void setStrTenNV(String StrTenNV) {
        this.StrTenNV = StrTenNV;
    }

    public boolean isbPhai() {
        return bPhai;
    }

    public void setbPhai(boolean bPhai) {
        this.bPhai = bPhai;
    }

    public Date getdNgaySinh() {
        return dNgaySinh;
    }

    public void setdNgaySinh(Date dNgaySinh) {
        this.dNgaySinh = dNgaySinh;
    }
    
    
}
