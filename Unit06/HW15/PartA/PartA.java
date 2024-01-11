import java.util.Arrays;
import java.util.Scanner;

public class PartA {
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
         * After data has been entered, print the elements on a single
         * line that starts and ends with an asterisk ('*') and with each element
         * separated by an asterisk.
         */

        System.out.print("origional: ");

        for (int i = 0; i < currentSize; i++) { // limits it so it doesn't print a bunch of 0s until 10.
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");





        // print with *s
        for (int i = 0; i <= currentSize-1; i++) {
            System.out.print("*" + numbers[i]);
        }
        System.out.println("*");

        // Sort the array
        Arrays.sort(numbers, 0, currentSize);
        // print the sorted array backwards
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }

    }
}