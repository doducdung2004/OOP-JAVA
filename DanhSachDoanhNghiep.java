import java.util.*;
import java.io.*;
import java.util.Scanner;

class doanhnghiep implements Comparable<doanhnghiep> {
    private String ma, ten;
    private int soSV;

    public doanhnghiep(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    public int getSoSV() {
        return soSV;
    }

    public String getTen() {
        return ten;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }

    @Override
    public int compareTo(doanhnghiep a) {
        return this.ma.compareTo(a.ma);
    }

}

public class DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<doanhnghiep> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            ds.add(new doanhnghiep(ma, ten, soSV));
        }
        Collections.sort(ds);
        for (doanhnghiep tmp : ds) {
            System.out.println(tmp);
        }
        sc.close();
    }
}