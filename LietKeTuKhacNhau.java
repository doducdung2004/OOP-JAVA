import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] word = s.split("\\s+");
            for (String x : word) {
                String s1 = x.toLowerCase();
                set.add(s1);

            }
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
