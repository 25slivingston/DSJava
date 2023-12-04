class Die {
    //member variables (fields) (usually want them to be private not public)
    private int faceValue; // outside the class cannot acsess this private

    //constructors
    public Die(){
        //initialise the die
        faceValue = 1;

    }


    //method declarations
    public int getFaceValue() { //public, so outside the class can acsess the info
        //isn't static bc it will contain changing information.
        return faceValue;
    }

    public void setFaceValue(int newValue) { //void bc it doesn't return anything
    if (newValue > 0 && newValue < 7) {
    faceValue = newValue;
    }
    else {
        System.out.println("newValue must be from 1 to 6. ");
    }
    }


}

public class ATHW08 {
    public static void main(String[] ags) {

        Die die = new Die();
        int answer = die.getFaceValue(); //have to put this into the print statement
        System.out.println("the die value is equal to " + answer);

    }
}