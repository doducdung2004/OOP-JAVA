import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            List<Student> students = readStudentsFromFile("SV.in");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> readStudentsFromFile(String filename) throws FileNotFoundException, ParseException {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String className = scanner.nextLine();
            String birthDate = scanner.nextLine();
            double gpa = Double.parseDouble(scanner.nextLine());

            students.add(new Student(name, className, birthDate, gpa));
        }

        scanner.close();
        return students;
    }
}