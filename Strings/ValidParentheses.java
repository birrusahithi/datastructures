import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');

            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        char open = stack.pop();
                        if(map.get(open)!=c){
                            return false;
                        }
                    }
                }

            }
            return stack.isEmpty();
        }
    }


