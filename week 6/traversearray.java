
public class traversearray {
    public static void main(String[] args) {
        int[][] a = {
            {10, 20, 30},
            {40, 50, 60}
        };

        for (int r = 0; r < a.length; r++) {
            int sum = 0;

            for (int c = 0; c < a[r].length; c++) {
                sum += a[r][c];
            }

            System.out.println("Row " + r + " sum = " + sum);
        }
    }
}
