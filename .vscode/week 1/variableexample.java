public class variableexample {

    static int age = 30;
    int instanceVar = 20;
    static int staticVar = 30;

    public void display() {
        int localVar = 10;

        // instance variable
        // static variable
        // local variable

        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {

        variableexample obj = new variableexample();

        obj.display();

        System.out.println(age);
    }
}