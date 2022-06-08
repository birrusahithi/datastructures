import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    public int romanToInt(String s) {
        String lastsymb = s.substring(s.length()-1);
        int lastval= map.get(lastsymb);
        int total = lastval;
        for(int i =s.length()-2; i>0; i--){
            String cursymb = s.substring(i, i+1);
            int curval = map.get(cursymb);
            if(curval<lastval){
                total -= curval;
            }else{
                total += curval;
            }
            lastval = curval;
        }
        return total;
    }
}