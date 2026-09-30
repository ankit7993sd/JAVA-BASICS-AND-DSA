public class moveahead {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[arr.length];


        arr2[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr2[i] = arr[i - 1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}