import java.util.Scanner;

public class panildone
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;

        while (left < right)
        {
            if (word.charAt(left) != word.charAt(right))
            {
                isPalindrome = false;
            }
            left++;
            right--;
        }

        if (isPalindrome)
        {
            System.out.println("its a Palindrome");
        }
        else
        {
            System.out.println("its not a palindrome");
        }
    }
}
