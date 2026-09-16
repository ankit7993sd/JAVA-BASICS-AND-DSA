import java.util.Scanner;

public class typecasting {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = read.nextInt();

        if (n % 5 == 0) {
            System.out.println("We are inside the if block");
            System.out.println("Given number is divisible by 5");
        }

       System.out.println("we are outside the if b");
    }
}