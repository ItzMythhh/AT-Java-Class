// AT Java Liam Cesar 10/22/2025
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String a = in.next();
        String b = in.next();
        String c = in.next();

        if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
            System.out.println(a);
            if (b.compareTo(c) <= 0) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
            System.out.println(b);
            if (a.compareTo(c) <= 0) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (a.compareTo(b) <= 0) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
