import java.util.Scanner;

public class ilovecake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        System.out.println("Enter 'c' for cake, 'p' for pie, or 'q' to quit:");

        String choice = "";

        while (!choice.equals("q")) {
            System.out.print("Your choice: ");
            choice = in.nextLine();

            if (choice.equals("c")) {
                cakeCounter.increment();
            } else if (choice.equals("p")) {
                pieCounter.increment();
            } else if (choice.equals("q")) {
            } else {
                System.out.println("Please enter c, p, or q.");
            }
        }

        System.out.println("Total votes for cake: " + cakeCounter.getCount());
        System.out.println("Total votes for pie: " + pieCounter.getCount());
    }
}
