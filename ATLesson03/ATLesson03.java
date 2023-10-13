import java.util.Scanner;
public class ATLesson03 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);
        System.out.print("What is the value in dollar and cents format? ");
        double price = in.nextDouble();
        System.out.println(price);
        int dollars = (int)price;
        System.out.println("you have " + dollars + " dollars");
        double cents = price%1;
        System.out.println("and " + ((int)(cents*100)) + " cents");

        //OR

        double val = (price-dollars)*100; //gets the number of cents without the decimal points
        int cents2 = (int)val; //converts form a double to an interger


        /*Prompts the user for a price in dollar and cents format 
        (for example 21.74 represents twenty one dollars and 74 cents).

        Calculates how many dollars and cents the user has 
        (for example, 21 dollars and 74 cents).

        Displays this information to the user in an easy to understand format.
        */



        String phonenumber;
        phonenumber = "6035551234";
        //             0123456789
        //now im going to format a phone number and it's going to be sick
        String first3 = phonenumber.substring(0, 3);
        String second3 = phonenumber.substring(3, 6); //goes up to but not including 6
        String third3 = phonenumber.substring(6);
        System.out.print("(" + first3 + ") ");
        System.out.print("" + second3 + "-");
        System.out.print( third3 );


        /*A prime number is a number that is only divisible by 1 and itself.  
        Write an algorithm (in English, not in Java code)that determines whether or not a positive integer is prime
         (ignore zero and negative integer values)
         
         asks user for a positive interger (yournumber)
         divide by (yournumber - 1)
         if the remainder is greater than zero, subtract 1.
         [repeat untill the divisor is 2]

         if the remainders are always greater than 0:
            print the number is prime

        else:
        print the number is composite
         
         
         
         */






    }
}