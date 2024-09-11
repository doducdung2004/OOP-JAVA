import java.util.Arrays;
import java.util.Scanner;

public class DayConTangDan {

    static int[] a = new int[10005];
    static int[] b = new int[10005];
    static int k, n;
    public static Scanner ip = new Scanner(System.in);

    public static void isReturn() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[b[i]] + " ");
        }
        System.out.println();

    }

    public static void Try(int i, int cnt) {
        for (int j = cnt; j <= k + cnt - 1; j++) {
            b[i] = j;
            if (i == k) {
                isReturn();
            } else
                Try(i + 1, cnt + 1);
        }
    }

    public static void main(String[] args) {
        int t = ip.nextInt();
        while (t-- > 0) {
            n = ip.nextInt();
            k = ip.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            Try(1, 1);
        }
    }
}
