import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Element " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

    
        System.out.print("The elements are: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}