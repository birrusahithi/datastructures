import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctChar {
    public int lengthOfSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int length = 0;
        for (int i = 0, j = 0; i < n; i++) {
            int currentlength = 0;
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                map.put(a, i + 1);
            }
            map.put(a, i + 1);
            if (map.size() > k) {
                int min = Collections.min(map.values());
                char c = s.charAt(min - 1);
                map.remove(c);
                j= Math.max(j, min);
            }
            currentlength = i - j + 1;
            length = Math.max(length, currentlength);
        }
        return length;
    }

    public static void main(String[] args) {
        LongestSubstringKDistinctChar obj = new LongestSubstringKDistinctChar();
        String s = "loveleetcode";
        int k =4;
        obj.lengthOfSubstring(s, k);
    }
}
