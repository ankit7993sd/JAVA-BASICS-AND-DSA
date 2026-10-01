
public class palindrome {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {

            if (arr[left] == arr[right]) {
                count++;
            }

            left++;
            right--;
        }

        if (count == arr.length / 2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

