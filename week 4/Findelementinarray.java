
public class Findelementinarray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 10, 14},
            {20, 3, 25, 28},
            {40, 5, 38, 24},
            {25, 31, 16, 12}
        };
        int target = 24;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                System.out.print(i + " " + j );
                break;
                }
            }
        }

    }

}
