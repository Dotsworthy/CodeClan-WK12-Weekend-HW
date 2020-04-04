import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static EnumerableLists.ColourType.NATURALWOOD;
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
    public void canGetStrings() {
        assertEquals(6, guitar.getStrings());
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
        assertEquals(STRING, guitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing " + guitar.getStrings() + " string guitar. Strum strum.", guitar.play());
    }
}
