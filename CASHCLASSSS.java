import java.util.Scanner;

public class CASHCLASSSS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister cr = new CashRegister();

        while (true) {
            System.out.print("Enter price, or t=total, c=clear, q=quit: ");
            String input = in.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            } else if (input.equalsIgnoreCase("t")) {
                System.out.println("Items: " + cr.getCount());
                System.out.printf("Total: $%.2f%n", cr.getTotal());
            } else if (input.equalsIgnoreCase("c")) {
                cr.clear();
                System.out.println("Cleared.");
            } else {
                try {
                    double price = Double.parseDouble(input);
                    cr.addItem(price);
                    System.out.println("Added $" + price);
                } catch (NumberFormatException e) {
                    System.out.println("Not valid. Type a number, t, c, or q.");
                }
            }
        }

        in.close();
        System.out.println("Goodbye.");
    }
}
