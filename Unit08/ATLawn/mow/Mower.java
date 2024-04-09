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
}
