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

    private List<ItemsList> ItemList = new ArrayList<>();

    Long totalPrice = Long.valueOf(0);

    public Cart() {
    }

    public List<String> getItemsList() {
        return this.ItemList.stream().map(item ->{
            
            String  name     = item.Items.name;
            Long    price    = item.Items.price;
            Integer quantity = item.Quantity;
            String Sales = item.Items.sale == true ? "****" :""; 

            return  "Item Name : "+ Sales + name + Sales +" \nPrice : " + price 
                +" \nQuantity : " + quantity ;
        } 
        ).toList();
        
    }

    void addItem(Item item) {
        int indexOfItemsList = -1;
        for (int j = 0; j < this.ItemList.size(); j++) {
            if (this.ItemList.get(j).Items.id == item.id) {
                indexOfItemsList = j;
                ItemsList i = this.ItemList.get(j);
                i.Quantity += 1;
                this.ItemList.set(j, i);
                break;
            }
        }
        if (indexOfItemsList == -1) {
            this.ItemList.add(new ItemsList(item, 1));
        }

        this.totalPrice += item.price;
    }

    void removeItem(Item item) {
        for (int j = 0; j < this.ItemList.size(); j++) {
            if (this.ItemList.get(j).Items.id == item.id) {
                this.ItemList.remove(j);
                break;
            }
        }

        this.totalPrice -= item.price;
    }


    
    public Integer getItemQuantity(Long id){
        return this.ItemList.stream()
                    .filter(i -> i.Items.id==id)
                    .toList().get(0).Quantity;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }
}
