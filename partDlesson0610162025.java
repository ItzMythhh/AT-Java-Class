import java.util.Scanner;

public class partDlesson0610162025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of cookies: ");
        int cookies = in.nextInt();

        double pricePerCookie = 0.99;
        double subtotal = cookies * pricePerCookie;

        double discountRate;
        if (cookies > 24) {
            discountRate = 0.15;
        } else if (cookies > 12) {
            discountRate = 0.05;
        } else if (cookies > 6) {
            discountRate = 0.025;
        } else {
            discountRate = 0.0;
        }

        double discountAmount = subtotal * discountRate;
        double total = subtotal - discountAmount;

        System.out.println();
        System.out.println("Cougar Baking Company");
        System.out.println("Cookies: " + cookies);
        System.out.printf("Price each: $%.2f%n", pricePerCookie);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Discount: $%.2f%n", discountAmount);
        System.out.printf("TOTAL: $%.2f%n", total);

        in.close();
    }
}
