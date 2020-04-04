package InstrumentTests;

import EnumerableLists.ItemType;
import Instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ColourType.*;
import static EnumerableLists.InstrumentType.*;
import static EnumerableLists.MaterialType.*;
//Is there a better way to import this. I believe the star is not considered the cleanest way?
import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard(true, PLASTIC, BLACK, PIANO, ItemType.INSTRUMENT, 49.99, 2, 249.99);

    }

    @Test
    public void canGetHasTouchSensitiveKeys() {
        assertEquals(true, keyboard.getHasTouchSensitiveKeys());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(PLASTIC, keyboard.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(BLACK, keyboard.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(PIANO, keyboard.getInstrument());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(49.99, keyboard.getStockPrice(), 00);
    }

    @Test
    public void canGetStock() {
        assertEquals(2, keyboard.getStock());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(249.99, keyboard.getRetailPrice(), 00);
    }

    @Test
    public void canPlay() {
        assertEquals("Playing keyboard. Plink plonk.", keyboard.play());
    }

    @Test
    public void canGetMarkup() {
        double markup = keyboard.sell();
        assertEquals(200.00, markup,00);
    }
}