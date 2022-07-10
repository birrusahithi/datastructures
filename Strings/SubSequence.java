public class SubSequence {
    public Boolean isSequence(String s, String t) {
        int left = 0;
        int right = s.length();
        int l = 0;
        int r = t.length();
        while (left < right && l < r) {
            if (s.charAt(left) == t.charAt(l)) {
                left++;
                l++;
            } else {
                l++;
            }
        }
        return left == right;
    }

    public static void main(String[] args) {
        SubSequence obj = new SubSequence();
        String s = "abc";
        String t = "ahbgdc";
        obj.isSequence(s, t);
    }
}
