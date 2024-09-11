import java.util.Scanner;

public class ChuanHoaHoTen2 {

    public static Scanner ip = new Scanner(System.in);

    public static String chuanHoa(String x) {
        if (x.length() == 1) {
            return x.toUpperCase();
        }
        return x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
    }

    public static String chuanHoa2(String x) {
        if (x.length() == 1) {
            return x.toUpperCase();
        }
        return x.substring(0, x.length()).toUpperCase();
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(ip.nextLine());
        while (t-- > 0) {
            String x = ip.nextLine().trim();
            String[] arr = x.split("\\s+");
            for (int i = 1; i < arr.length; i++) {
                arr[i] = chuanHoa(arr[i]);
            }
            arr[0] = chuanHoa2(arr[0]);

            for (int i = 1; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[arr.length - 1] + ", " + arr[0]);
        }
    }
}
