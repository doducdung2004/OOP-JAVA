import java.util.*;
import java.io.*;
import java.util.Scanner;

class monhoc implements Comparable<monhoc> {
    private String ma;
    private String ten;
    private int soTinChi;

    public monhoc(String ma, String ten, int soTinChi) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public int compareTo(monhoc a) {
        return this.ten.compareTo(a.ten);
    }

    public String toString() {
        return ma + " " + ten + " " + soTinChi;
    }
}

public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<monhoc> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            ds.add(new monhoc(ma, ten, soTinChi));
        }
        Collections.sort(ds);
        for (monhoc tmp : ds) {
            System.out.println(tmp);
        }
    }
}
