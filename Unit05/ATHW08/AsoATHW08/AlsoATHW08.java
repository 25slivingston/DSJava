class Die {
   
    int value = 1;

    
    public void roll() {
       
        double r = 6 * Math.random(); 
        value = (int)r; // random interger from 0 to 5
        value = value + 1; //adds 1 so its 0 to 6


    }

    public void display() {
        
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

    }
}

public class AlsoATHW08 {
    public static void main(String[] args) {
      
        Die die = new Die();

        die.roll();

        die.display();

    }
}