// AT Java Liam Cesar 10/22/2025
import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        long A = Math.round(a * 100);
        long B = Math.round(b * 100);

        if (A == B) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }
}
