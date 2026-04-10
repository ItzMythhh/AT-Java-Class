package Mow;

import java.util.Random;

public class Mower {

    private int verticalPosition;
    private int horizontalPosition;
    private int direction;

    public int getVerticalPos() {
        return verticalPosition;
    }

    public int getHorizontalPos() {
        return horizontalPosition;
    }

    public void setVerticalPos(int row) {
        verticalPosition = row;
    }

    public void setHorizontalPos(int col) {
        horizontalPosition = col;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int newDirection) {
        if (newDirection >= 0 && newDirection <= 3) {
            direction = newDirection;
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
        }
    }

    public void turnRight() {
        direction++;
        if (direction > 3) {
            direction = 0;
        }
    }

    public void mowSpace(Yard yard) {
        yard.setLawnSquare(verticalPosition, horizontalPosition, ' ');
    }

    public void randomize(Yard yard) {
        Random random = new Random();
        int corner = random.nextInt(4);
        direction = random.nextInt(4);

        if (corner == 0) {
            verticalPosition = 1;
            horizontalPosition = 1;
        } else if (corner == 1) {
            verticalPosition = 1;
            horizontalPosition = yard.getWidth();
        } else if (corner == 2) {
            verticalPosition = yard.getHeight();
            horizontalPosition = 1;
        } else {
            verticalPosition = yard.getHeight();
            horizontalPosition = yard.getWidth();
        }
    }

    public boolean updateMower(Yard yard) {
        if (frontIsGrass(yard)) {
            moveMower();
            return true;
        } else if (rightIsGrass(yard)) {
            turnRight();
            moveMower();
            return true;
        } else if (leftIsGrass(yard)) {
            turnLeft();
            moveMower();
            return true;
        } else {
            return false;
        }
    }

    public boolean frontIsGrass(Yard yard) {
        if (direction == 0) {
            return yard.getLawnSquare(verticalPosition - 1, horizontalPosition) == '+';
        } else if (direction == 1) {
            return yard.getLawnSquare(verticalPosition, horizontalPosition + 1) == '+';
        } else if (direction == 2) {
            return yard.getLawnSquare(verticalPosition + 1, horizontalPosition) == '+';
        } else {
            return yard.getLawnSquare(verticalPosition, horizontalPosition - 1) == '+';
        }
    }

    public boolean rightIsGrass(Yard yard) {
        if (direction == 0) {
            return yard.getLawnSquare(verticalPosition, horizontalPosition + 1) == '+';
        } else if (direction == 1) {
            return yard.getLawnSquare(verticalPosition + 1, horizontalPosition) == '+';
        } else if (direction == 2) {
            return yard.getLawnSquare(verticalPosition, horizontalPosition - 1) == '+';
        } else {
            return yard.getLawnSquare(verticalPosition - 1, horizontalPosition) == '+';
        }
    }

    public boolean leftIsGrass(Yard yard) {
        if (direction == 0) {
            return yard.getLawnSquare(verticalPosition, horizontalPosition - 1) == '+';
        } else if (direction == 1) {
            return yard.getLawnSquare(verticalPosition - 1, horizontalPosition) == '+';
        } else if (direction == 2) {
            return yard.getLawnSquare(verticalPosition, horizontalPosition + 1) == '+';
        } else {
            return yard.getLawnSquare(verticalPosition + 1, horizontalPosition) == '+';
        }
    }
}
