import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {

        System.out.println("How many cookies would you like to buy: ");
        Scanner input = new Scanner(System.in);
        double numberCookies = input.nextInt();
        System.out.println("this is the number of cookies: " + numberCookies);

        if (numberCookies > 6969) {
            System.out.println("that's a fucking lot of cookies bitch.");
            System.out.println("Are you sure you want that many cookies? 1 for yes 2 for no.");
            int yOrN = input.nextInt();
            if (yOrN == 1) {
                System.out.println("you are insane. goodbye.");
            } else {
                System.out.println("thank god you're normal,");
            }
        } else {
            System.out.println("cool man. I'll get those cookies for u pookie bear.");
        }

    }
}