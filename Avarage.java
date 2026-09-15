import java.util.*;

public class Avarage {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter three numbers");
         int i = sc.nextInt();
         int j = sc.nextInt();
         int k = sc.nextInt();

         System.out.print("The three number you have entered are " +i +"," +j +"," +k);
         int avg = (i+j+k)/3;
         System.out.print("The avg value is " + avg);

     }
}
