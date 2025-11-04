// AT Java Liam Cesar 11/4/2025
public class rndavg {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 10) + 1;
            sum = sum + num;
        }

        System.out.println("Average: " + (sum / 10.0));
    }
}
