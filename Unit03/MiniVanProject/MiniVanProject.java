class DoorSystem {
    enum GearState {
        PARK, NEUTRAL, DRIVE, REVERSE, GEAR1, GEAR2, GEAR3
    }

    GearState CurrentGear = GearState.PARK;

    private boolean dashLeft = false;
    private boolean dashRight = false; // false means no one is pressing the button

    private boolean insideLeft = false;
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
            if (newState.charAt[0] == '1') {

                dashLeft = true;
                else{
                    dashLedft = false;

            if (newState.charAt[2] == '1') {

                 childLock = true;
                else{
                    childLock = false;
                    

            if (newState.charAt[0] == '1') {

                dashLeft = true;
                else{
                    dashLedft = false;




                    if (newState.charAt[8] == 'p') {

                currentGear = GearState.PARK;

                else if { (newState.charAt[8] == 'd')
                    dashLedft = false;
                    currentGear = GearState.DRIVE;

    public boolean isLeftOpening() {

        return false;

    }

    // DoorSystem doorSystem = new DoorSystem(initState:"00110110P");
                    

    //                 //check the left door
    //                 if (doorSystem.isLeftOpen())
    //                 System.out.println("Door is open");

}

public class MiniVanProject {
    public static void main(String[] args) {

    }

}