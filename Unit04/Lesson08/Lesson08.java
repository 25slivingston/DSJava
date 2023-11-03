import java.util.Scanner;
public class Lesson08 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //this is how you count to five the terrible and long way
        /* System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5); */

        System.out.println("-------------------------------");

        //this code is easy to change, is efficient, and's short
        int i = (1);
        while (i < 6) {
            System.out.println(i);
            i = (i + 1);
        }

        System.out.println("---------------------------------------");

        int p = (1);
        while (p < 100) {
            System.out.println(p);
            p = (p * p + p);
        }
        
        //let's move on to conditional loops

        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number q to quit: ");
            if (input.hasNext("q") || input.hasNext ("Q")) {
                break;
            } else {
                if (input.hasNextDouble());
                total = total + input.nextDouble();
            }
        }
        System.out.println(total);



        
    }
}