import java.util.Scanner;
public class HW07partA {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //Cougar Cafe problem

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


        if (dayofweek.toUpperCase().equals("MONDAY")) {
             if (age < 13) {
                totalcost = (cost / 100 * 7.5);
            } else if (age >= 50) {
                 totalcost = (cost - (cost / 100 * 15));
            }
            } 

            System.out.printf("$%.02f%n", totalcost);








        }

    }
