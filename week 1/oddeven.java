public class oddeven {
    public static void main(String[] args) {

        System.out.println("Even Numbers:");
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                if (i%5 == 0)
                    continue; 
                System.out.println(i);
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                if (i%5 == 0)
                    continue; 
                System.out.println(i);
            }
        }
    }
}