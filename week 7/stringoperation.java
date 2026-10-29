
public class stringoperation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);

        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());

        String str = sb.toString();
        System.out.println("Final string: " + str);
    }
}
