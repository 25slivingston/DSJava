/*Write a program that has a method that takes a variable number of double values 
as its argument.  The method then calculates and returns the average of these
 parameters as a double value.

public static double average(double… values)

Test your method for the following cases,
average(10, 8, 10)
average(scores)  where scores is an array of doubles equal to {100, 90, 80, 100, 80}

Important Note: If you use a partially filled array to store your values,
 then when you calculate the average using your method, you should pass a 
 copy of your original array that only contains the valid test scores. 
 You can use the Arrays.copyOf() static method to make a new copy of the original 
 array that is only equal in length to the current size of your partially filled array.

 */

import java.util.Arrays;
import java.util.Scanner;

public class PartB {
    public static double average(double... values){ //outputs a double, doubles... values it will take any number of values and convert them into an array
    double total = 0;
    for (int i = 0; i < values.length; i++) {
        total = total + values[i]; //look thru all the boxes for the box with the index of i and add it to the total to start adding for the average
    }
    double avg = total/values.length;
    return avg;
}
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("the average is: " + average(100, 200, 300));



    }

}