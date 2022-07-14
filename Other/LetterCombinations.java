import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private List<String> list = new ArrayList<>();
    private Map<Character, String> map;

    private String s;

    public List<String> letterCombinations(String digits) {
        this.map = new HashMap<>();
        map.put( '2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if (digits.length() == 0) {
            return list;
        }
        s = digits;
        backtrack(0, new StringBuilder());
        System.out.println(list);
        return list;
    }

    private void backtrack(int index, StringBuilder path) {
        if (path.length() == s.length()) {
            list.add(path.toString());
            return;
        }
        String possibleLetters = map.get(s.charAt(index));
        for (char letter: possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
    public static void main(String[] args){
LetterCombinations obj = new LetterCombinations();
String s = "234";
obj.letterCombinations(s);
    }
}
