public class employee {

    String name;
    int age;
    double salary;

   
    void displayName() {
        System.out.println("Name: " + name);
    }

    void displayAge() {
        System.out.println("Age: " + age);
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

       
        employee emp = new employee();

       
        emp.name = "Ankit";
        emp.age = 21;
        emp.salary = 135000;

        emp.displayName();
        emp.displayAge();
        emp.displaySalary();
    }
}