/*Part B:
Write a Java program that opens this file called "quizzes.txt" for reading:
Open the file for reading
Open another file called "quizzesMod.txt" for writing
Read in the double values
Write each formatted value to the output file on a separate line as shown below
Calculate the average value of the quiz scores
Record the average value at the end of the file
Close both files when done

Your output file must be formatted as shown below in order to receive full credit:

Quiz 000: 100.00
Quiz 001:  90.00
Quiz 002:  80.00
Quiz 003:  70.00
Quiz 004: 110.00
Quiz 005: 120.00
Quiz 006:  60.00
Quiz 007:  80.00
Quiz 008:  90.00
Quiz 009: 100.00
----------------
Average:   90.00
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class PartBHW19 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(outputFile);  


        double total = 0;
        int count = 0;
        while (in.hasNext()) {
            double value = in.nextDouble();
            total = total + value;
            System.out.printf("Quiz %03d: %6.2f %n", count, value);
            //System.out.print(count +"     "+ value + "\n");
            count = count + 1;
        }

        System.out.println("----------------");
        System.out.printf("Average:  %6.2f", total/count);

/* 
        for (int i = 0; i < values.size(); i++) {
            System.out.printf("%6d", values.get(i));//use values.get because arraylist is a method.
            if (values.get(i) == lowest) {
                System.out.print(" <- Lowest");
            }
            System.out.println("");
        }
         */

        in.close();
        out.close();
    }
}