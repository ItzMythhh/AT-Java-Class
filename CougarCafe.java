// AT Java Liam Cesar 10/19/2025
import java.util.Scanner;

public class CougarCafe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is today Monday? (type yes or no): ");
        String monday = in.next();

        System.out.print("Enter customer's age: ");
        int age = in.nextInt();

        System.out.print("Enter meal cost: ");
        double cost = in.nextDouble();

        boolean isMonday = monday.equals("yes");
        double rate;

        if (isMonday) {
            if (age < 13) {
                rate = 0.075;
            } else if (age >= 50) {
                rate = 0.15;
            } else {
                rate = 0.05;
            }
        } else {
            if (age < 13) {
                rate = 0.05;
            } else if (age >= 50) {
                rate = 0.075;
            } else {
            rate = 0.0;
            }
        }

        double finalcost = cost - cost * rate;

        System.out.println("Discount rate: " + (rate * 100) + "%");
        System.out.println("Final meal cost: " + finalcost);
    }
}
