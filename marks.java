
import java.util.Scanner;

public class marks {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter Your marks: ");
        int marks = read.nextInt();

        if (marks >= 0 && marks <= 100) {

            if (marks >= 90) {
                System.out.println("You got Grade A+");
                System.out.println("Excellent");

            } else if (marks >= 80) {
                System.out.println("You got Grade A");
                System.out.println("Excellent");

            } else if (marks >= 70) {
                System.out.println("You got Grade A-");
                System.out.println("Good");

            } else if (marks >= 60) {
                System.out.println("You got Grade B+");
                System.out.println("Good");

            } else if (marks >= 50) {
                System.out.println("You got Grade B");
                System.out.println("Good");

            } else if (marks >= 40) {
                System.out.println("You got Grade B-");
                System.out.println("Average");

            } else if (marks >= 30) {
                System.out.println("You got Grade C");
                System.out.println("Fail");

            } else if (marks >= 20) {
                System.out.println("You got Grade D");
                System.out.println("Fail");

            } else {
                System.out.println("You got Grade F");
                System.out.println("Fail");
            }

        } else {
            System.out.println("Enter Valid marks");
        }

        read.close();
    }
}