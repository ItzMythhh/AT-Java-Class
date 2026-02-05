import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JOBSAREBAD2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("top5.txt"));

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");

            int rank = Integer.parseInt(parts[0].trim());
            String country = parts[1].trim();
            double rate = Double.parseDouble(parts[2].trim());
            String region = parts[3].trim();

            System.out.printf("Ranked # %2d: %-15s | %6.2f%% | %-20s%n", rank, country, rate, region);
        }

        System.out.println("---------------------------------------------------------------");
        file.close();
    }
}
