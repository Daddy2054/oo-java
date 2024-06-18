package advanced.coding;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private double subtotal;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = 0.0;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void calculateSubtotal() {
        subtotal = price * quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ", price=" + price + ", quantity=" + quantity + ", subtotal="
                + subtotal + "]";
    }

}