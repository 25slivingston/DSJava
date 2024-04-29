package mow;

import mow.Yard;

public class Mower {
    private int row;
    private int column;
    private int direction;

    public void setPosition(int row, int column) {
        this.row = row;
        this.column = column;

    }

    public int getRow() {
        return row;

    }

    public int getColumn() {
        return column;

    }

    public void setDirection(int newDirection) {

        direction = newDirection;
    }

    public int getDirection() {
        return direction;

    }

    public void moveForward() {
        // facing up
        if (direction == 0) {
            row = row - 1;
            // facing right
        } else if (direction == 1) {
            column = column + 1;
            // facing down
        } else if (direction == 2) {
            row = row + 1;
        } else if (direction == 3) {
            column = column - 1;
        }

    }

    public void turnLeft() {
        // facing up
        if (direction == 0) {
            direction = 3;
            // facing right
        } else if (direction == 1) {
            direction = 0;
            // facing down
        } else if (direction == 2) {
            direction = 1;
        } else if (direction == 3) {
            direction = 2;
        }
    }

    public void turnRight() {
        if (direction == 0) {
            direction = 1;
            // facing right
        } else if (direction == 1) {
            direction = 2;
            // facing down
        } else if (direction == 2) {
            direction = 3;
        } else if (direction == 3) {
            direction = 0;
        }
    }

    public char senseBrick(Yard yard) {
        int targetRow = 0;
        int targetColumn = 0;

        // facing up
        if (direction == 0) {
            targetColumn = column;
            targetRow = row - 1;
            // facing right
        } else if (direction == 1) {
            targetColumn = column + 1;
            targetRow = row;
            // facing down
        } else if (direction == 2) {
            targetColumn = column;
            targetRow = row + 1;
        } else if (direction == 3) {
            targetColumn = column - 1;
            targetRow = row;
        }

        return yard.getValue(targetRow, targetColumn);
    }

    public void cutGrass(Yard yard) {
        if (yard.getValue(row, column) != 'R') {
            yard.setValue(row, column, ' ');
        }
    }

    public void randomise(Yard yard) {
        // place the mower in one of the 4 corners of the lawn
        // randomise its direction
        // random number from 0 to 3
        int randomNumber = (int) (Math.random() * 4);

    }

    public boolean updateMower(Yard yard) {
        // check to see if there is any grass left in front
        if (senseBrick(yard) == '+') {
            // there is unmowed grass in front
            moveForward();
            return true;
        } else {
            // turn to the right
            turnRight();
            if (senseBrick(yard) == '+') {
                // there is unmowed grass in front
                moveForward();
                return true;
            } else {
                turnLeft();
                turnLeft();
                if (senseBrick(yard) == '+') {
                    moveForward();
                    return true;
                } else {
                    // there is nothing left to cut
                    return false;
                }

            }
        }
        // if so, move to the next avalable spot of grass return true
        // else return false
        // if not a +, turn the mower and sense to see if that one is a plus.
        // if there are no grass to any side your mower is done.

    }
}