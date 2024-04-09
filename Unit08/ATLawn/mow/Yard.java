package mow;

import mow.Mower;

public class Yard {
    private char yard[][];

    // constructor for yard:

    public Yard(int height, int width) {
        // create array to hold lawn + brick border
        yard = new char[height + 2][width + 2];

        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                if (i == 0 || i == yard.length - 1 || j == 0 || j == yard[0].length - 1) {
                    yard[i][j] = 'R';
                } else {
                    yard[i][j] = '+';
                }
            }
        }
    }

    // this method returns what value is at a spot on the yard
    public char getValue(int row, int column) {
        return yard[row][column];

    }

    // changes what's in the yard
    public void setValue(int row, int column, char newValue) {
        yard[row][column] = newValue;
    }

    public void printYard() { // if there isn't a mower
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {

                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }

    public void printYard(Mower mower) { //if there is a mower
        
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                if (mower.getRow() == i && mower.getColumn() == j){
                    //print the mower
                    if()
                } else {
                    //print the yard
                    System.out.print(yard[i][j]);
                }

                
            }
            System.out.println();
        }
    }
}
