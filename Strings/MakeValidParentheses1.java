public class MakeValidParentheses1 {
    public String validParentheses(String s) {
        StringBuilder st = new StringBuilder();
        int open =0;
        int balance =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                open++;
                balance++;
            }
            if(c==')'){
                if(balance==0){
                    continue;
                }else{
                    balance--;
                }
            }
            st.append(c);

        }
        StringBuilder result = new StringBuilder();
        int ob = open-balance;
        for(int j=0; j<st.length(); j++){
            char f = st.charAt(j);
            if(f=='('){
                ob--;
                if(ob<0){
                    continue;
                }
            }
            result.append(f);
        }
        return result.toString();
    }
    
    public static void main(String[] args){
        MakeValidParentheses1 obj = new MakeValidParentheses1();
        String s = "))((";
        obj.validParentheses(s);
    }
}
