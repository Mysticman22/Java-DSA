public class CountManual {
    public static void main(String[] args) {
        String s = "I love Java programming";
        int count = 0, i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') i++;
            if (i < s.length()) count++;
            while (i < s.length() && s.charAt(i) != ' ') i++;
        }
        System.out.println(count);
    }
}
