import java.util.*;

public class ageverfication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        
        if (age >= 18) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }
    }
}