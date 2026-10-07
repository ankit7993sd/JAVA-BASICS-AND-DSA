public class TimeComplexity {

    static void constantTime(int[] arr) {
        System.out.println("First element: " + arr[0]);
    }

    static void linearTime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void quadraticTime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    static void logarithmicTime(int n) {
        while (n > 1) {
            System.out.println("n = " + n);
            n = n / 2;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("=== O(1) Constant Time ===");
        constantTime(arr);

        System.out.println("\n=== O(n) Linear Time ===");
        linearTime(arr);

        System.out.println("\n=== O(n²) Quadratic Time ===");
        quadraticTime(arr);

        System.out.println("\n=== O(log n) Logarithmic Time ===");
        logarithmicTime(32);
    }
}