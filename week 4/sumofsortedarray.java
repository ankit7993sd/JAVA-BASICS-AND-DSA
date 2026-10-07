public class sumofsortedarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 28, 8, 10};
        int target = 30;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                break;
            }
            else 
                i++;
                j--;
            }
        }
    }
