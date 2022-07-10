public class AddStrings {
        public String addStrings(String num1, String num2) {
            StringBuilder res = new StringBuilder();
            int right1 = num1.length()-1;
            int r = num2.length()-1;
            int carry =0;
            int sum =0;
            int c =0;
            int b =0;
            while(right1>=0 || r>=0){
                if(right1>=0){
                    c = num1.charAt(right1)-'0';
                }else{
                    c = 0;
                }
                if(r>=0){
                    b = num2.charAt(r)-'0';
                }else{
                    b=0;
                }
                sum = carry + c + b;
                carry = sum/10;
                int append = sum%10;
                res.append(append);
                right1--;
                r--;
            }
            if(carry>0){
                res.append(carry);
            }
            return res.reverse().toString();
        }
    }
