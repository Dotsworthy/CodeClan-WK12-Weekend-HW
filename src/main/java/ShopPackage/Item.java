package ShopPackage;

import EnumerableLists.ItemType;

public abstract class Item {

    private ItemType itemType;
    private double stockPrice;
    private int stock;
    private double retailPrice;

    public Item(ItemType itemType, double stockPrice, int stock, double retailPrice) {
        this.itemType = itemType;
        this.stockPrice = stockPrice;
        this.stock = stock;
        this.retailPrice = retailPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public int getStock() {
        return stock;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
