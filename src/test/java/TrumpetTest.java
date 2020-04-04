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
        trumpet = new Trumpet(FLUGELHORN, YELLOWBRASS, GOLD, BRASS);

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
    public void canPlay() {
        assertEquals("Playing my " + trumpet.getColour() +" trumpet. Parp.", trumpet.play());
    }
}