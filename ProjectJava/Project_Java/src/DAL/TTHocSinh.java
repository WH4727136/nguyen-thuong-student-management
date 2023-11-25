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
public class TTHocSinh {
    private String strMahs;
    private String strTenhs;
    private String strMalop;
    private boolean bphai;
    private Date dngaysinh;

    public TTHocSinh(String strMahs, String strTenhs, String strMalop, boolean bphai, Date dngaysinh) {
        this.strMahs = strMahs;
        this.strTenhs = strTenhs;
        this.strMalop = strMalop;
        this.bphai = bphai;
        this.dngaysinh = dngaysinh;
    }

    public TTHocSinh() {
        this.strMahs = "";
        this.strTenhs = "";
        this.strMalop = "";
        this.bphai = false;
        this.dngaysinh = new Date(2023-1-1);
    }

    public String getStrMahs() {
        return strMahs;
    }

    public void setStrMahs(String strMahs) {
        this.strMahs = strMahs;
    }

    public String getStrTenhs() {
        return strTenhs;
    }

    public void setStrTenhs(String strTenhs) {
        this.strTenhs = strTenhs;
    }

    public String getStrMalop() {
        return strMalop;
    }

    public void setStrMalop(String strMalop) {
        this.strMalop = strMalop;
    }

    public boolean isBphai() {
        return bphai;
    }

    public void setBphai(boolean bphai) {
        this.bphai = bphai;
    }

    public Date getDngaysinh() {
        return dngaysinh;
    }

    public void setDngaysinh(Date dngaysinh) {
        this.dngaysinh = dngaysinh;
    }
    
    
}
