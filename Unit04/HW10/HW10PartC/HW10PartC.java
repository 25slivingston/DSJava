import java.util.Scanner;
public class HW10PartC {

    /*
 * The Cougar Baking Company is growing and has expanded their offerings.  Write a program that calculates and displays the total cost for cookies:
 * Cookies are $0.99 apiece.
 * If you purchase > 6 cookies, you get a 2.5% discount on your total order.
 * If you purchase > 12 cookies, you get a 5% discount on your total order.
 * If you purchase > 24 cookies you get a 15% discount on your total order
 * Write and test your program.  Submit your source file for grading using MSA or GitHub.
 * 
 * Test with 4 cookies.     Total should be $3.96
 * Test with 10 cookies.    Total should be $9.65
 * Test with 13 cookies.    Total should be $12.23
 * Test with 25 cookies.    Total should be $21.04
 * 
 * There are issues with this program.  
 * Some are compile-time issues that will
 * prevent the program from compiling.
 * Other issues are logic errors that will
 * produce the wrong results.
 * 
 * Use your debugging techniques and tools
 * to find and correct these issues.
 */



 
    public static void main(String[] args) throws Exception {
        // cookies are $0.99 apiece.
        final double COST_OF_COOKIE = 0.99;

        // prompt user for the number of cookies they are buying.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of cookies: ");
        int num = in.nextInt();

        // calculate the cost before discount.
        double cost = num * COST_OF_COOKIE;

        // Use conditional statements to determine what discount is.
        double discount = 0.00;
        if (num > 24) {
            discount = 0.15;
        } else if (num > 12) {
            discount = 0.05;
        } else if (num > 6) {
            discount = 0.025;
        }

        // calculate and display values to user.
        cost = cost * (1 - discount);
        System.out.printf("For %d cookies, your total cost is $%.2f", num, cost);
    }
}