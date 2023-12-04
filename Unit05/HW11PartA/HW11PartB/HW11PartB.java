import java.util.Scanner;

public class HW11PartB {

    /*
     * Write a program that asks the user for the radius of a sphere:
     * The radius should be provided as a double value
     * 
     * Write a method that uses this radius to calculate and return the volume of a
     * sphere (as a double value).
     * Your program should use this method to calculate the volume of at least one
     * sphere.
     * 
     * If you recall from geometry class, the volume of the sphere can be calculated
     * using the following equation (where r is the radius of the sphere),
     * 
     * Vol=43r3
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);
        System.out.print("what's the radius? ");
        double radius = input.nextDouble();
        System.out.println(radius);

        // calculate volume.
        double vol = volume(radius);
        System.out.printf("volume = %.2f", vol);
    }
 
    public static double volume(double radius) {
        double volume = (4.0 / 3) * (Math.PI) * (radius * radius * radius);
        return volume;

    }

}
