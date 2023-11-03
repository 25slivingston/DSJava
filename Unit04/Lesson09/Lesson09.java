import java.util.Scanner;
public class Lesson09 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //learning about the do loop
        //do something while something else is true/false
        //use a do loop if you always want to body to be done at least once.
        //when you use a while loop, if it is false/true, it won't be done at all, not even once

        Scanner in = new Scanner(System.in);

         
         /*
        do {
            System.out.print("enter in interger <100: ");
            value = in.nextInt();
        }
        while (value >= 100);
        System.out.println("you did it wow"); //this will only print if the do statement is completed
 */


//------------------------------------------------------------------------------------------------------------------
        

        double total = 0;
        double money = 0; 

        boolean loopFlag = true;
        do {
            System.out.print("enter in interger more than 0: ");
            money = in.nextDouble();
            if (money > 0) { //this would eject us from the do and skip total = (total + money), so we don't add any negative values to our money total.
                total = (total + money);
            } else{
                    loopFlag = false;
                }
            }
             while (loopFlag); //used to say money >= 0, but replacing it with the boolean is cleaner
         System.out.println(total);






















    }
}