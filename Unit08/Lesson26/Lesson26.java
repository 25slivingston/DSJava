class Customer {
    //data representation (instance variables)
    private double total;
    private int count;
    private String name;
    private int region;
    private int serial_number;

    public static int last_serial_used = 0;

    //constructor
    public Customer(String new_name, int new_region) {
        name = new_name;
        region = new_region;
        total = 0;
        count = 0;

        //issue serial number
        last_serial_used++;
        serial_number = last_serial_used;

    }
    //overload
    public Customer(String new_name) {
       this(new_name, new_region: 1);
        /* name = new_name;
        total = 0;
        count = 0;

        //issue serial number
        last_serial_used++;
        serial_number = last_serial_used; */

    }



    //static method to get tax rate
    public static double getTaxRate(int region) {
        if (region == 1) { //NH
            return 0;
        }
        else if (region == 2) { //ME
            return 0.550;
        }
        else if (region == 3) { //VT
            return 0.060;
        }
        else if (region == 4) { //MA
            return 0.065;
        }
        else {
            return 0;
        }
    }
    
    //declare public interface
    public void addSalesAmount(double amount) {
        this.total = this.total + amount; //'this.' is only necessary if you have a parameter of the same name; it just specifies which variable
        this.count = this.count + 1;
    }

    //another way to interact with the customer
    public double getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    //reset
    public void clear() {
        this.total = 0;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setRegion(int new_region) {
        region = new_region;
    }

    public int getRegion() {
        return region;
    }
}

public class Lesson26 {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer("hannaford", 2); //ME
        c1.addSalesAmount(1000);
        c1.addSalesAmount(2000);
        System.out.printf("%-20s: $%8.2f%n", c1.getName(), c1.getTotal());
        
        double rate = Customer.getTaxRate(c1.getRegion());
        System.out.println("The customer's tax rate is " + rate);
    }
}