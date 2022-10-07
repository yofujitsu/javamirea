package practice16;

import java.util.ArrayList;
import java.util.Collection;

public class InternetOrder {

    Collection<Item> order;

    public InternetOrder(Collection<Item> order) {
        this.order = order;
    }

    public InternetOrder() {
        this.order = new ArrayList<>();
    }

    public boolean add(Item item) {
        return order.add(item);
    }

    public boolean remove(Item item) {
        return order.remove(item);
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Item item : order) {
            str.append(item.toString()).append("\n");
        }
        return str.toString();
    }
}
