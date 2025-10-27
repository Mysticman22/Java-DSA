public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming", res = "";
        for (char c : s.toCharArray()) if (res.indexOf(c) == -1) res += c;
        System.out.println(res);
    }
}
