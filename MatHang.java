package dsmathang;
public class MatHang {
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
