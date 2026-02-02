import java.io.File;
import java.util.Scanner;

public class letterarrayboom {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File("text.txt"));

        int count = 0;
        int letters = 0;
        int digits = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                count++;

                if (c >= 'A' && c <= 'Z') {
                    letters++;
                }

                if (c >= 'a' && c <= 'z') {
                    letters++;
                }

                if (c >= '0' && c <= '9') {
                    digits++;
                }
            }

            count++;
        }

        input.close();

        System.out.println("count = " + count);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}
