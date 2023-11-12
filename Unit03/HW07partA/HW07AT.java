import java.util.Scanner;
public class HW07AT {



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        String numerals = "your numeral is: " 
        int number = 0;

        while (number > 3999 || number < 1) {
        System.out.print("Enter and interger between 1 and 3999: ");
        number = input.nextInt();
        }

        System.out.println("your number is " + number);

        while (number >= 1000) {
            //add M 
            numerals = 

            number = number - 1000;
        }
        
        while (number >= 900) {
            //add CM
            number = number - 900;
        }

        while (number >= 500) {
            // add D
            number = number - 100;
        }

        while (number >= 100) {
            // add C
            number = number - 100;
        }

        while (number >= 90) {
            // add XC
            number = number - 90;
        }

        while (number >= 50) {
            // add L
            number = number - 10;
        }

        while (number >= 10) {
            // add X
            number = number - 10;
        }

        while (number >= 9) {
            // add IX
            number = number - 9;
        }

        System.out.println("This is your roman numeral: " + number);




        

       





    }
}