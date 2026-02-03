        import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();

        while (true) {
            System.out.print("enter a quiz score or 'q' to qit: ");
            String input = sc.nextLine();

            if (input.equals("q")) {
                break;
            }

            scores.add(Double.parseDouble(input));
    }

        System.out.println("------------------");

        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%.2f%n", scores.get(i));
            sum += scores.get(i)
                }

        System.out.println("---------------");

        double avg = sum / scores.size();
        System.out.printf("avg = %.2f%n", avg);
    }
}
