import java.util.Scanner;
import java.util.HashSet;

public class hello {
    public static Scanner ip = new Scanner(System.in);

    public static void testcase() {
        String a = ip.nextLine();
        int dem = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '3') {
                dem++;
            } else if (a.charAt(i) == '5') {
                dem++;
            }
        }
        if (dem == 3 || dem == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        testcase();
    }
}