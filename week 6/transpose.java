
public class transpose {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] t = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                t[c][r] = a[r][c];
            }
        }
        for (int r = 0; r < cols; r++) {
            for (int c = 0; c < rows; c++) {
                System.out.print(t[r][c] + " ");
            }
            System.out.println();
        }
    }
}
