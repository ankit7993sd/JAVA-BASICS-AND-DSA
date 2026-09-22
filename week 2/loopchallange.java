import java.util.Scanner;

public class loopchallange {

    static int expense(int totalFood, int price) {
        return totalFood + price;
    }

    public static void main(String[] args) {

        int totalFood = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter food item price (Enter 0 to stop) ");
            int price = sc.nextInt();

            if (price == 0) {
                break;
            }

            totalFood = expense(totalFood, price);
        }

        System.out.println("Total food expense: " + totalFood);

    }
}