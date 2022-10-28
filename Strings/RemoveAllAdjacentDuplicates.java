import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public String duplicates(String s, int k){
Stack<Integer> stack = new Stack<>();
char[] arr = s.toCharArray();
int j=0;
for(int i=0; i<arr.length; ++i, ++j) {
    arr[j] = arr[i];
    if (j == 0 || arr[j] != arr[j - 1]) {
        stack.push(1);
    } else {
        int increment = stack.pop() + 1;
        if (increment == k) {
            j = j - k;
        } else {
            stack.push(increment);
        }
    }
}
return new String(arr, 0, j);
    }
    public static void main(String[] args){
        String s = "deeedbbcccbdaa";
        RemoveAllAdjacentDuplicates obj = new RemoveAllAdjacentDuplicates();
        int k =3;
        obj.duplicates(s, k);
    }
}
