public class Order {
    private String itemName;
    private int quantity;
    private double price;

    public Order(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal(){
        return this.quantity * this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getItemName() {
        return this.itemName;
    }
}
