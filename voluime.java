import java.util.Scanner;

public class voluime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double r = input.nextDouble();

        double volume = sphereVolume(r);

        System.out.println("the volume is: " + volume);
    }

    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        return volume;
    }
}
