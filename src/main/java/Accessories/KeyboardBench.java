package Accessories;

import Actions.ISell;
import EnumerableLists.ItemType;
import ShopPackage.Item;

public class KeyboardBench extends Item implements ISell {

    private boolean hasSeat;
    private String brand;
    private int height;


    public KeyboardBench(ItemType itemType, double stockPrice, int stock, double retailPrice, boolean hasSeat, String brand, int height) {
        super(itemType, stockPrice, stock, retailPrice);
        this.hasSeat = hasSeat;
        this.brand = brand;
        this.height = height;
    }

    public double sell() {
        return 0;
    }

    public boolean getSeat() {
        return hasSeat;
    }

    public String getBrand() {
        return brand;
    }

    public int getHeight() {
        return height;
    }
}
