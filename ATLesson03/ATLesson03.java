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
        System.out.println("and " + cents + " cents");

        /*Prompts the user for a price in dollar and cents format 
        (for example 21.74 represents twenty one dollars and 74 cents).

        Calculates how many dollars and cents the user has 
        (for example, 21 dollars and 74 cents).

        Displays this information to the user in an easy to understand format.
        */



        String phonenumber;
        phonenumber = (String)603;
        //now im going to format a phone number and it's going to be sick
        String first3 = phonenumber.substring(0, 2);
        String second3 = phonenumber.substring(3, 6);
        String third3 = phonenumber.substring(7, 9);
        Sysyem.out.print("(" + first3 + ") ");
        Sysyem.out.print("" + second3 + "-");
        Sysyem.out.print( third3 );


        /*A prime number is a number that is only divisible by 1 and itself.  
        Write an algorithm (in English, not in Java code)that determines whether or not a positive integer is prime
         (ignore zero and negative integer values)
         
         asks user for a positive interger (yournumber)
         divide by (yournumber - 1)
         if the remainder is greater than zero, subtract 1.
         [repeat untill the remainder is 0]

         if the remainders are always greater than 0:
            print the number is prime

        else:
        print the number is composite
         
         
         
         */






    }
}