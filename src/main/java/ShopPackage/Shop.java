package ShopPackage;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;

    public Shop(ArrayList<Item> stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock.size();
    }
}
