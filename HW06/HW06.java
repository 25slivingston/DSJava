import java.util.Scanner;
public class HW06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);
        System.out.print("How many pies would you like to buy: ");
        double numberPies = input.nextInt();
        

        if (numberPies >= 3) {
            double discountCost = ((numberPies * 10) - numberPies);
            System.out.printf("The total cost (discount) is: $%.2f%n", discountCost );
        }
        else {
            double cost = numberPies * 10;
            System.out.printf("the total cost is: $%.2f%n", cost);
        }

//-----------------------------------------------------------------------------------------------------------------------

// prompt user for age.
System.out.print("Enter your age: ");
int age = input.nextInt();

// are they lucky?
double error = Math.abs(age - 13);
if (error < 0.000001) {
System.out.println("Lucky 13!");
}

//----------------------------------------------------------------------------------------------------------
/*people would exect this code to print c is equal to 3.6, but it won't. 
 * this is because there could be a miniscule amount of error causing it to not be 3.6.
 * i fixed the code below.
 */
double a = 1.2; 
double b= 3.0;
double c = a * b; 
double error2 = Math.abs(c - 3.6);
if(error2 < 0.0000000001){
System.out.println("c is 3.6");
} else {
System.out.println("c is not 3.6");
}

//---------------------------------------------------------------------------------------------------------------

/*Cookies are $0.99 apiece.
If you purchase > 6 cookies, you get a 2.5% discount on your total order.
If you purchase > 12 cookies, you get a 5% discount on your total order.
If you purchase > 24 cookies you get a 15% discount on your total order
 */


System.out.print("How many cookies would you like to buy: ");
        double numberCookies = input.nextInt();
        

        if (numberCookies > 24) {
            double discountCost2 = (numberCookies * .99 *.85);
            System.out.printf("the total cost (15) is: $%.2f%n", discountCost2);
        }
        else if (numberCookies > 12) {
            double discountCost3 = (numberCookies * .99 *.95);
            System.out.printf("the total cost (5) is: $%.2f%n", discountCost3);
        }
        else if (numberCookies > 6) {
            double discountCost4 = (numberCookies * .99 *.975);
            System.out.printf("the total cost (2.5) is: $%.2f%n", discountCost4);
        }
        else {
            double cost2 = numberCookies * .99;
            System.out.printf("the total cost (normal) is: $%.2f%n", cost2);
        }






    }
}