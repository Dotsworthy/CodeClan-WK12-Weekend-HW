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
}
