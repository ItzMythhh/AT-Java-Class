public class Executive extends Manager {

    // New variable
    private double shares;

    // Constructor
    public Executive(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus); // calls Manager constructor
        this.shares = shares;
    }

    // Getter
    public double getShares() {
        return shares;
    }

    // Setter
    public void setShares(double shares) {
        this.shares = shares;
    }

    // Override displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo(); // prints name, salary, bonus
        System.out.println("Shares: " + shares);
    }
}
