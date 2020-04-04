package InstrumentTests;

import EnumerableLists.ItemType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ColourType.*;
import static EnumerableLists.InstrumentType.*;
import static EnumerableLists.MaterialType.*;
import static EnumerableLists.TrumpetType.*;
import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(FLUGELHORN, YELLOWBRASS, GOLD, BRASS, ItemType.INSTRUMENT, 14.99, 6, 79.99);

    }

    @Test
    public void canGetTrumpetType() {
        assertEquals(FLUGELHORN, trumpet.getTrumpetType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(YELLOWBRASS, trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(GOLD, trumpet.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(BRASS, trumpet.getInstrument());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(14.99, trumpet.getStockPrice(), 00);
    }

    @Test
    public void canGetStock() {
        assertEquals(6, trumpet.getStock());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(79.99, trumpet.getRetailPrice(), 00);
    }

    @Test
    public void canPlay() {
        assertEquals("Playing my " + trumpet.getColour() +" trumpet. Parp.", trumpet.play());
    }

    @Test
    public void canGetMarkup() {
        double markup = trumpet.sell();
        assertEquals(65.00, markup,00);
    }
}