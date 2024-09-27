import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Time {
    public int gio;
    public int phut;
    public int giay;

    public Time(int giay, int gio, int phut) {
        this.giay = giay;
        this.gio = gio;
        this.phut = phut;
    }

    public int getGio() {
        if (gio < 100) {
            return gio;
        } else
            return 0;
    }

    public int getPhut() {
        if (phut <= 59) {
            return phut;
        } else
            return 0;
    }

    public int getGiay() {
        if (giay <= 59) {

            return giay;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }

}

public class SapXepThoiGian2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int p = sc.nextInt();
            int g = sc.nextInt();
            Time time1 = new Time(g, h, p);
            arr.add(time1);
        }
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time t1, Time t2) {
                if (t1.getGio() != t2.getGio()) {
                    return t1.getGio() - t2.getGio();
                } else if (t1.getPhut() != t2.getPhut()) {
                    return t1.getPhut() - t2.getPhut();
                } else
                    return t1.getGiay() - t2.getGiay();
            }
        });
        for (Time x : arr) {
            System.out.println(x);
        }
    }

}
