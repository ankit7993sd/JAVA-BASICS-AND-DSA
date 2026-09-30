public class expense {
    public static void main(String[] args) {
        int[] arr = {100, 1200, 1600, 8100};

        int sum = 0;
        int biggest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }

        System.out.println("The Total Expense is " + sum);
        System.out.println("The  Expense is " + biggest);
    }
}