import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    public Order() {
        items = new ArrayList<Item>();
        total = 0.0;
        ready = false;
    }
}
