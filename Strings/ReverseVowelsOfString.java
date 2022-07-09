import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char l = arr[left];
            char r = arr[right];
            if(set.contains(l) && set.contains(r)){
                char t = arr[left];
                arr[left]= arr[right];
                arr[right]=t;
                left++;
                right--;
            }else if(set.contains(r)){
                left++;
            }else{
                right--;
            }
        }
        return new String(arr);
    }
}
