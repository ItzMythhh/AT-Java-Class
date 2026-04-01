package Mow;

import java.util.Scanner;

public class Yard {

    private int length;
    private int width;
    private char[][] yard;

    private char border = 'R';
    private char unmowed = '+';
    private char mowed = ' ';

    public Yard(int numrows, int numcolums) {
        length = numrows + 2;
        width = numcolums + 2;
        yard = new char[length][width];
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (row == 0) {
                    yard[row][col] = border;
                } else if (row == yard.length - 1) {
                    yard[row][col] = border;
                } else if (col == 0) {
                    yard[row][col] = border;
                } else if (col == yard[0].length - 1) {
                    yard[row][col] = border;
                } else {
                    yard[row][col] = unmowed;
                }
            }
        }
    }

    public char getLawnSquare(int row, int colum) {
        return yard[row][colum];
    }

    public char setLawnSquare(int row, int colum, char newSquare) {
        yard[row][colum] = newSquare;
        return yard[row][colum];
    }

    public int getHeight() {
        int height = yard.length - 2;
        return height;
    }

    public int getWidth() {
        int width = yard[0].length - 2;
        return width;
    }

    public void printLawn(Mower inputMower) {
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (inputMower.getHorizontalPos() == col && inputMower.getVerticalPos() == row) {
                    if (inputMower.getDirection() == 1) {
                        System.out.print(">");
                    } else if (inputMower.getDirection() == 3) {
                        System.out.print("<");
                    } else if (inputMower.getDirection() == 2) {
                        System.out.print("v");
                    } else {
                        System.out.print("^");
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
