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
public class TTLOPHOC {
    private String StrMalop;
    private String StrMakhoi;
    private String StrMagv;
    private int iSiso;

    public TTLOPHOC(String StrMalop, String StrMakhoi, String StrMagv, int iSiso) {
        this.StrMalop = StrMalop;
        this.StrMakhoi = StrMakhoi;
        this.StrMagv = StrMagv;
        this.iSiso = iSiso;
    }

    public TTLOPHOC() {
        this.StrMalop = "";
        this.StrMakhoi = "";
        this.StrMagv = "";
        this.iSiso = 1;
    }

    public String getStrMalop() {
        return StrMalop;
    }

    public void setStrMalop(String StrMalop) {
        this.StrMalop = StrMalop;
    }

    public String getStrMakhoi() {
        return StrMakhoi;
    }

    public void setStrMakhoi(String StrMakhoi) {
        this.StrMakhoi = StrMakhoi;
    }

    public String getStrMagv() {
        return StrMagv;
    }

    public void setStrMagv(String StrMagv) {
        this.StrMagv = StrMagv;
    }

    public int getiSiso() {
        return iSiso;
    }

    public void setiSiso(int iSiso) {
        this.iSiso = iSiso;
    }
    
    
}
