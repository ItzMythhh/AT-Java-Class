public class vowel
{
   public static int countVowels(String phrase)
   {
      int count = 0;

      for (int i = 0; i < phrase.length(); i++)
      {
         char c = phrase.charAt(i);

         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
             c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
         {
            count++;
         }
      }

      return count;
   }

   public static void main(String[] args)
   {
      System.out.println(countVowels("gello ethan friedburg"));
   }
}
