// AT Java Liam Cesar 10/30/2025

import java.util.Scanner;

public class ba {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
      double rate = in.nextDouble();

      System.out.print("Enter the balance: ");
      double balance = in.nextDouble();

      System.out.println("Year |  Int Earned ($)  |  Balance ($)");
      System.out.println("--------------------------------------");

      for (int year = 1; year <= 5; year++) {
         double interest = balance * rate / 100;
         balance = balance + interest;
         System.out.printf("%3d  |  %14.2f  |  %12.2f%n", year, interest, balance);
      }

      in.close();
   }
}
