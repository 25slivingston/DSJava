import java.util.Arrays;
import java.util.Scanner;

class Board {
    char[][] board = { // creates multidimensional array
            { '*', '*', '*' },
            { '*', '*', '*' }, // commas separate the rows
            { '*', '*', '*' }
    };

    public int count = 0;

    public void printBoard() {
        // make the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();
        }

    };

    // this method updated the cell with the character key
    // for row and col. it returns true if it was
    // sucsessfil in updating the cell.
    public boolean updateBoard(int row, int col, char key) {
        // check limits
        if (row < 0 || row >= 3) {
            return false;
        }
        if (col < 0 || col >= 3) {
            return false;
        }
        if (board[row][col] == '*') {
            // cell is avalable;
            board[row][col] = key;
            count = count + 1;
            return true;
        } else {
            return false;
        }

    }
}

public class ProjectPartC {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // main function moment
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declare a new board
        Board board = new Board();

        // loop until quit, done, or winner.
        int row, col;
        while (true) {// clearscreen and display board
            clearScreen();
            board.printBoard();
            int currentPlayer = 1;

            // print curent player number
            System.out.print("Player #" + currentPlayer + ": ");

            // ask the user for a row
            System.out.print("Enter the row for your next move or 'q' to quit: ");
            String reply = input.next();

            // do they want to quit
            if (reply.equals("q") || reply.equals("Q")) {
                // they want to quit
                System.out.print("quitting game");
                break;
            }
            // they don't want to quit, convert value to an interger
            row = Integer.valueOf(reply);

            // ask the user for a row
            System.out.print("Enter the row for your next move or 'q' to quit: ");
            reply = input.next();

            // do they want to quit
            if (reply.equals("q") || reply.equals("Q")) {
                // they want to quit
                System.out.print("quitting game");
                break;
            }
            // they don't want to quit, convert value to an interger
            col = Integer.valueOf(reply);

            // try to update board.
            boolean result;
            if (currentPlayer == 1) {
                result = board.updateBoard(row, col, 'o');

            } else {
                result = board.updateBoard(row, col, 'x');
            }

            // check the result.
            if (result == false) {
                System.out.println("Invalid move >:< Press 'C' to continue: ");
                input.next();
                continue;

            } else {
                // toggle player.
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }

           
            

            // is there a winner?
            // is the board filled?
            if (board.count == 9) {
                clearScreen();
                board.printBoard();
                System.out.println("Board is filled!");
                break;
            }

        }
        System.out.println("goodbye :<");

    }
}