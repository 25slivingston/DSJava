import java.util.Arrays;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20]; // this is what the array is called numbers
        System.out.print("Enter integer values or 'q' to quit: ");
        // use a partially filled array to hold numbers.
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                input.next(); //this clears the input holder so the rest of the code can work
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



        //ask for an ingerger
        System.out.print("Give an integer: ");
        int value = input.nextInt();
        System.out.println("the number to find is " + value);

        int counter = 0;
        for (int i = 0; i <= currentSize - 1; i++) {
            
            if (numbers[i] == value) {
                counter = counter + 1;
            }
        }
        System.out.println("how many times " + value + " showed up was " + counter);








    }
}