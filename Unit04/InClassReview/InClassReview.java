import java.util.Scanner;
public class InClassReview {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        System.out.print(numberOne + " " + numberTwo + " " + numberThree);

        if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("the numbers are in order");
        }
        else if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("the numbers are in order");
        }
        else {
            System.out.println("the numbers are in the wrong order");
        }
//---------------------------------------------------------------------------------

        System.out.print("type some words or something: ");
        String newString = input.next();
        System.out.println(newString);
        for (int i = 0; i < newString.length(); i = i + 2) {
            System.out.print(newString.charAt(i));
        }
        System.out.println();

    }
}