import mow.Yard; //looks under current folder for mow then yead
import mow.Mower;

public class ATLawn {

    public static void main(String[] args) {

        Yard myYard = new Yard(5, 3);
        myYard.printYard();

        Mower myMower = new Mower();
        myMower.setPosition(1, 1);
        myMower.setDirection(1);
    }
}