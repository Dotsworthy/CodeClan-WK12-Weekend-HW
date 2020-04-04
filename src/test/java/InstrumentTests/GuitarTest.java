package InstrumentTests;

import EnumerableLists.ItemType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ColourType.*;
import static EnumerableLists.InstrumentType.*;
import static EnumerableLists.MaterialType.*;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, MAHOGANY, NATURALWOOD, STRING, ItemType.INSTRUMENT, 24.99, 3, 129.99);

    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MAHOGANY, guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(NATURALWOOD, guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(STRING, guitar.getInstrument());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing " + guitar.getNoOfStrings() + " string guitar. Strum strum.", guitar.play());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(24.99, guitar.getStockPrice(), 00);
    }

    @Test
    public void canGetStock() {
        assertEquals(3, guitar.getStock());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(129.99, guitar.getRetailPrice(), 00);
    }

    @Test
    public void canGetMarkup() {
        double markup = guitar.sell();
        assertEquals(105.00, markup,01);
    }
}
