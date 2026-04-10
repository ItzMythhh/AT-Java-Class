package Mow;

public class Yard {

    private int length;
    private int width;
    private char[][] yard;

    public Yard(int rows, int cols) {
        length = rows + 2;
        width = cols + 2;
        yard = new char[length][width];

        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (row == 0 || row == yard.length - 1 || col == 0 || col == yard[0].length - 1) {
                    yard[row][col] = 'R';
                } else {
                    yard[row][col] = '+';
                }
            }
        }
    }

    public char getLawnSquare(int row, int col) {
        return yard[row][col];
    }

    public void setLawnSquare(int row, int col, char value) {
        yard[row][col] = value;
    }

    public int getHeight() {
        return yard.length - 2;
    }

    public int getWidth() {
        return yard[0].length - 2;
    }

    public void printLawn(Mower mower) {
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (mower.getVerticalPos() == row && mower.getHorizontalPos() == col) {
                    if (mower.getDirection() == 0) {
                        System.out.print("^");
                    } else if (mower.getDirection() == 1) {
                        System.out.print(">");
                    } else if (mower.getDirection() == 2) {
                        System.out.print("v");
                    } else {
                        System.out.print("<");
                    }
                } else {
                    System.out.print(yard[row][col]);
                }
            }
            System.out.println();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
