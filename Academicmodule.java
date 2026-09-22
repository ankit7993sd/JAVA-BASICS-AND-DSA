import java.util.Scanner;

public class Academicmodule {

    static double calculate_attendence(int attended, int total) {
        return ((double) attended / total) * 100;
    }

    static double calculate_Avrage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    static boolean check_elegibility(double attendance, double average) {
        if (attendance >= 75 && average >= 40) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Attendance input
        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        // Marks input
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        
        double attendance = calculate_attendence(attended, total);
        double average = calculate_Avrage(m1, m2, m3);

        boolean eligible = check_elegibility(attendance, average);

        
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Average Marks: " + average);
        System.out.println("Eligibility: " + eligible);

        sc.close();
    }
}