public class PartB
{
    public static void main(String[] args)
    {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };

        double sum = 0;

        for (double value : numbers)
        {
            System.out.println(value);
            sum = sum + value;
        }

        double average = sum / numbers.length;
        System.out.println("Avg = " + average);
    }
}
