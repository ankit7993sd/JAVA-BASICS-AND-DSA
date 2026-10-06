import java.util.Arrays;

public class Twopointer {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30,10, 40, 50};
        int target = 10;

        int[] result = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[j] = arr[i];
                j++;
            }
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("After removing " + target + ": " + Arrays.toString(result));
    }
}