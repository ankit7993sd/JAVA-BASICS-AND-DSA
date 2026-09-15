import java.util.*;

public class ageverfication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        
        String result = (age >= 18) ? "You can drink (but donot drink)." : "You cannot drink.";
        
        System.out.println(result);
    }
}