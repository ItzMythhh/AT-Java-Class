import java.util.Scanner;
import Mow.Yard;
import Mow.Mower;

public class YardDemo {

    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the lawn: ");
        int height = input.nextInt();

        System.out.print("Enter the width of the lawn: ");
        int width = input.nextInt();

        Yard yard = new Yard(height, width);
        Mower mower = new Mower();

        mower.randomize(yard);
        mower.mowSpace(yard);

        Yard.clearScreen();
        yard.printLawn(mower);
        delay(300);

        while (mower.updateMower(yard)) {
            mower.mowSpace(yard);
            Yard.clearScreen();
            yard.printLawn(mower);
            delay(300);
        }

        input.close();
    }
}
