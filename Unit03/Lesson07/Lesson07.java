import java.util.Scanner;
public class Lesson07 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Scanner input = new Scanner(System.in);


         double discount = 0.0;

        

         String reply = input.next();
         //add the questions for total variable
         if (reply.toUpperCase().equals("YES")) {
             // they are a student and get bigger discounts.
            if (total > 150) {
                discount = 0.20;
            } else if (total > 100) {
                discount = 0.10;
            } else if (total > 30) {
                discount = 0.05;
            } 
        } else {
            // they are not a student, but still get a discount.
            if (total > 150) {
                discount = 0.125;
            } else if (total > 100) {
                discount = 0.07;
            } else if (total > 30) {
                discount = 0.02;
            }
        }
//------------------------------------------------------------------------------------------------------------------
//this needs formatting n stuff
        double shippingCharge = 5.00; // $5 inside continental U.S.
if (country.equals("USA")) {
if (state.equals("HI")) {
shippingCharge = 10.00; // Hawaii is more expensive
}
} else {
// outside US.
shippingCharge = 20.00; // As are foreign shipments
}



    }
}