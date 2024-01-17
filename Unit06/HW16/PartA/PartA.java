/* Write a program that uses a partially filled array of doubles to record quiz scores:
Scan in quiz scores from the user until the user enters 'q' to quit
Print the quiz scores in a neat manner for the user to review
Ask the user if they would like to drop the lowest score (type 'y' to do so)
If the user wants to drop the lowest score, do the following
Ask the user which score they want to drop
Use a method to drop the lowest score from the array of doubles
The array should be passed to the method as an argument
If there is more than one quiz with the same lowest score, only drop the first instance of the score
Preserve the order of the remaining test scores as you drop the lowest score
After dropping the lowest score, reprint the scores array 
 */

 import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static int[] linearSearch(int[] numbers, int dropit) { //spits out an array, takes in the dropit number and the origional array.
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != dropit) {
               
                numbers[i] = input.nextInt();
                    
            }
            break; 
        }
        return numbers;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[20]; // this is what the array is called numbers
        System.out.print("Enter test scores or 'q' to quit: ");
        // use a partially filled array to hold numbers.
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                input.next();
                break;
            } else {
                if (currentSize < numbers.length) {
                    numbers[currentSize] = input.nextDouble();
                    currentSize = currentSize + 1;
                } else {
                    System.out.println("Array is full!");
                    break;
                }
            }
        }

       
        //print it normally with commas

        System.out.print("the array in question: ");

        for (int i = 0; i <= currentSize - 1; i++) {
            System.out.print(numbers[i]);
            if (i >= 0) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }
        


        //ask the user if they want to drop the lowest value
        System.out.print("would you like to drop the lowest test score? ");
        String yOrN = input.next();
        if (yOrN.equals("y") || yOrN.equals("Y")) {
             
            System.out.println("write the index of the score you want to drop.");
            int dropit = input.nextInt();

        } else {
            System.out.println("um sure ig");
        }
        //make the new array with the dropped grade
        double[] numbersDroppedOne = new double[20];
        for (i = 0; i < numbersDroppedOne.length; i++) {
            if (i != dropit) {
                numbersDroppedOne[i] = numbers[i];

            }
        }
    }
}