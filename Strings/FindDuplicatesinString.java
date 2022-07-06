import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesinString {
    public static boolean findDuplicates(String input){
        List<Character> result = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
           char c = input.charAt(i);
           if(result.contains(c)){
               return false;
           }else{
               result.add((c));
           }
        }
        return true;
    }
    public static List<Character> finddup(String input){
        List<Character> res = new ArrayList<>();
        List<Character> use = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(!use.contains(c)){
                use.add(c);
            }
            else{
                res.add(c);
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        String s = "abcadb";
        findDuplicates(s);
        finddup(s);

    }
}
