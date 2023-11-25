/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author nhamt
 */
public class Users {
    private String strTenTK;
    private String strMK;
    private String strMota;

    public Users(String strTenTK, String strMK, String strMota) {
        this.strTenTK = strTenTK;
        this.strMK = strMK;
        this.strMota = strMota;
    }
    
    public Users(){
        this.strTenTK = "";
        this.strMK = "";
        this.strMota = "";
    }
    
    public String getStrTenTK() {
        return strTenTK;
    }

    public String getStrMK() {
        return strMK;
    }

    public String getStrMota() {
        return strMota;
    }

    public void setStrTenTK(String strTenTK) {
        this.strTenTK = strTenTK;
    }

    public void setStrMK(String strMK) {
        this.strMK = strMK;
    }

    public void setStrMota(String strMota) {
        this.strMota = strMota;
    }
}


