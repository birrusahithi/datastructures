import java.util.Stack;

public class ReverseWordsInString {
    public String reversee(String s){
        Stack<Character> stack = new Stack<>();
        int left =0;
        int right = s.length()-1;
        StringBuilder str = new StringBuilder();
        while(right>=left){
            char c = s.charAt(right);
            if(!Character.isWhitespace(c)){
                stack.push(c);
            }else{
                while(!stack.isEmpty()){
                    str.append(stack.pop());
                }
                if(right!=0){
                    str.append(" ");
                }
            }
            right--;
        }
        System.out.println(str);
        return str.toString();
    }
    public static void main(String[] args){
        ReverseWordsInString obj = new ReverseWordsInString();
        String s = "   the sky is blue  ";
        obj.reversee(s);

    }
}
