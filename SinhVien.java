public class SinhVien {
   private String masv   , hoten , ngaysinh , lop  ;
   private float gpa ;
    int static  cnt = 0 ;
    public SinhVien( String hoten, String lop, String masv, String ngaysinh , float gpa) {
        this.gpa = gpa;
        this.hoten = hoten;
        this.lop = lop;
        this.masv = masv;
        this.ngaysinh = ngaysinh;
    }

    public String getMasv() {
        String ab = "B20DCCN0" + cnt 
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
