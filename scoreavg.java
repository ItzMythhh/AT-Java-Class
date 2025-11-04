// AT Java Liam Cesar 11/4/2025
import java.util.Scanner;

public class scoreavg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double score, sum = 0;
        int count = 0;

        System.out.println("Enter scores (negative number to stop):");
        score = in.nextDouble();

        while (score >= 0) {
            sum = sum + score;
            count = count + 1;
            score = in.nextDouble();
        }

        if (count > 0)
            System.out.println("Average: " + (sum / count));
        else
            System.out.println("No scores entered.");
    }
}
