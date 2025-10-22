import java.util.Scanner;

public class AllRoadsLeadToRome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number 1..3999: ");
        int n = in.nextInt();

        if (n < 1 || n > 3999) {
            System.out.println("Error");
            return;
        }

        int thousands = n / 1000;
        int hundreds  = (n % 1000) / 100;
        int tens      = (n % 100) / 10;
        int ones      = n % 10;

        String roman = "";

        if (thousands == 3) roman += "MMM";
        else if (thousands == 2) roman += "MM";
        else if (thousands == 1) roman += "M";

        if (hundreds == 9) roman += "CM";
        else if (hundreds == 8) roman += "DCCC";
        else if (hundreds == 7) roman += "DCC";
        else if (hundreds == 6) roman += "DC";
        else if (hundreds == 5) roman += "D";
        else if (hundreds == 4) roman += "CD";
        else if (hundreds == 3) roman += "CCC";
        else if (hundreds == 2) roman += "CC";
        else if (hundreds == 1) roman += "C";

        if (tens == 9) roman += "XC";
        else if (tens == 8) roman += "LXXX";
        else if (tens == 7) roman += "LXX";
        else if (tens == 6) roman += "LX";
        else if (tens == 5) roman += "L";
        else if (tens == 4) roman += "XL";
        else if (tens == 3) roman += "XXX";
        else if (tens == 2) roman += "XX";
        else if (tens == 1) roman += "X";

        if (ones == 9) roman += "IX";
        else if (ones == 8) roman += "VIII";
        else if (ones == 7) roman += "VII";
        else if (ones == 6) roman += "VI";
        else if (ones == 5) roman += "V";
        else if (ones == 4) roman += "IV";
        else if (ones == 3) roman += "III";
        else if (ones == 2) roman += "II";
        else if (ones == 1) roman += "I";

        System.out.println(roman);
    }
}
