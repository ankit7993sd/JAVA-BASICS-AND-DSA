
import java.util.*;

public class mobliedata {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your total data plan in GB ");
        float data_plan = sc.nextFloat();
         System.out.print("Enter your total data Used in GB ");
        float data_used = sc.nextFloat();
        float data_used_percentage = (data_used/data_plan)*100;
        System.out.println("You Have used "+data_used_percentage +"Percent of your data" );
        float data_left = data_plan - data_used;
         System.out.println("You Have  "+data_left +"gb data left" );
        if (data_left<=1){
        System.out.println("::::::Low Data Alert :::::::" );
        }
        else if (data_used_percentage>=80){
        System.out.println("::::::High Usage Warning :::::::" );
        }
        else
        System.out.println("::::::Normal useage :::::::" );

    }
}
