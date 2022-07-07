public class LengthOfLastWord {
        public int lengthOfLastWord(String s) {
            int length =0;
            int a = s.length();
            while(a>0){
                a--;
                if(s.charAt(a)!=' '){
                    length++;
                }
                else if(length>0){
                    return length;
                }

            }
            return length;
        }
    }

