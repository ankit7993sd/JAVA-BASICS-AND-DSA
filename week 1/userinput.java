import java.util.*;

public class userinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");

        // byte b = sc.nextByte();
        // short s = sc.nextShort();
        // int i = sc.nextInt();
        // long l = sc.nextLong();
        // float f = sc.nextFloat();
        // double d = sc.nextDouble();
        

        // System.out.println(b);
        // System.out.println(s);
        // System.out.println(i);
        // System.out.println(l);
        // System.out.println(f);
        // System.out.println(d);
        // System.out.println(c);
        // System.out.println(bool);
        char ch = sc.next().charAt(0);
        String name = sc.next();
        System.out.println(ch);
        System.out.println(name);



    
    }
}