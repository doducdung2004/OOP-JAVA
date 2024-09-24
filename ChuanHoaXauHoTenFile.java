import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuanHoaXauHoTenFile {
    public static void chuanHoa(String s) {
        s = s.trim().toLowerCase();
        String[] words = s.split("\\s+");
        String res = "";
        for (String word : words) {
            res += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println(res.trim());
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file2 = new File("DATA.in");
        Scanner sc = new Scanner(file2);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            chuanHoa(s);
        }

    }
}
