class CashRegister {
    private double totalPrice; // Data encapsulation :O
    private int itemCount; // we can hide how we model our data to the people using the cash register

    // declare the constructor, which creates the object
    public CashRegister() {
        totalPrice = 0;
        itemCount = 0;
    }

    // this is the overload function if you already have a starting value
    public CashRegister(double init_total, int init_count) {
        totalPrice = init_total;
        itemCount = init_count;
    }

    public void addItem(double price) { // "price" is the argument
        totalPrice = totalPrice + price;
        itemCount = itemCount + 1;
    }

    public double getTotal() {
        return totalPrice;
    }

    public int getCount() {
        return itemCount;
    }

    public void clear() {
        totalPrice = 0;
        itemCount = 0;

    }
}

/*
 * public class Demo {
 * public static void main(String[] args) {
 * 
 * CashRegister cr = new CashRegister();
 * cr.addItem(4.50);
 * cr.addItem(1.50);
 * cr.addItem(1.00);
 * System.out.println("You have " + cr.getCount() + " items.");
 * System.out.printf("Total = $%.2f%n", cr.getTotal());
 * }
 * }
 */

public class Demo {
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.addItem(3.00);
        cr.addItem(1.50);
        System.out.printf("Total = $%.2f%n", cr.getTotal());
        cr.clear();
        cr.addItem(2.00);
        cr.addItem(2.50);
        System.out.println("You have " + cr.getCount() + " items.");
        System.out.printf("Total = $%.2f%n", cr.getTotal());
    }
}
