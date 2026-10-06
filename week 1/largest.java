
import java.util.*;

public class largest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 3 numbers: ");

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first > second && first > third) {

            System.out.print("The greatest number is " + first);

        } else if (third > second && third > first) {

            System.out.print("The greatest number is " + third);

        } else {

            System.out.print("The greatest number is " + second);
        }

        sc.close();
    }
}
