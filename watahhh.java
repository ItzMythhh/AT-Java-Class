// AT Java Liam Cesar 10/22/2025
import java.util.Scanner;

public class watahhh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double t = in.nextDouble();
        char u = in.next().charAt(0);

        double celsius;
        if (u == 'F' || u == 'f') {
            celsius = (t - 32) * 5.0 / 9.0;
        } else {
            celsius = t;
        }

        String state;
        if (celsius <= 0) {
            state = "solid";
        } else if (celsius >= 100) {
            state = "gaseous";
        } else {
            state = "liquid";
        }

        System.out.printf("At a temperature of %.2f %c, water is in a %s state.%n", t, u, state);
    }
}
