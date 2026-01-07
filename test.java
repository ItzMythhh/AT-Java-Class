import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] a = new double[10];
        int i = 0;
        double sum = 0;
        double max = 0;

        while (i < 10) {

            System.out.print("Enter score or q: ");
            String x = s.nextLine();

            if (x.equals("q")) {
                break;
            }

            double n = Double.parseDouble(x);

            a[i] = n;
            sum = sum + n;

            if (i == 0 || n > max) {
                max = n;
            }

            i = i + 1;
        }

        double avg = 0;

        if (i > 0) {
            avg = sum / i;
        }

        System.out.println("Count: " + i);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);

        s.close();
    }
}
