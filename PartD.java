// Liam Cesar AT Java 11/10/2025
public class PartD {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // count lines
            for (int j = 5; j > i; j--) { // dots
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) { // numbers
                System.out.print(i);
            }
            System.out.println(); // new line
        }
    }
}
