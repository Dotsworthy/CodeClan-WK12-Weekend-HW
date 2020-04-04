package InstrumentTests;

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
        keyboard = new Keyboard(true, PLASTIC, BLACK, PIANO);

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
    public void canPlay() {
        assertEquals("Playing keyboard. Plink plonk.", keyboard.play());
    }
}