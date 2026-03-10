public class Die {

    private int value;

    public Die() {
        value = 1;
    }

    public Die(int startValue) {
        value = startValue;
    }

    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void display() {

        System.out.println("+-------+");

        if (value == 1) {
            System.out.println("|       |");
            System.out.println("|   0   |");
            System.out.println("|       |");
        }

        else if (value == 2) {
            System.out.println("| 0     |");
            System.out.println("|       |");
            System.out.println("|     0 |");
        }

        else if (value == 3) {
            System.out.println("| 0     |");
            System.out.println("|   0   |");
            System.out.println("|     0 |");
        }

        else if (value == 4) {
            System.out.println("| 0   0 |");
            System.out.println("|       |");
            System.out.println("| 0   0 |");
        }

        else if (value == 5) {
            System.out.println("| 0   0 |");
            System.out.println("|   0   |");
            System.out.println("| 0   0 |");
        }

        else if (value == 6) {
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
        }

        System.out.println("+-------+");
    }
}
