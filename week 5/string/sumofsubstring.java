import java.util.Scanner;

public class sumofsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                sum += Integer.parseInt(sub);
            }
        }

        System.out.println("Sum of all substrings = " + sum);

    }
}