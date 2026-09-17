import java.util.*;
public class sumupton {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int sum = 0;
         for (int i =1 ; i <=num ;i++){
            sum = i +sum;

         }
         System.out.print("The sum of the number is "+sum);
    
}
}
