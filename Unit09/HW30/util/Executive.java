public class Executive extends Manager {
    private double shares;

    public Executive(String name, double salary, double bonus, double shares) {
        // invoke the parent class' constructor.
        super(name, salary, bonus);

        this.shares = shares;

        // initialize the child class' members.

    }

    public double getShares() {
        return shares;
    }

    public void setShares(double newShares) {
        this.shares = newShares;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Shares  = $%,12.2f%n", shares);
    }

}
