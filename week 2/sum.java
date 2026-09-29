public class sum {

    static void findSum(int[] arr) {

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive = positive + arr[i];
            }

            if (arr[i] < 0) {
                negative = negative + arr[i];
            }
        }

        System.out.println("Positive Sum = " + positive);
        System.out.println("Negative Sum = " + negative);
    }

    public static void main(String[] args) {

        int[] arr = {5, 15, -1, 86, 0, -9, -8, 0};

        findSum(arr);
    }
}