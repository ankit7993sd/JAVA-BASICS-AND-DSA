
public class diagonal {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;

        System.out.println("Primary diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + " ");
        }

        System.out.println("\nSecondary diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + " ");
        }
    }
}
