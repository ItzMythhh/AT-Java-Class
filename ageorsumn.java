import java.util.Scanner;

public class ageorsumn {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Your age is: " + age);
    }
}
