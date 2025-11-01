import java.util.Scanner;

public class ticketmaster {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("name: ");
      String name = in.nextLine();
      System.out.print("day: ");
      String day = in.nextLine();
      System.out.print("time: ");
      String time = in.nextLine();
      System.out.print("age: ");
      if (!in.hasNextInt()) {
         System.err.println("Error: age must be a number");
         return;
      }
      int age = in.nextInt();
      System.out.print("student (y/n)?: ");
      String s = in.next();
      boolean student = false;
      if (s.equalsIgnoreCase("y")) student = true;
      else if (s.equalsIgnoreCase("n")) student = false;
      else {
         System.err.println("Error: must be y or n");
         return;
      }

      if (!time.contains(":")) {
         System.err.println("Error: time format");
         return;
      }

      int colon = time.indexOf(":");
      String h = time.substring(0, colon);
      String m = time.substring(colon + 1);
      int hour = Integer.parseInt(h);
      int minute = Integer.parseInt(m);

      String d = day.toLowerCase();
      double base = 0;
      boolean rush = false;
      if (d.startsWith("mon") || d.startsWith("tue") || d.startsWith("wed") || d.startsWith("thu") || d.startsWith("fri")) {
         if ((hour == 6 && minute >= 0) || (hour == 7 && minute <= 59) || (hour == 16 && minute >= 0) || (hour == 17 && minute <= 59)) {
            base = 100;
            rush = true;
         } else {
            base = 90;
         }
      } else if (d.startsWith("sat") || d.startsWith("sun")) {
         base = 80;
      } else {
         System.err.println("Error: Unknown day");
         return;
      }

      double ageDiscount = 0;
      String ageType = "";

      if (age >= 0 && age <= 2) {
         System.out.println("---------------------------------------------");
         System.out.println("Name: " + name);
         System.out.println("Day: " + day.toUpperCase());
         System.out.println("Time: " + time);
         System.out.println("---------------------------------------------");
         System.out.println("Base Price: $0.00 (FREE BABY)");
         System.out.println("Age Discount: $0.00 (BABY)");
         System.out.println("Student Discount: $0.00");
         System.out.println("---------------------------------------------");
         System.out.println("Final Cost: $0.00");
         System.out.println("---------------------------------------------");
         return;
      } else if (age >= 3 && age <= 12) {
         ageDiscount = base * 0.2;
         ageType = "CHILD";
      } else if (age >= 13 && age <= 59) {
         ageDiscount = 0;
         ageType = "ADULT";
      } else if (age >= 60) {
         ageDiscount = base * 0.25;
         ageType = "SENIOR";
      } else {
         System.err.println("Error: bad age");
         return;
      }

      double afterAge = base - ageDiscount;
      double studentDiscount = 0;
      if (student) {
         studentDiscount = afterAge * 0.05;
      }

      double finalCost = afterAge - studentDiscount;

      System.out.println("---------------------------------------------");
      System.out.println("Name: " + name);
      System.out.println("Day: " + day.toUpperCase());
      System.out.println("Time: " + time);
      System.out.println("---------------------------------------------");
      if (rush)
         System.out.println("Base Price: $" + base + " (RUSH HOUR FARE)");
      else
         System.out.println("Base Price: $" + base);
      System.out.println("Age Discount: $" + ageDiscount + " (" + ageType + ")");
      System.out.println("Student Discount: $" + (-studentDiscount));
      System.out.println("---------------------------------------------");
      System.out.println("Final Cost: $" + finalCost);
      System.out.println("---------------------------------------------");
   }
}
