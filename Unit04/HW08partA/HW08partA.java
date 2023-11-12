import java.time.Year;
import java.util.Scanner;
public class HW08partA {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

  /*       double Cesium = 100.00;
        int Years = 0;
        

        while (Cesium >= 1.0) {
            System.out.println(Cesium + "% at " + Years + " years");
            Cesium = (Cesium / 2.0);
            Years = (Years + 30);
        }

        System.out.println("It took " + Years + " years to get " + Cesium + " Cesium."); */


//------------------------------------------------------------------------------------------------ start again

        double amount = 100.00;
        int years = 0;

        while(amount > 1) { //every thirty years the amount decreases by half
            amount = amount/2;

            years = years + 30;

            System.out.println("years = " + years);
            System.out.println("amount = " + amount);
        }

//Ask the user what the interest rate is (APR)
        Scanner input = new Scanner(System.in);
        System.out.print("what is the interest rate? Enter the APR (as a percentage, for example, 5.5): ");
        double interestRate = input.nextDouble();

//Ask the user what the initial balance amount is in dollars
        System.out.print("what is the initial balance? ");
        double balance = input.nextDouble();

//set the year variable
        int year = 1;

        //Print a table that shows the year, interest amount, and balance on each row
        System.out.println("Year   |  Interest Earned  |   Balance");
        System.out.println("------------------------------------");


        for (int i = 1; i <= 5; i++) {
            
            double interestEarned = balance * interestRate /100;
           // System.out.print(year+ "  |   " + interestEarned);
            System.out.printf("%d      |   $%.2f", year, interestEarned);
            balance = balance + interestEarned;
            //System.out.println("   |  " + balance);
            System.out.printf("          | $%,3.2f%n", balance);
            year = year + 1;

        }
        //System.out.printf("the total cost (15) is: $%.2f%n", discountCost2);
        


            

        

        


    }
}