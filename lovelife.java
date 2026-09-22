import java.util.Scanner;

public class lovelife {

    static int calculateCompatibility(int patience, int replyTime, int budget, int arguments) {

        int score = 50;


        if (patience >= 8) {
            score += 15;
        } else if (patience >= 5) {
            score += 10;
        } else {
            score -= 10;
        }

     
        if (replyTime <= 10) {
            score += 15;
        } else if (replyTime <= 30) {
            score += 10;
        } else if (replyTime <= 60) {
            score += 5;
        } else {
            score -= 10;
        }

    
        if (budget >= 10000) {
            score += 10;
        } else if (budget >= 5000) {
            score += 5;
        } else {
            score -= 5;
        }

        if (arguments == 0) {
            score += 10;
        } else if (arguments <= 3) {
            score += 5;
        } else if (arguments <= 6) {
            score -= 5;
        } else {
            score -= 15;
        }

        if (score > 100) {
            score = 100;
        }

        if (score < 0) {
            score = 0;
        }

        return score;
    }

    static String relationshipStatus(int score) {

        if (score >= 80) {
            return "Soulmate Alert ";
        } else if (score >= 65) {
            return "Relationship Material ";
        } else if (score >= 50) {
            return "It's Complicated ";
        } else if (score >= 30) {
            return "Thoda Risk Hai ";
        } else {
            return "Run Bro! ";
        }
    }

    static void printRelationshipResult(int score, String status) {

        System.out.println("Relationship Result ");
        System.out.println("Compatibility Score: " + score);
        System.out.println("Status: " + status);

        if (score < 50) {
            System.out.println("Warning: Relationship thoda risky hai!");
        }

        if (score >= 65 && score < 80) {
            System.out.println("Warning: Arguments thode kam karo ");
        }

        if (score >= 80) {
            System.out.println("Advice: Shaadi ka card design karna start karo ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        while (counter < 3) {

            System.out.println("Love Life Compatibility Test "  + (counter + 1) + " =====");

            System.out.print("Enter patience (1-10): ");
            int patience = sc.nextInt();

            System.out.print("Enter average reply time (minutes): ");
            int replyTime = sc.nextInt();

            System.out.print("Enter monthly relationship budget: ");
            int budget = sc.nextInt();

            System.out.print("Enter number of arguments per month: ");
            int arguments = sc.nextInt();

            int score = calculateCompatibility(
                patience,
                replyTime,
                budget,
                arguments
            );

            String status = relationshipStatus(score);

            printRelationshipResult(score, status);

            counter++;

            

        
    }
    }
}