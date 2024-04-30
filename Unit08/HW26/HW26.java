/*Assignment:
Part A:
List an example of each of the following and write a simple program that demonstrates how these items are used:
A Java-provided constant static value that is often used in mathematical and/or scientific calculations.
A Java-provided static method that is often used in mathematical and/or scientific calculations.
You can submit your answer for this part of the assignment as a Java program file (through MSA or GitHub).

 */

//math.random() is a static method math.pi()

public class HW26 {

    public static void main(String[] args) {
        System.out.println("pi = " + Math.PI); // this is just a value so you dont have to use parenthisis

        System.out.println("random number up to 20 = " + (int) (Math.random() * 20 + 1)); // this is a method so you
                                                                                          // have to have parentisis

    }
}
