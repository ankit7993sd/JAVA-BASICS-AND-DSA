
public class reverstring {

    static String reverseEachWordNormalizeSpaces(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                ans.append(' ');
            }
            ans.append(new StringBuilder(words[i]).reverse());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "  Hello   World Java  ";
        System.out.println(reverseEachWordNormalizeSpaces(s));
    }
}
