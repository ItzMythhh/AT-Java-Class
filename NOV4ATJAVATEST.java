// AT JAVA 11/4/2025 Liam Cesar
import java.util.Scanner;

public class NOV4ATJAVATEST
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("enter first side: ");
      if (!in.hasNextInt())
      {
             System.out.println("error not an integer");
         return;
      }
      int a = in.nextInt();
      
      System.out.print("enter second side: ");
      if (!in.hasNextInt())
      {
         System.out.println("error not an integer");
         return;
      }
 int b = in.nextInt();
      
      System.out.print("enter third side: ");
      if (!in.hasNextInt())
      {
         System.out.println("error not an integer");
         return;
      }
      int c = in.nextInt();
      
      if (a <= 0 || b <= 0 || c <= 0)
      {
         System.out.println("error sides must be greater than 0");
         return;
      }
      
      if (a + b > c && a + c > b && b + c > a)
      {
         if (a == b && b == c)
            System.out.println("its an Equilateral triagle");
         else if (a == b || a == c || b == c)
            System.out.println("its an Isosceles triangle");
         else
            System.out.println("its a scalene triangle");
      }
      else
         System.out.println("it is NOT a triangle");
   }
}
