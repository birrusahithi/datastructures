import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        if(s==null){
            return "";
        }
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else if(c==')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        for(int j=0; j<s.length(); j++){
            if(!set.contains(j)){
                st.append(s.charAt(j));
            }
        }
        return st.toString();
    }
}

