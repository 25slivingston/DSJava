/*Write a program that asks the user to specify the name of a text file for reading:
Ask the user to specify a filename or the # character to quit.
If the user types in the # character, say goodbye and quit the program run
If a file is found with that name, open the file for reading.
Display each word on its own line on the computer screen.
Close the file when you are finished reading from it.
End the program run
If the file is not found, display an error message to the user
Let the user know that the file was not found.
Repeat the process to get the file name (specify a filename or the # character to quit).
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW22PartA {
    public static void main(String[] args) {

        String check = " ";
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("What file do you want to open, or # to quit.");
            check = in.next();
            if (check.equals("#")) {
                System.out.print("goodbye");
                break;
            }

            try {
                File inputFile = new File(check);
                Scanner infile = new Scanner(inputFile);
                infile.useDelimiter("[,\\n]+"); //use a delimiter for ',' and new line
                while (infile.hasNext()) {
                    String word = infile.next().trim(); // also trims it usint .trim() !!!
                    System.out.println(word);
                }
                infile.close();
            } catch (FileNotFoundException exception) {
                System.out.println("File not found!  Exiting main method.");
                return;
            }
        }
    }
}

/*
 * public static void main(String[] args) {
 * try {
 * File inputFile = new File("Data.txt");
 * Scanner in = new Scanner(inputFile);
 * while (in.hasNextLine()) {
 * String last = in.next();
 * String first = in.next();
 * String word = in.next();
 * double balance;
 * try {
 * balance = Double.parseDouble(word);
 * } catch (NumberFormatException exception) {
 * balance = 0;
 * }
 * 
 * 
 * }
 * in.close();
 * System.out.println("Googbye");
 * } catch (FileNotFoundException e) { //e is the object (variable) of the file
 * not found exception
 * System.out.println("you stink, the file was not found. :<");
 * System.out.println(e.getMessage()); //prints the error message using the
 * variable e
 * System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeeee");
 * 
 * 
 * }
 * }
 * }
 */