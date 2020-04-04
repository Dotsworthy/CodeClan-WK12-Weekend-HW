import org.junit.Before;
import org.junit.Test;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, MaterialType.WOOD, "Natural wood", "Acoustic");

    }

    @Test
    public void canGetStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.WOOD, guitar.getMaterial());
    }
    
    @Test
    public void canGetColour() {
        assertEquals("Natural wood", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing " + guitar.getStrings() + " string guitar. Strum strum.", guitar.play());
    }
}
