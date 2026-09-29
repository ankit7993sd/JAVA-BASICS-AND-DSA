import java.util.Scanner;

public class arraychar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] letters = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Character " + (i + 1) + ": ");
            letters[i] = sc.next().charAt(0);
        }

        System.out.print("The characters are: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}