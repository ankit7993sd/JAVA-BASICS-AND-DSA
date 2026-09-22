
public class employee {

    String name;
    int age;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        employee emp = new employee();

        emp.name = "Ankit";
        emp.age = 21;
        emp.salary = 135000;

        emp.display();
    }
}
