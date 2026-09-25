public class diffofmaxnmin {

    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    static int difference(int a, int b, int c) {
        return max(a, b, c) - min(a, b, c);
    }

    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        int result = difference(a, b, c);

        System.out.println(result);
    }
}