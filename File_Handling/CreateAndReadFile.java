import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreateAndReadFile {

    public static void main(String[] args) throws IOException {
        String s = "Grapes,Pineapple,Mango,Lemon,";
        Path path = Paths.get("/users/sahithiankith/Desktop/FileInterview.txt");
        Files.write(path, s.getBytes(StandardCharsets.UTF_8));
        byte[] bytearr = Files.readAllBytes(path);
        String r = new String(bytearr);
        System.out.println(r);
        String add = "Peach";
        Files.write(path, add.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        byte[] again = Files.readAllBytes(path);
        String full = new String(again);
        System.out.println(full);
        String lower = "\nAvocado";
        Files.write(path, lower.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        byte[] arr = Files.readAllBytes(path);
        String more = new String(arr);
        System.out.println(more);
        String[] array = more.split(",");
        for(int i=0; i<array.length; i++){
            System.out.println( array[i]);
        }
        List<String> list = Files.readAllLines(path);
        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }

    }
}











        /*CreateAndReadFile obj = new CreateAndReadFile();
        String s = "Apple,Peach,Pineapple,mango,mango,Peach \n";
        Path path = Paths.get("/Users/sahithiankith/Desktop/first.txt");
        Files.write(path, s.getBytes(StandardCharsets.UTF_8));
        byte[] arr = Files.readAllBytes(path);
        String convert = new String(arr);
        String extend = "grapes";
        Files.write(path, extend.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
       List<String> str = Files.readAllLines(path);*/



    /*String content = "interview, pass, good \n";
    Path path = Paths.get("/users/sahithiankith/desktop/file.text");
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
                byte[] arr = Files.readAllBytes(path);
                String convert = new String(arr);
                System.out.println(convert);
                String s1 = "sahithi, ankith rohit";
                Files.write(path, s1.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                List<String> st = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(st);

        List<String> strs = Files.readAllLines(path, StandardCharsets.UTF_8);
        String[] str2 = new String[strs.size()];
        for(int i=0; i<strs.size(); i++){
        String s = strs.get(i);
        str2 = s.split(",");

        }
        for(int j=0; j<str2.length; j++){
        System.out.println(str2[j]);
        }

*/