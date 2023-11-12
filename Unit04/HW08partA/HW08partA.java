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
        double initialBalance = input.nextDouble();

        //Print a table that shows the year, interest amount, and balance on each row
        for (int i = 1; i <= 5; i++) {
            double balance = initialBalance;
            System.out.println(balance);

        }
        


            

        

        


    }
}