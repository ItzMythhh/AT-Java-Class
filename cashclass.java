class CashRegister {
   private double totalPrice;
   private int itemCount;

   public CashRegister() {
       totalPrice = 0;
       itemCount = 0;
   }

   public void addItem(double price) {
       totalPrice = totalPrice + price;
       itemCount++;
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
