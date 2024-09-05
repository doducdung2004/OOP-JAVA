import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while (t-- > 0) {

            String x = ip.next();
            int l = x.length();
            int dem = x.charAt(0) - '0', ok = 0;
            for (int i = 1; i < l; i++) {
                int a = x.charAt(i) - '0';
                int b = x.charAt(i - 1) - '0';
                if (Math.abs(a - b) == 2) {
                    dem = dem + x.charAt(i) - '0';
                } else {
                    ok = ok + 1;
                }

            }
            if (dem % 10 == 0 && ok == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
