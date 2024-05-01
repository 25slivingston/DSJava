public class GearedBicycle extends Bicycle {
    private static final int MAX_GEAR = 6;
    private static final int MAX_SPEED_GEARED = 50;
    private int gear = 1; // gear that the bike is in

    public GearedBicycle() {
        super(); // invoke the parents constructor! this is the same as calling Bicycle();
                 // because bicycle is the parent
        // this basically just sets the speed but lets ignore that lol
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public void shiftUp() {
        gear = gear + 1;
        if (gear > MAX_GEAR) {
            gear = MAX_GEAR;
        }
    }

    public void shiftDown() {
        gear = gear - 1;
        if (gear < 1) {
            gear = 1;
        }
    }

    // OVERRIDE

    public void pedal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > MAX_SPEED_GEARED) {
            newSpeed = MAX_SPEED_GEARED;
        }
        this.setSpeed(newSpeed);
    }

    public void brake() {
        int newspeed = getSpeed() - 2;
        if (newspeed < 0) {
            newspeed = 0;
        }
        this.setSpeed(newspeed);
    }

    public void display() {
        super.display(); // call the parent class function (which is bicycle.java)
        System.out.printf("Gear = %02d%n", gear);

    }

}
