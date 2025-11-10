// Liam Cesar AT Java 11/10/2025
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();

        double discount = 0; // start at 0 so no error

        if (num > 12) {
            discount = 0.10;
        } else if (num > 6) {
            discount = 0.05;
        }

        System.out.println("Discount = " + discount);
    }
}
