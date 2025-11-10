// Liam Cesar AT Java 11/10/2025
public class PartC {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Problem 1: wrong math (used + instead of *)
        // int result = num1 + num2;
        int result = num1 * num2; // fixed

        // Problem 2: forgot to print properly
        // System.out.print(result);
        System.out.println("The result is " + result); // fixed

        // Problem 3: bad if check (used = instead of ==)
        // if (result = 50) {
        if (result == 50) { // fixed
            System.out.println("It works!");
        }

        // Problem 4: missing semicolon
        // System.out.println("Done")
        System.out.println("Done"); // fixed
    }
}
