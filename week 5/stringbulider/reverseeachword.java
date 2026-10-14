
import java.util.Scanner;

public class reverseeachword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String str = sc.nextLine();
        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                result = word + " " + result;
                word = "";
            }
        }

        result = word + " " + result;

        System.out.println(result.trim());

        sc.close();
    }
}
