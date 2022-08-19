import java.util.HashSet;
import java.util.Set;

public class UniqueString {
    public String unique(String s){
        String[] arr = s.split(",");
        Set<String> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            if(set.contains(str)){
                set.remove(str);
            }else{
                set.add(str);
            }
        }
        System.out.println(set.toString());
        return set.toString();
    }
    public static void main(String[] args){
        UniqueString obj = new UniqueString();
        String s = "apple,grapes,mango,apple,peach,pineapple,peach";
        obj.unique(s);
    }
}
