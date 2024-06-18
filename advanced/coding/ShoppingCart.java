package advanced.coding;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double total;

    public ShoppingCart() {
        items = new ArrayList<Item>();
        total = 0.0;
    }

    public void addItem(Item item) {
        items.add(item);
        total = calculateTotal();
    }

    private double calculateTotal() {
        double sum = 0.0;
        for (Item item : items) {
            item.calculateSubtotal();
            sum += item.getSubtotal();
        }
        return sum;
    }

    public double getTotal() {
        return total;
    }

    public int getNumItems() {
        int num = 0;
        for (Item item : items) {
            num += item.getQuantity();
        }
        return num;
    }
    public ArrayList<Item> getItems() {
        return items;
      }

    public String toString() {
        return getClass().getName() + "[items=" + items + ", total=" + total + "]";
    }
}
