import java.util.Scanner;

public class QUIZZZZZZ {

    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score (0 to 100): ");

        String input = in.nextLine();        // get what the user types
        int score = Integer.parseInt(input); // try to turn it into a number

        if (score < 0 || score > 100) {
            throw new NumberFormatException(); // not in range
        }

        return score; // return valid score
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int s = getQuizScore(in);
            System.out.println("You entered: " + s);
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid quiz score.");
        }

        in.close();
    }
}
