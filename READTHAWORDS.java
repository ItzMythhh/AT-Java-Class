import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class READTHAWORDS {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean done = false;

        while (done == false) {
            System.out.print("Enter a filename or # to quit: ");
            String filename = keyboard.nextLine();

            if (filename.equals("#")) {
                System.out.println("Goodbye!");
                done = true;
            } else {
                try {
                    File file = new File(filename);
                    Scanner fileReader = new Scanner(file);

                    while (fileReader.hasNext()) {
                        String word = fileReader.next();
                        System.out.println(word);
                    }

                    fileReader.close();
                    done = true; // stop after successful read
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                    System.out.println("Please try again.");
                }
            }
        }

        keyboard.close();
    }
}
