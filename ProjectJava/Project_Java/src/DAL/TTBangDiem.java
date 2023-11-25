/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Thái Dương
 */
public class TTBangDiem {
    private String StrMaBD;
    private String StrMahs;
    private String StrTenhs;
    private String StrLop;
    private String StrMaMH;
    private float fDiemTB;
    private String StrHocLuc;
    private String StrManvString;

    public TTBangDiem(String StrMaBD, String StrMahs, String StrTenhs,String StrLop, String StrMaMH, float fDiemTB, String StrHocLuc, String StrManvString) {
        this.StrMaBD = StrMaBD;
        this.StrMahs = StrMahs;
        this.StrTenhs = StrTenhs;
        this.StrLop = StrLop;
        this.StrMaMH = StrMaMH;
        this.fDiemTB = fDiemTB;
        this.StrHocLuc = StrHocLuc;
        this.StrManvString = StrManvString;
    }


    public TTBangDiem() {
        this.StrMaBD = "";
        this.StrMahs = "";
        this.StrTenhs = "";
        this.StrLop = "";
        this.StrMaMH = "";
        this.fDiemTB = 0.0F;
        this.StrHocLuc = "";
        this.StrManvString = "";
    }

    public String getStrMaBD() {
        return StrMaBD;
    }

    public void setStrMaBD(String StrMaBD) {
        this.StrMaBD = StrMaBD;
    }

    public String getStrMahs() {
        return StrMahs;
    }

    public void setStrMahs(String StrMahs) {
        this.StrMahs = StrMahs;
    }

    public String getStrTenhs() {
        return StrTenhs;
    }

    public void setStrTenhs(String StrTenhs) {
        this.StrTenhs = StrTenhs;
    }

    public float getfDiemTB() {
        return fDiemTB;
    }

    public void setfDiemTB(float fDiemTB) {
        this.fDiemTB = fDiemTB;
    }

    public String getStrHocLuc() {
        return StrHocLuc;
    }

    public void setStrHocLuc(String StrHocLuc) {
        this.StrHocLuc = StrHocLuc;
    }

    public String getStrManvString() {
        return StrManvString;
    }

    public void setStrManvString(String StrManvString) {
        this.StrManvString = StrManvString;
    }

    public String getStrLop() {
        return StrLop;
    }

    public void setStrLop(String StrMaLop) {
        this.StrLop = StrMaLop;
    }
    public String getStrMaMH() {
        return StrMaMH;
    }

    public void setStrMaMH(String StrMaMH) {
        this.StrMaMH = StrMaMH;
    }
    
    
}
