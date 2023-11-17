import java.util.Scanner;
public class HW09PartC {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double sum = 0.0;
        int count = 10;

        for (int i = 0; i < count; i++) {
            double r = Math.random();
            // System.out.println(i + " = " + r);
            sum = r + sum;
            
        }
        System.out.println("average 10 equals: " + sum / count);

        //------------------------------------------------------------------------

        double sum2 = 0.0;
        int count2 = 1000;

        for (int i = 0; i < count2; i++) {
            double r = Math.random();
            // System.out.println(i + " = " + r);
            sum2 = r + sum2;
            
        }
        System.out.println("average 1000 equals: " + sum2 / count2);



    }
}