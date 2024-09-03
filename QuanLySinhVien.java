class Ngay {
    private int ngay, thang, nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

}

class Lop {
    private String tenLop;
    private String tenKhoa;

    public Lop(String tenLop, String tenKhoa) {
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

}

class SinhVien {
    private String maSo, hoTen;
    private Ngay ngaySinh;
    private int diemTb;
    private Lop lop;

    public SinhVien(String maSo, String hoTen, Ngay ngaySinh, int diemTb, Lop lop) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTb = diemTb;
        this.lop = lop;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(int diemTb) {
        this.diemTb = diemTb;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String tenKhoa() {
        return this.lop.getTenKhoa();
    }

    public void diemChuan() {
        if (this.diemTb >= 5) {
            System.out.println("DAT");
        } else {
            System.out.println("FAIL");
        }
    }

}

public class QuanLySinhVien {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(10, 2, 2010);
        Ngay ngay2 = new Ngay(20, 3, 2020);
        Ngay ngay3 = new Ngay(12, 9, 2004);
        Lop lop1 = new Lop("D22CQKH02-B", "Khoa hoc may tinh");
        Lop lop2 = new Lop("D22DCCN10", "Cong nghe thong tin");
        Lop lop3 = new Lop("D22DCCN09", "An toan thong tin ");
        SinhVien sv1 = new SinhVien("001", "do duc dung", ngay1, 9, lop1);
        SinhVien sv2 = new SinhVien("002", "tran anh tu", ngay2, 8, lop2);
        SinhVien sv3 = new SinhVien("003", "nguyen anh tuan", ngay3, 1, lop3);
        System.out.println(sv1.tenKhoa());
        System.out.println(sv2.tenKhoa());
        System.out.println(sv3.tenKhoa());
        System.out.println("Sinh vien 1 :");
        sv1.diemChuan();
        System.out.println("Sinh vien 2 :");
        sv2.diemChuan();
        System.out.println("Sinh vien 3 :");
        sv3.diemChuan();

    }

}
