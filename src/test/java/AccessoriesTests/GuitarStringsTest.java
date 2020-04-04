package AccessoriesTests;

import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ItemType.ACCESSORY;
import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings(ACCESSORY, 0.99, 5, 4.99, "Small", "Big Strings");
    }

    @Test
    public void canGetItemType() {
        assertEquals(ACCESSORY, guitarStrings.getItemType());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(0.99, guitarStrings.getStockPrice(), 00);
    }

    @Test
    public void canStock() {
        assertEquals(5, guitarStrings.getStock());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(4.99, guitarStrings.getRetailPrice(), 00);
    }

    @Test
    public void canGetSize() {
        assertEquals("Small", guitarStrings.getSize());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Big Strings", guitarStrings.getBrand());
    }

    @Test
    public void canGetMarkup() {
        double markup = guitarStrings.sell();
        assertEquals(4.00, markup,00);
    }

}
