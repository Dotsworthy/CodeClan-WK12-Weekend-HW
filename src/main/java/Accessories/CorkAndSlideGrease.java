package Accessories;

import Actions.ISell;
import EnumerableLists.ItemType;
import ShopPackage.Item;

public class CorkAndSlideGrease extends Item implements ISell {

    private String brand;
    private String colour;

    public CorkAndSlideGrease(ItemType itemType, double stockPrice, int stock, double retailPrice, String brand, String colour) {
        super(itemType, stockPrice, stock, retailPrice);
        this.brand = brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double sell() {
        double markup = this.getRetailPrice() - this.getStockPrice();
        return markup;
    }


}
