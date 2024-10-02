package dsmathang;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class MatHang {
    private String ma;
    private String ten;
    private String donvi;
    private int giamua;
    private int giaban;
    private static int cnt = 1;

    public MatHang(String ten, String donvi, int giamua, int giaban) {
        this.ma = "MH" + String.format("%03d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
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

    public String getDonvi() {
        return donvi;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getGiaban() {
        return giaban;
    }

    public int getLoiNhuan() {
        return giaban - giamua;
    }

    public String toString() {
        return ma + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + getLoiNhuan();
    }

}

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            a.add(new MatHang(ten, donvi, giamua, giaban));
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) {
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MatHang x : a) {
            System.out.println(x);

        }
    }
}
