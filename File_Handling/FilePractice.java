import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        String s = "File Practice";
        Path p = Paths.get("/Users/sahithiankith/Documents/Java_Projects");
       Files.write(p, s.getBytes(StandardCharsets.UTF_8));
      byte[] b =  Files.readAllBytes(p);
       String as = new String(b);
        System.out.println(as);
    }
}
