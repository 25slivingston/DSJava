//PART A ANSWER
/* Total = $4.50
You have 2 items.
Total = $4.50 */

//Part B:

//Part B: (AT students only)

//You are given the following incomplete declaration for the CashRegister class.

import java.util.ArrayList;
import java.util.Scanner;

class CashRegister {
    private ArrayList<Double> items; //declate it

    /*
     * Constructor.
     */
    public CashRegister() {
        items = new ArrayList<>(); //initialise it
        
    }

    /*
     * Add the price of an item to the register's total.
     */
    public void addItem(double price) {
        items.add(price);
    }

    /*
     * Remove the most recently added item from the current sale.
     */
    public void removeItem() {

        int index = items.size() - 1;

        if (index >= 0) {
            items.remove(index);
        }

    }

    /*
     * Return the current total sales amount.
     */
    public double getTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i);
        }
        return total;
    }

    /*
     * Return the total count of items in the current sale.
     */
    public int getCount() {
        return items.size();
    }

    /*
     * Clear the register (total and count) for a new sale.
     */
    public void clear() {
        items.clear();
    }
}





public class HW25 {

    public static void main(String[] args) {
        CashRegister myRegister = new CashRegister();
        myRegister.addItem(10);
        myRegister.addItem(4.50);
        System.out.println("This is the price" + myRegister.getTotal());
        System.out.println("this is the count: " + myRegister.getCount());
    }

    Scanner in = new Scanner(System.in);

    while(true){
        String word = in.nextline();
        System.out.println("Do you want to add a cost (_.__), quit (q), clear (c), delete last (d), or display (t)");
        
        if (word.equalsIgnoreCase("q")){ //ignore case treats lower and upper case as same
            System.out.println("goodbye");
            break;
        } else if(word.equalsIgnoreCase("t")){
            System.out.println("total: " + myRegister.getTotal + myRegister.getCount);
        } else if(word.equalsIgnoreCase("c")){
            myRegister.clear;
        } else if(word.equalsIgnoreCase("d")){
            myRegister.removeItem;
        }else{ 
            //assume its a number, and convert it.
            double amount = Double.parseDouble(word);
            myRegister.addItem;
        }
    }
}

/*
 * Complete the class declaration above by implementing the methods in the
 * public interface for this class.
 * 
 * Once you have completed the declaration for the CashRegister class, write an
 * example program that continuously prompts the user for sales information:
 * User enters in a number value to add to the sales total and to increase the
 * item count
 * User enters a 't' to display the sales total and item count
 * User enters a 'd' to delete the most recent sales entry (and decrease the
 * item count)
 * User enters a 'c' to clear the current sales total and item count
 * User enters a 'q' to quit the program
 */