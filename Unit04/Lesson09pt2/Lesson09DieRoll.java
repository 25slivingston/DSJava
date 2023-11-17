/*
* Let's create a class called Die that represents a 6-sided die.
* 
*/
class Die {
    // remember, we use variables to represent the state of the object.
    // in this case, let's use an integer to represent the value of the die.
    int value = 1;

    // we need to declare some methods (functions) that we can use to interact with
    // our virtual die.
    // first let's create a method to roll the die (randomize the value);
    public void roll() {
        // in this method, we should put code to generate a random integer from 1 to 6,
        // and then assign this random integer to our variable that is called value.

        /*
         * How do you generate a random integer from 1 to 6?
         */
        double r = 6 * Math.random(); 
        value = (int)r; // random interger from 0 to 5
        value = value + 1;


    }

    public void display() {
        // this method displays the current value of the die.
        if (value == 1) {
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   O   |");
            System.out.println("|       |");
            System.out.println("+-------+");
        } else if (value == 3) {
            System.out.println("+-------+");
            System.out.println("| O     |");
            System.out.println("|   O   |");
            System.out.println("|     O |");
            System.out.println("+-------+");
        }
        else if (value == 4) {
            System.out.println("+-------+");
            System.out.println("| O   O |");
            System.out.println("|       |");
            System.out.println("| O   O |");
            System.out.println("+-------+");
        }
        else if (value == 6) {
            System.out.println("+-------+");
            System.out.println("| O O O |");
            System.out.println("|       |");
            System.out.println("| O O O |");
            System.out.println("+-------+");
        }
        else if (value == 5) {
            System.out.println("+-------+");
            System.out.println("| O   O |");
            System.out.println("|   O   |");
            System.out.println("| O   O |");
            System.out.println("+-------+");
        }
        else if (value == 2) {
            System.out.println("+-------+");
            System.out.println("| O     |");
            System.out.println("|       |");
            System.out.println("|     O |");
            System.out.println("+-------+");
        }


        /*
         * HOW DO YOU PRINT THE REMAINING VALUES OF THE DIE?
         */
    }
}

public class Lesson09DieRoll {
    public static void main(String[] args) {
        // let's create a new variable of Die type.
        Die die = new Die();

        // let's roll the die.
        die.roll();

        // let's see what value we have.
        die.display();

        // let's roll the die a second time.
        die.roll();

        // let's see what value we have.
        die.display();
    }
}