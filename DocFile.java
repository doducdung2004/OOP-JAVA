import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DocFile {
    public static void main(String[] args) {
        try {
            String content = Files.readString(Paths.get("Hello.txt"));
            System.out.println(content);
        } catch (IOException e) {
           
    }
}
}