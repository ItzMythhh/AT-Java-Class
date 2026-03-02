public class Customer {

    public static int lastSerialUsed = 0;

    private double sales;

    public Customer(String name) {
        lastSerialUsed++;
        sales = 0;
    }

    public void addSale(double amount) {
        sales = sales + amount;
    }

    public double getSales() {
        return sales;
    }
}
