
package DAL;

/**
 *
 * @author Thái Dương
 */
public class LopHocBean {
    private String Lop;
    private float Diemtrungbinh;

    public LopHocBean() {
        this.Lop = "";
        this.Diemtrungbinh = 1;
    }

    public LopHocBean(String Lop, float Diemtrungbinh) {
        this.Lop = Lop;
        this.Diemtrungbinh = Diemtrungbinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public float getDiemtrungbinh() {
        return Diemtrungbinh;
    }

    public void setDiemtrungbinh(float Diemtrungbinh) {
        this.Diemtrungbinh = Diemtrungbinh;
    }

    
    
    
}
