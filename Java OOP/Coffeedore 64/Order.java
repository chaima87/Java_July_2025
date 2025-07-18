import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
