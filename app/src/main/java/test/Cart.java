package test;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private class ItemsList {
        Item Items;
        Integer Quantity = 0;

        public ItemsList(Item items, Integer Quantity) {
            this.Items = items;
            this.Quantity = Quantity;
        }

    }

    List<ItemsList> ItemsList = new ArrayList<>();

    Long totalPrice = Long.valueOf(0);

    public Cart() {
    }

    public List<Item> getItemsList() {
        return new ArrayList<>();
    }

    void addItem(Item item) {
        int indexOfItemsList = -1; 
        for (int j = 0; j < this.ItemsList.size(); j++) {
            if(this.ItemsList.get(j).Items.id == item.id){
                indexOfItemsList = j;
                ItemsList i = this.ItemsList.get(j);
                i.Quantity += 1 ;
                this.ItemsList.set(j, i);
                break;
            }
        }
        if(indexOfItemsList==-1){
            this.ItemsList.add(new ItemsList(item, 1));
        }

        this.totalPrice += item.price;
    }

    public Long getTotalPrice() {
        return this.totalPrice;
    }
}
