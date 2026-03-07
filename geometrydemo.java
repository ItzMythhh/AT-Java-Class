import java.util.Scanner;
import org.derryfield.math.Geometry;

public class geometrydemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of one side of the square: ");
        double side = input.nextDouble();
        
        double perimeter = Geometry.get_perimeter_square(side);
        double area = Geometry.get_area_square(side);
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        
        input.close();
    }
}
