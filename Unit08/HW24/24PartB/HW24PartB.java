import java.util.Scanner;

class Counter {
    //this variable keeps track of how many counts we've made.
    private int count;

    public int getValue() {
        return count;
    }

    public void count() {
        count = count + 1;
    }

    public void reset() {
        count = 0;
    }
    

}



public class HW24PartB {

    public static void main(String[] args) {
        System.out.println("Hellow World");

        Counter cakeCounter = new Counter();
        //System.out.print(cakeCounter.getValue());

        Counter pieCounter = new Counter();
        //System.out.print(pieCounter.getValue());

        Scanner in = new Scanner(System.in);
        char character = ' ';
        System.out.println("type c for CAKE and p for PIE. q for QUIT.");
        
        while (character != 'q' && character != 'Q'){
            System.out.print("which would you like: ");
            character = in.next().charAt(0);
            if (character == 'p'){
                pieCounter.count();
            }
            else if (character == 'c'){
                cakeCounter.count();
            }
        }

        System.out.print("cakes: " + cakeCounter.getValue() + " pies: " + pieCounter.getValue());

    }
}