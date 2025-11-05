public class LongestWordManual {
    public static void main(String[] args) {
        String s = "I love programming in Java";
        int maxLen = 0, start = 0, end = 0;
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') j++;
            int len = j - i;
            if (len > maxLen) { maxLen = len; start = i; end = j; }
            i = j + 1;
        }
        System.out.println(s.substring(start, end));
    }
}
