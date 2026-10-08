public class threedarray {

    public static void main(String[] args) {

        int[][] crr = {
            {10, 20, 30, 2},
            {40, 50, 60, 3, 90},
            {70, 80, 90, 4}
        };

        for (int row = 0; row < crr.length; row++) {
            for (int col = 0; col < crr[row].length; col++) {
                System.out.print(crr[row][col] + " ");
            }
            System.out.println();
        }
    }
}