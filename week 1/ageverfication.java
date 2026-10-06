import java.util.*;

public class ageverfication {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    byte age = sc.nextByte();

    String result = (age >= 18)
            ? ((age <= 60)
                ? "You can drink. Tu mast reh, tu pee sakta hai."
                : "You cannot drink because age is above 60.")
            : "You cannot drink (bacha hai tu).";

    System.out.println(result);
}
}