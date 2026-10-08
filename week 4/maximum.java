import java.util.Scanner;

public class maximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][3];

        int min;

        System.out.println("Enter 12 numbers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        min = arr[0][0][0];

        System.out.println("3D Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {

                    System.out.print(arr[i][j][k] + " ");

                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }
                }

                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Maximum value = " + min);

        sc.close();
    }
}