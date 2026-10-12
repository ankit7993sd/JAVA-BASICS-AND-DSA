
public class Symmerticmatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        checkSymmetric(a);
        checkSymmetric(b);
    }

    static void checkSymmetric(int[][] matrix) {
        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric.");
        } else {
            System.out.println("Matrix is not symmetric.");
        }
    }
}
