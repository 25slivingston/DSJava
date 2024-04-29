import mow.Yard; //looks under current folder for mow then yead
import mow.Mower;

public class ATLawnC {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {

        // create a yard
        Yard myYard = new Yard(6, 11);
        // creat a mower
        Mower myMower = new Mower();
        // do not use the following code, we will randomise the position enstead
        /*
         * myMower.setPosition(1, 1);
         * myMower.setDirection(1);
         */

        // randomise the location of the mower
        myMower.randomise(myYard);

        // create loop
        while (true) {
            myYard.printYard(myMower);

            // mow lawn underneath the mower
            myMower.cutGrass(myYard);

            if (myMower.updateMower(myYard) == false) {
                // nothing left to mow
                break;
            }

            // check for brick
            if (myMower.senseBrick(myYard) == 'R') {
                // end of the row
                break;
            } else {
                myMower.moveForward();
            }
            delay(500);
            clearScreen();
        }

    }
}