
public class anagram {

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s2);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = sb.indexOf(String.valueOf(ch));

            if (index == -1) {
                return false;
            }

            sb.deleteCharAt(index);
        }

        return sb.length() == 0;
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }
    }
}
