import java.util.Scanner;
public class HW10PartB {

    


public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies: ");
int num = in.nextInt();
double discount = 0.00; //had to initialise the variable first
if (num > 12) {
discount = 0.10;      // this is a logic error because the condition with less possible inputs, 12 , should go first.
} 
else if (num > 6) {    // we don't want 6 and 12 to overlap
discount = 0.05;
}
System.out.println("Discount = " + discount);  
}
}
