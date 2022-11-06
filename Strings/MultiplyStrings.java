package Strings;
/*
Given two non-negative integers num1 and num2 represented as strings,
        return the product of num1 and num2, also represented as a string.
        Input: num1 = "2", num2 = "3"
        Output: "6"
*/
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        StringBuilder first = new StringBuilder(num1);
        StringBuilder second = new StringBuilder(num2);
        first.reverse();
        second.reverse();
        int n = first.length()+second.length();
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<n; i++){
            ans.append(0);
        }
        for(int i =0; i<second.length(); i++){
            int digit2 = second.charAt(i)-'0';
            for(int j =0; j<first.length(); j++){
                int digit1 = first.charAt(j)-'0';
                int curpos = i+j;
                int carry = ans.charAt(curpos)-'0';
                int multiplication = (digit2*digit1)+carry;
                ans.setCharAt(curpos, (char)(multiplication%10 + '0'));
                int value = ans.charAt(curpos+1) -'0'+ multiplication/10;
                ans.setCharAt(curpos+1, (char)(value+'0'));
            }
        }
        if(ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }

        ans.reverse();
        return ans.toString();
    }
}
