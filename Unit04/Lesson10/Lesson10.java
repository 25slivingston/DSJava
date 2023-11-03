import java.util.Scanner;
public class Lesson10 {
    public static void main(String[] args) {

       /*  int a;
        double x = 3.14;
        a = (int)x; // if you put a = x; that would be a compile error, the computer would complain */

        //first step to debugging... read the error messages you idiot

       /*  String name = "Harry";
        for (int i=1; i <= name.length(); i++){ //this is an example of a runtime error
            System.out.printn(name.charAt(i)); */ 

        

        //put print statements into your program to track values in your program

        //use debugger software



   Scanner in = new Scanner(System.in);
        double total = 0;
        double value = 0;
        int count = 0;
        do {
            System.out.print("Enter how much money you spent or a negative value to exit: ");
            value = in.nextDouble();
            count = count + 1;
            total = total + value;
        } while (value >= 0);
        
        double avg = total / count;
        System.out.println("The number of values entered is " + count);
        System.out.printf("The average value is %.2f", avg);



    }
}