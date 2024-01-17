/*Write a program that uses an ArrayList to obtain a list of 
integer values from the user.  (use 'q' to quit),
 */


 import java.util.Arrays;
import java.util.Scanner;

public class ProjectPartB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // this is what the array is called numbers
        System.out.print("Enter integer values or 'q' to quit: ");
        // use a partially filled array to hold numbers.
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                break;
            } else {
                if (currentSize < numbers.length) {
                    numbers[currentSize] = input.nextInt();
                    currentSize = currentSize + 1;
                } else {
                    System.out.println("Array is full!");
                    break;
                }
            }
        }

/*
compute the alternating sum of all elements 
in the ArrayList. For example, if your program reads the input

1 4 9 16 9 7 4 9 11

then it computes

1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2 */

int evens = 0;

System.out.println("Every even element: ");
        for (int i = 0; i< currentSize; i++) {
            if (i%2 == 0) {
                evens = evens + numbers[i];
            }
            
        }
        System.out.print("sum of all the even numbers: " + evens);
        System.out.println("");

        int odds = 0;
        System.out.println("Every odd element: ");
        for (int i = 0; i< currentSize; i++) {
            if (i%2 != 0) {
                odds = odds + numbers[i];
            }
            
        }
        System.out.print("sum of all the odd numbers: " + odds);
        System.out.println("");



        int alternatingSum = (evens - odds);
        System.out.println("ALTERNATING SUM: "+ alternatingSum);

    }
}