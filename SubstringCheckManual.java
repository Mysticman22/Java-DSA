public class SubstringCheckManual {
    public static void main(String[] args) {
        String s = "hello world", sub = "world";
        boolean found = false;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            int j = 0;
            while (j < sub.length() && s.charAt(i + j) == sub.charAt(j)) j++;
            if (j == sub.length()) { found = true; break; }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
