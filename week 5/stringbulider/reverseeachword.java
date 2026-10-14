
import java.util.Scanner;

public class reverseeachword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");


        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
