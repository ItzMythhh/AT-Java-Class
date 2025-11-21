public class die
{
    public static void main(String[] args)
    {
        int die1;
        int die2;

        do
        {
            die1 = (int)(Math.random() * 6) + 1;
            die2 = (int)(Math.random() * 6) + 1;

            System.out.println(die1 + " and " + die2);

        } while (die1 != die2);

        System.out.println("match found. Done.");
    }
}
