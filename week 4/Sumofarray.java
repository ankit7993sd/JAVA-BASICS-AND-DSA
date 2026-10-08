import java.util.Scanner;

public class Sumofarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][3];

      
        int sum = 0;

       
        System.out.println("Enter 12 numbers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {

                    arr[i][j][k] = sc.nextInt();

                }
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 3; k++) {

                    System.out.print(arr[i][j][k] + " ");

                    sum = sum + arr[i][j][k];
                }

                System.out.println();
            }

            System.out.println();
        }

       
        System.out.println("Sum of all numbers = " + sum);

       
    }
}