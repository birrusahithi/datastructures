import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        String s ="Ankith Sahithi\n";
        Path path = Paths.get("/Users/sahithiankith/Desktop/FileHandling.txt");
        Files.write(path, s.getBytes(StandardCharsets.UTF_8));
        String a = "Rohith";
        Files.write(path, a.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        byte [] arr = Files.readAllBytes(path);
        String as = new String(arr);
        System.out.println(as);
        List<String> list = Files.readAllLines(path);
        System.out.println(list);
        String[] str = as.split(",");
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]);
        }
    }
}
