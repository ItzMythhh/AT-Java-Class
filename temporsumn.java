import java.util.ArrayList;
import java.util.Scanner;

public class temporsumn
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Enter a temperature (q to quit): ");
            String input = in.nextLine();

            if (input.equals("q"))
            {
                break;
            }

            temps.add(Integer.parseInt(input));
        }

        int lowest = temps.get(0);

        for (int i = 0; i < temps.size(); i++)
        {
            if (temps.get(i) < lowest)
            {
                lowest = temps.get(i);
            }
        }

        for (int i = 0; i < temps.size(); i++)
        {
            if (temps.get(i) == lowest)
            {
                System.out.println(temps.get(i) + " <= lowest");
            }
            else
            {
                System.out.println(temps.get(i));
            }
        }
    }
}
