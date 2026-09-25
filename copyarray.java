import java.util.Scanner;

public class copyarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Element " + (i + 1) + ": ");
            number[i] = sc.nextInt();
        }


    }
}