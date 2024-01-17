
/*Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
Every element at an even index.
Every even element.
All elements in reverse order.
Only the first and last element.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ProjectPartA {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            double r = 10 * Math.random(); // 0 to 9

            int val = (int) r + 1; // 1 to 10
            numbers[i] = val;
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("");
        System.out.println("Every element at an even index: ");
        for (int i = 0; i< numbers.length; i++) {
            if (i%2 == 0) {
                System.out.print(numbers[i]);
                
            }
            if (i%2 == 0 && i < numbers.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println("");



        System.out.println("Every even element: ");
                for (int i = 0; i< numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                System.out.print(numbers[i]);
                
            }
            if (numbers[i]%2 == 0 && i < numbers.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println("");



        System.out.println("all elements in reverse order: ");
                for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            } 
        }
        System.out.println("");



         System.out.println("first and last element: ");
                for (int i = 0; i< numbers.length; i++) {
            if (i == 0) {
                System.out.print(numbers[i]);
                System.out.print(", ");
            }
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            }
        }
        System.out.println("");

    }
}
