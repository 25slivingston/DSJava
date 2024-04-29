import mow.Yard; //looks under current folder for mow then yead
import mow.Mower;

public class ATLawnSpiral {
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

        Yard myYard = new Yard(5, 10);
        Mower myMower = new Mower();
        myMower.setPosition(1, 1);
        myMower.setDirection(1);

        // create loop
        while (true) {
            myYard.printYard(myMower);

            // mow lawn underneath the mower
            myMower.cutGrass(myYard);

            // check for grass
            if (myMower.senseBrick(myYard) == '+') {
                // move forward
                myMower.moveForward();
            } else {
                // turn right
                myMower.turnRight();

                // check for grass
                if (myMower.senseBrick(myYard) == '+') {
                    myMower.moveForward();
                } else {
                    // turn left twice
                    myMower.turnLeft();
                    myMower.turnLeft();

                    if (myMower.senseBrick(myYard) == '+') {
                        myMower.moveForward();
                    } else {
                        System.out.println("done mowing");
                        break;
                    }
                }
            }
            delay(500);
            clearScreen();
        }

    }
}