import java.util.Scanner;

public class primedillonlatham
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = in.nextInt();

        boolean isPrime = true;

        if (num <= 1)
        {
            isPrime = false;
        }

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
            }
        }

        if (isPrime)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
