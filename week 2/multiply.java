import java.util.Scanner;

public class multiply {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Element " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + (marks[i] * 5);

        }
        
            System.out.println("The Total marks is " + sum);
    }
    
}
