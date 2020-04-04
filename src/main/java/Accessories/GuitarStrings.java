package Accessories;

import Actions.ISell;
import EnumerableLists.ItemType;
import ShopPackage.Item;

public class GuitarStrings extends Item implements ISell {

    private String size;
    private String brand;

    public GuitarStrings(ItemType itemType, double stockPrice, int stock, double retailPrice, String size, String brand) {
        super(itemType, stockPrice, stock, retailPrice);
        this.size = size;
        this.brand = brand;
    }

    public double sell() {
        double markup = this.getRetailPrice() - this.getStockPrice();
        return markup;
    }

    public String getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }
}
