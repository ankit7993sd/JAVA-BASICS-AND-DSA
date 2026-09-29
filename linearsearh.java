import java.util.Scanner;

public class linearsearh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int target =96;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        for(int i =0;i<arr.length; i ++){
            if (arr[i]==target){
            System.out.println("Element Found at index " + i );
            break;
            
            
            }
        }
    

    }
}