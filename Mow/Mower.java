package Mow;

import java.util.Random;

import Mow.Yard;

public class Mower {

    private int verticalPosition;
    private int horizontalPosition;
    private int direction;

    public int getHorizontalPos() {
        return horizontalPosition;
    }

    public int getVerticalPos() {
        return verticalPosition;
    }

    public void setHorizontalPos(int inputcol) {
        horizontalPosition = inputcol;
    }

    public void setVerticalPos(int inputrow) {
        verticalPosition = inputrow;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int inputdirection) {

        if (0 <= inputdirection && inputdirection < 3) {
            direction = inputdirection;
        } else {
            System.err.println("Direction entered is not a number between 0 and 3. Please enter a new direction.");
        }
    }

    public void moveMower() {
        if (direction == 0) {
            verticalPosition--;
        } else if (direction == 1) {
            horizontalPosition++;
        } else if (direction == 2) {
            verticalPosition++;
        } else {
            horizontalPosition--;
        }
    }

    public void turnLeft() {
        direction--;
        if (direction < 0) {
            direction = 3;
        } else if (direction > 3) {
            direction = 0;
        }
    }

    public void turnRight() {
        direction++;
        if (direction < 0) {
            direction = 4;
        } else if (direction > 3) {
            direction = 0;
        }
    }

    public void mowSpace(Yard currentYard) {
        currentYard.setLawnSquare(getVerticalPos(), getHorizontalPos(), ' ');
    }

    public boolean checkSquare(Yard inputYard) {
        if (direction == 0 && (inputYard.getLawnSquare(getVerticalPos() - 1, getHorizontalPos()) == 'R'
                || inputYard.getLawnSquare(getVerticalPos() - 1, getHorizontalPos()) == ' ')) {
            return true;
        } else if (direction == 1 && (inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() + 1) == 'R'
                || inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() + 1) == ' ')) {
            return true;
        } else if (direction == 2 && (inputYard.getLawnSquare(getVerticalPos() + 1, getHorizontalPos()) == 'R'
                || inputYard.getLawnSquare(getVerticalPos() + 1, getHorizontalPos()) == ' ')) {
            return true;
        } else if (direction == 3 && (inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() - 1) == 'R'
                || inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() - 1) == ' ')) {
            return true;
        }
        return false;
    }

    public void randomize(Yard inputYard) {
        int yardwidth = inputYard.getWidth();
        int yardheight = inputYard.getHeight();

        Random rand = new Random();
        int corner = rand.nextInt(4) + 1;

        if (corner == 1) {
            setHorizontalPos(1);
            setVerticalPos(yardheight);
        } else if (corner == 2) { 
            setHorizontalPos(1);
            setVerticalPos(1);
        } else if (corner == 3) {
            setHorizontalPos(yardwidth);
            setVerticalPos(yardheight);
        } else { 
            setHorizontalPos(yardwidth);
            setVerticalPos(1);
        }

        direction = rand.nextInt(4);
    }

    public boolean updateLeftMower(Yard inputYard) {
        char squareLeft;
        if (direction == 0) {
            squareLeft = inputYard.getLawnSquare(verticalPosition, horizontalPosition - 1);
        } else if (direction == 1) {
            squareLeft = inputYard.getLawnSquare(verticalPosition - 1, horizontalPosition);
        } else if (direction == 2) {
            squareLeft = inputYard.getLawnSquare(verticalPosition, horizontalPosition + 1);
        } else {
            squareLeft = inputYard.getLawnSquare(verticalPosition + 1, horizontalPosition);
        }
        if (squareLeft == '+') {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateRightMower(Yard inputYard) {
        char squareRight;
        if (direction == 0) {
            squareRight = inputYard.getLawnSquare(verticalPosition, horizontalPosition + 1);
        } else if (direction == 1) {
            squareRight = inputYard.getLawnSquare(verticalPosition + 1, horizontalPosition);
        } else if (direction == 2) {
            squareRight = inputYard.getLawnSquare(verticalPosition, horizontalPosition - 1);
        } else {
            squareRight = inputYard.getLawnSquare(verticalPosition - 1, horizontalPosition);
        }
        if (squareRight == '+') {
            return true;
        } else {
            return false;
        }
    }
}
