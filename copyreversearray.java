public class copyreversearray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}