import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThiSinh1 {
    private String hoTen;
    private String ngaySinh;
    private float diem1;
    private float diem2;
    private float diem3;

    public ThiSinh1(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public float tongDiem() {
        return diem1 + diem2 + diem3;
    }

    public String Format() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ngaySinh);
            return formatter.format(date);

        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
}

public class ThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.next();
        Float z = sc.nextFloat();
        Float t = sc.nextFloat();
        Float k = sc.nextFloat();
        ThiSinh1 sv1 = new ThiSinh1(x, y, z, t, k);
        System.out.printf(sv1.getHoTen() + " " + sv1.Format() + " " + "%.1f\n", sv1.tongDiem());

    }
}
