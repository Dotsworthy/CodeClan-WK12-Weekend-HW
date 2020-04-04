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
        guitar = new Guitar(6, MAHOGANY, NATURALWOOD, STRING);

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
}
