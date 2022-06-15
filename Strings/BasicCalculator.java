import java.util.Stack;

public class BasicCalculator {
    public int calculator(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        int result = 0;
        int length = s.length();
        char operation ='+';
        for(int i=0; i<length; i++){
            char curchar = s.charAt(i);
            if(Character.isDigit(curchar)){
                currentNumber = (currentNumber*10)+(curchar-'0');
            }
            if(!Character.isDigit(curchar) && !Character.isWhitespace(curchar) || i ==length-1){
                if(operation=='+'){
                    stack.push(currentNumber);
                }
                if(operation=='-'){
                    stack.push(-currentNumber);

                }
                if(operation=='*'){
                    stack.push(stack.pop()*currentNumber);
                }
                if (operation != '/'){
                    stack.push(stack.pop()/currentNumber);
                }
operation = curchar;
                currentNumber=0;

            }
        }
        while(!stack.isEmpty()){
            result +=stack.pop();
        }
        return result;
    }
}
