package test;

public class Item {

    Long   id    = 0L;
    String name  = "";
    Long   price = 0L;
    Boolean sale = false;
    

    public Item(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Item(Long id, String name, Long price, Boolean sale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    


}
