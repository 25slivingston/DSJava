class DoorSystem {
    enum GearState {
        PARK, NEUTRAL, DRIVE, REVERSE, GEAR1, GEAR2, GEAR3
    }

    // GearState CurrentGear = GearState.PARK;

    private boolean dashLeft = false;
    private boolean dashRight = false; // false means no one is pressing the button

    private boolean insideLeft = false; // false means no one is pulling the handle
    private Boolean insideRight = false;

    private boolean outsideLeft = false;
    private boolean outsideRight = false;

    // master unlock swich if true doors are unlocked
    private boolean masterUnlock = true;
    // if true inside handles don't work
    private boolean childLock = false;

    private GearState gearState;

    // create a method to update the state of the system
    public void updateState(String newState) {
        //string has to bea at least 9 characters long
        if (newState.length() >= 9) {
            //extract state from the string
            if (newState.charAt(0) == '1') { // dash left

                dashLeft = true;
            }
            else {
                    dashLeft = false;
            }

            if (newState.charAt(1) == '1') {// dash right

                dashRight = true;
            }
            else {
                    dashRight = false;
            }

            if (newState.charAt(2) == '1') {// childlock

                 childLock = true; 
            }
            else {
                    childLock = false;
                }
                    

            if (newState.charAt(3) == '1') {// master unlock

                masterUnlock = true;
            }
            else {
                    masterUnlock = false;
            }

            if (newState.charAt(4) == '1') { //inside left

                insideLeft = true;
            }
            else {
                    insideLeft = false;
            }

            if (newState.charAt(5) == '1') { //inside right

                insideRight = true;
            }
            else {
                    insideRight = false;
            }

            if (newState.charAt(6) == '1') { //outside left

                outsideLeft = true;
            }
            else {
                    outsideLeft = false;
            }

            if (newState.charAt(7) == '1') { //outside right

                outsideRight = true;
            }
            else {
                    outsideRight = false;
            }

            if (newState.charAt(8) == 'P') { // GEARSTATE   

                gearState = PARK;
            }
            else if (newState.charAt(8) == 'N') {
                    gearState = NEUTRAL;
            }
            else if (newState.charAt(8) == 'D') {
                    gearState = DRIVE;
            }
            else if (newState.charAt(8) == 'R') {
                    gearState = REVERSE;
            }
            else if (newState.charAt(8) == 'G1') {
                    gearState = PARK;
            }
            else if (newState.charAt(8) == 'G2') {
                    gearState = PARK;
            }
            else if (newState.charAt(8) == 'G3') {
                    gearState = PARK;
            }





                    if (newState.charAt[8] == 'p') {

                currentGear = GearState.PARK;

                else if { (newState.charAt[8] == 'd')
                    dashLedft = false;
                    currentGear = GearState.DRIVE;

    public boolean isLeftOpening() {
        if (gearState == GearState.PARK) {
            // check other conditions.
            if(masterUnlock == true){
                // check other conditions.
                
            } else {
                return false;
            }
        } else{
            return false;
        }

    }

    // DoorSystem doorSystem = new DoorSystem(initState:"00110110P");

    // //check the left door
    // if (doorSystem.isLeftOpen())
    // System.out.println("Door is open");

}

public class MiniVanProject {
    public static void main(String[] args) {

    }

}