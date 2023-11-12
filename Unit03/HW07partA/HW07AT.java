import java.util.Scanner;
public class HW07AT {



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        String numerals = "your numeral is: ";
        int number = 0;

        while (number > 3999 || number < 1) {
        System.out.print("Enter and interger between 1 and 3999: ");
        number = input.nextInt();
        }

        System.out.println("your number is " + number);

        while (number >= 1000) {
            //add M 
            String M = "M";
            numerals = numerals.concat(M);

            number = number - 1000;
        }
        
        while (number >= 900) {
            //add CM
            String CM = "CM";
            numerals =numerals.concat(CM);
            number = number - 900;
        }

        while (number >= 500) {
            // add D
            String D = "D";
            numerals =numerals.concat(D);
            number = number - 500;
        }

        while (number >= 400) {
            // add CD
            String CD = "CD";
            numerals =numerals.concat(CD);
            number = number - 400;
        }

        while (number >= 100) {
            // add C
            String C = "C";
            numerals =numerals.concat(C);
            number = number - 100;
        }

        while (number >= 90) {
            // add XC
            String XC = "XC";
            numerals =numerals.concat(XC);
            number = number - 90;
        }

        while (number >= 50) {
            // add L
            String L = "L";
            numerals =numerals.concat(L);
            number = number - 50;
        }

        while (number >= 40) {
            // add XL
            String XL = "XL";
            numerals =numerals.concat(XL);
            number = number - 40;
        }

        while (number >= 10) {
            // add X
            String X = "X";
            numerals =numerals.concat(X);
            number = number - 10;
        }

        while (number >= 9) {
            // add IX
            String IX = "IX";
            numerals =numerals.concat(IX);
            number = number - 9;
        }

        while (number >= 5) {
            // add V
            String V = "V";
            numerals =numerals.concat(V);
            number = number - 5;
        }

        while (number >= 4) {
            // add IV
            String IV = "IV";
            numerals =numerals.concat(IV);
            number = number - 4;
        }

        while (number >= 1) {
            // add I
            String I = "I";
            numerals =numerals.concat(I);
            number = number - 1;
        }

        System.out.println("This is your roman numeral: " + numerals);


  String s1="Sachin ";  
   String s2="Tendulkar";  
   String s3=s1.concat(s2);  

        

       





    }
}