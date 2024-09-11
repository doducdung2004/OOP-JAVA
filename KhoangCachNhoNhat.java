import java.util.Scanner;
import java.util.Arrays;

public class KhoangCachNhoNhat {
    public static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        int t = ip.nextInt();
        while (t-- > 0) {
            int a = ip.nextInt();
            int b = ip.nextInt();
            int[] s = new int[a];
            for (int i = 0; i < a; i++) {
                s[i] = ip.nextInt();
            }
            int dem = 0;

            for (int i = 0; i < a; i++) {
                for (int j = i + 1; j < a; j++) {
                    if (Math.abs(s[j] - s[i]) < b) {
                        dem++;
                    }
                }
            }
            System.out.println(dem);

        }
    }
}
