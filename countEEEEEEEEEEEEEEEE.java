// AT Java Liam Cesar 11/4/2025
import java.util.Scanner;

public class countEEEEEEEEEEEEEEEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String text = in.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e')
                count = count + 1;
        }

        System.out.println("Number of e's: " + count);
    }
}
