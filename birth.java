import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class birth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                Scanner lineReader = new Scanner(line);

                String name = lineReader.next();
                String yearText = lineReader.next();

                try {
                    int year = Integer.parseInt(yearText);
                    System.out.println(name + " was born in " + year + ".");
                } catch (NumberFormatException e) {
                    System.out.println("I do not know what year " + name + " was born.");
                }

                lineReader.close();
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        keyboard.close();
    }
}
