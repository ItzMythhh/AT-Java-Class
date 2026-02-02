import java.io.File;
import java.util.Scanner;

public class PRINTER {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File("customers.txt"));
        input.useDelimiter("[,\\s\\n]+");

        System.out.println("--------------------------------------");
        System.out.println("ID Name Balance");
        System.out.println("-------------------------------------");

        while (input.hasNext()) {
            int id = input.nextInt();
            String name = input.next();
            double balance = input.nextDouble();

            String idText = "" + id;
            while (idText.length() < 6) {
                idText = "0" + idText;
            }

            System.out.println(idText + " " + name + " $" + balance);
        }

        input.close();
    }
}
