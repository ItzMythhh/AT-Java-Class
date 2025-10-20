import java.util.Scanner;

public class CougarCafeEnum {
    enum CustomerType { CHILD, ADULT, SENIOR }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is today Monday? (type yes or no): ");
        String monday = in.next();

        System.out.print("Enter customer's age: ");
        int age = in.nextInt();

        System.out.print("Enter meal cost: ");
        double cost = in.nextDouble();

        boolean isMonday = monday.equals("yes");

        CustomerType type;
        if (age < 13) {
            type = CustomerType.CHILD;
        } else if (age >= 50) {
            type = CustomerType.SENIOR;
        } else {
            type = CustomerType.ADULT;
        }

        double rate;

        if (isMonday) {
            if (type == CustomerType.CHILD) {
                rate = 0.075;
            } else if (type == CustomerType.SENIOR) {
                rate = 0.15;
            } else {
                rate = 0.05;
            }
        } else {
            if (type == CustomerType.CHILD) {
                rate = 0.05;
            } else if (type == CustomerType.SENIOR) {
                rate = 0.075;
            } else {
                rate = 0.0;
            }
        }

        double finalCost = cost - cost * rate;

        System.out.println("Customer type: " + type);
        System.out.println("Discount rate: " + (rate * 100) + "%");
        System.out.println("Final meal cost: " + finalCost);
    }
}
    