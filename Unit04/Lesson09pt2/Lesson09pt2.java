import java.util.Scanner;
class Die{
    int outcome = 1;
    public void setOutcome(int newVal){ // this is void because there is vo value returned
        if (newVal > 0 && newVal < 7){
            outcome = newVal;
        }
    }
    public int getOutcome (){
        return outcome;
    }
    public void roll (){
        //this function rolls the die
        //create a random number
        double r = 6.0 * Math.random(); //0 to .99 to 0 to 6
        int val =
    }
}
public class Lesson09pt2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
//-------------------------------------------------------------------------------------------------------------

        for (int i = 1; i <= 10; i++) {
            double r = Math.random();
            System.out.println(r);
        }
//-------------------------------------------------------------------------------------------------------------------------
       class Backpack {
    final int MAX_ROLL = 5;
    
    public void getRoll() {
        // increase the gear if possible.
        for (int n = 1; n <= 6; n++) {
            double roll = Math.random();
            Math.round(roll);
            System.out.println(roll);
        }
    }


    public void display() {
        if roll = 1;
        string display = ("-------"
                          "|  0  |"
                          "|     |
                          --------")
    }

    public void display() {
        if roll = 2;
        string display = ("-------"
                          "|   0 |"
                          "|0    |
                          --------")
    }

    public void display() {
        if roll = 3;
        string display = ("-------"
                          "|0   0|"
                          "|  0  |
                          --------")
    }

    public void display() {
        if roll = 4;
        string display = ("-------"
                          "| 0 0 |"
                          "| 0 0 |
                          --------")
    }

    public void display() {
        if roll = 5;
        string display = ("-------"
                          "|0 0 0|"
                          "| 0 0 |
                          --------")
    }

    public void display() {
        if roll = 6;
        string display = ("-------"
                          "|0 0 0|"
                          "|0 0 0|
                          --------")
    }








        Die die = new Die();

       for (int i = 0; i < 4; i++) {
        die.roll();
        die.display();
        System.out.println();
       }


    }
}