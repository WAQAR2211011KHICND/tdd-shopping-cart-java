package test;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> ItemsList = new ArrayList<>();
    Long totalPrice = Long.valueOf(0);

    public Cart() {
    }

    public List<Item> getItemsList() {
        return this.ItemsList;
    }

    void addItem(Item item) {
        this.ItemsList.add(item);
        this.totalPrice += item.price;
    }

    public Long getTotalPrice() {
        return this.totalPrice;
    }
}
