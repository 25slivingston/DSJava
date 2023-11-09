import java.util.Scanner;
public class pt2Final03and04Test {
    public static void main(String[] args) throws Exception {

Scanner input = new Scanner(System.in);

        System.out.print("type a number:" );
        int numberOne = input.nextInt();
        System.out.print("type a number:" );
        int numberTwo = input.nextInt();
        System.out.print("type a number:" );
        int numberThree = input.nextInt();

        if ( numberOne < numberTwo && numberTwo < numberThree){
            System.out.print("you're all set: " + numberOne + numberTwo + numberThree + " is in order.");
        }
        else if (numberTwo < numberOne && numberOne < numberThree) {
                System.out.println("number two and one were out of order" );
                System.out.println(numberTwo +""+ numberOne +""+ numberThree);
            }
        else if (numberOne < numberThree && numberThree < numberTwo) {
                System.out.println("number two and three were out of order" );
                System.out.println(numberOne +""+ numberThree +""+ numberTwo);
            }
        else{
            System.out.println("they were backwards." );
            System.out.println(numberThree +""+ numberTwo +""+ numberOne);
        }

            

        }
    }
