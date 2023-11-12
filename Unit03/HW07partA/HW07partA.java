import java.util.Scanner;
public class HW07partA {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        /*Tue - Sun:
If age < 13, discount = 5%
If age >= 50, discount = 7.5%
Mon:
If age < 13, discount = 7.5%
If age >= 50,discount = 15%
For everyone else, discount = 5%
 */

        Scanner input = new Scanner(System.in);

        int age = 0;
        double cost = 0.00;
        double totalcost = 0.00;

        System.out.print("What day of the week is it: ");
        String dayofweek = input.next();
        System.out.print("what was the cost of the meal: ");
        cost = input.nextFloat();
        System.out.print("What was the customer's age: ");
        age = input.nextInt();
        double discount;


        if (dayofweek.toUpperCase().equals("MONDAY")) {
            if (age < 13) {
                discount = (cost / 100 * 7.5);
            } 
            else if (age >= 50) {
                 discount = (cost / 100 * 15);
            }
            else {
                discount = (cost / 100 * 5);
            }
            } 
        else {
            if (age < 13) {
                discount = (cost / 100 * 5);
            } 
            else if (age >= 50) {
                discount = (cost / 100 * 7.5);
            }
            else {
                discount = 0;
            }
            }

            totalcost = cost - discount;
            System.out.printf("$%.02f%n", totalcost);








        }

    }
