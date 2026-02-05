import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class report {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("sales.txt"));

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");

            String dept = parts[0].trim();
            String manager = parts[1].trim();
            String revenueText = parts[2].trim();

            double revenue;

            if (revenueText.equalsIgnoreCase("n/a")) {
                revenue = 0.0;
            } else {
                revenue = Double.parseDouble(revenueText);
            }

            System.out.printf("%-17s | %-10s | $ %9.2f%n", dept, manager, revenue);
        }

        file.close();
    }
}
