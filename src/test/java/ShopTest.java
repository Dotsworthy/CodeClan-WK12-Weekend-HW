import Accessories.GuitarStrings;
import Instruments.Guitar;
import ShopPackage.Item;
import ShopPackage.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static EnumerableLists.ColourType.*;
import static EnumerableLists.InstrumentType.*;
import static EnumerableLists.MaterialType.*;
import static EnumerableLists.ItemType.*;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<Item> stock;
    Item item1;
    Item item2;

    @Before
    public void before() {
        stock = new ArrayList<Item>();
        this.stock.add(item1);
        item1 = new Guitar(6, MAHOGANY, NATURALWOOD, STRING, INSTRUMENT, 24.99, 3, 129.99);
        item2 = new GuitarStrings(ACCESSORY, 0.99, 5, 4.99, "Small", "Big Strings");
        shop = new Shop(stock);
    }

    @Test
    public void canGetStock(){
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canAddItem(){
        this.stock.add(item2);
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveItem(){
        this.stock.remove(0);
        assertEquals(0, shop.getStock());
    }

}


