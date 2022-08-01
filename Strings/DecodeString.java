import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countstack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        Stack<StringBuilder> stringStack = new Stack<>();
        int left = 0;
        int right = s.length() - 1;
        int k = 0;
        while (left <= right) {
            char a = s.charAt(left);
            if (Character.isDigit(a)) {
                k = k * 10 + a - '0';
            } else if (a == '[') {
                countstack.push(k);
                k = 0;
                stringStack.push(currentString);
                currentString = new StringBuilder();
            } else if (a == ']') {
                int n= countstack.pop();
                StringBuilder decode = stringStack.pop();
                while(n!=0){
                    decode.append(currentString);
                    n--;
                }
                currentString = decode;
            } else {
                currentString.append(a);
            }
        }
return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        String s = "3[a2[abc]]";
        obj.decodeString(s);
    }
}
