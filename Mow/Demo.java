import java.util.Scanner;
import Mow.Yard;
import Mow.Mower;

public class YardDemo {

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = input.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = input.nextInt();

        Yard yard = new Yard(height, width);

        Mower mower = new Mower();
        mower.setVerticalPos(1);
        mower.setHorizontalPos(1);
        mower.setDirection(1);

        while (mower.getHorizontalPos() <= yard.getWidth()) {
            Yard.clearScreen();
            mower.mowSpace(yard);
            yard.printLawn(mower);
            delay(500);
            mower.moveMower();
        }

        input.close();
    }
}
