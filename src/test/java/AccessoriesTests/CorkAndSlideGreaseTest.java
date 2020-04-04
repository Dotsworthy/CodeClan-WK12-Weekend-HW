package AccessoriesTests;

import Accessories.CorkAndSlideGrease;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ItemType.ACCESSORY;
import static org.junit.Assert.assertEquals;

public class CorkAndSlideGreaseTest {

    CorkAndSlideGrease corkAndSlideGrease;

    @Before
    public void before() {
        corkAndSlideGrease = new CorkAndSlideGrease(ACCESSORY, 1.79, 5, 8.49, "Arnheim", "Gold");
    }

    @Test
    public void canGetItemType() {
        assertEquals(ACCESSORY, corkAndSlideGrease.getItemType());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(1.79, corkAndSlideGrease.getStockPrice(), 00);
    }

    @Test
    public void canStock() {
        assertEquals(5, corkAndSlideGrease.getStock());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(8.49, corkAndSlideGrease.getRetailPrice(), 00);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Arnheim", corkAndSlideGrease.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", corkAndSlideGrease.getColour());
    }

    @Test
    public void canGetMarkup() {
        double markup = corkAndSlideGrease.sell();
        assertEquals(6.70, markup,00);
    }

}
