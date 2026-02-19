import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TESTAVGAGAIN {
    public static void main(String[] args) {
        File file = new File("mathmeet.txt");

        try {
            Scanner in = new Scanner(file);
            in.useDelimiter("[,\n]+");

            double total = 0;
            int count = 0;

            System.out.println("Name\t\t\tSchool\t\t\tScore");
            System.out.println("--------------------------------------------------");

            while (in.hasNext()) {
                String name = in.next().trim();
                String school = in.next().trim();
                double score = in.nextDouble();

                System.out.printf("%-20s %-20s %.1f%n", name, school, score);

                total = total + score;
                count = count + 1;
            }

            in.close();

            double average = total / count;

            System.out.println("--------------------------------------------------");
            System.out.printf("Average score: %.2f%n", average);

        } catch (FileNotFoundException e) {
            System.out.println("Error opening FILE!");
            System.out.println(e.getMessage());
        }
    }
}
