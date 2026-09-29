import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];


        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

 
        for (int i = 0; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(" The Maximum Value is " + max);
        System.out.println("The Minimum Value is " + min);

        
    }
}