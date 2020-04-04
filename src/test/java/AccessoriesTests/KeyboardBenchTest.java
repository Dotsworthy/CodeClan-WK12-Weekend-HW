package AccessoriesTests;

import Accessories.KeyboardBench;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ItemType.ACCESSORY;
import static org.junit.Assert.assertEquals;

public class KeyboardBenchTest {

    KeyboardBench keyboardBench;

    @Before
    public void before() {
        keyboardBench = new KeyboardBench(ACCESSORY, 1.49, 5, 9.99, true, "Sennheiser", 200);
    }

    @Test
    public void canGetItemType() {
        assertEquals(ACCESSORY, keyboardBench.getItemType());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(1.49, keyboardBench.getStockPrice(), 00);
    }

    @Test
    public void canStock() {
        assertEquals(5, keyboardBench.getStock());
    }

    @Test
    public void canGetSeat() {
        assertEquals(true, keyboardBench.getSeat());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(9.99, keyboardBench.getRetailPrice(), 00);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Sennheiser", keyboardBench.getBrand());
    }

    @Test
    public void canGetHeight() {
        assertEquals(200, keyboardBench.getHeight());
    }

    @Test
    public void canGetMarkup() {
        double markup = keyboardBench.sell();
        assertEquals(8.50, markup,00);
    }
}
