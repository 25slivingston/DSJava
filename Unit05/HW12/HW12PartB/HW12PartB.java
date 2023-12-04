/*Write a method called smallest (and a program to test it) 
that takes three arguments (as doubles) and returns the smallest of the three: 
double smallest(double x, double y, double z)
 */

import java.util.Scanner;
public class HW12PartB {
//static bc we arent creating an object
    public static double smallest( double x, double y, double z){

        if (x <= y && x <= z) {
            //is x the smallest
            return x;
        }
        else if (y <= x && y <= z) {
            return y;
        }
        else {
            return z;
        }

    }






    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("write a number: ");
        Double x = input.nextDouble();
        System.out.print("write a number: ");
        Double y = input.nextDouble();
        System.out.print("write a number: ");
        Double z = input.nextDouble();

        double smallest = smallest(x, y, z);
        System.out.print("smallest is: ");
        System.out.println(smallest);

    }

}



