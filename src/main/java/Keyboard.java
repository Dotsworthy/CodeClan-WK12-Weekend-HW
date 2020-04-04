import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.MaterialType;

public class Keyboard extends Instrument implements IPlay {

    private boolean hasTouchSensitiveKeys;

    public Keyboard(boolean hasTouchSensitiveKeys, MaterialType material, ColourType colour, InstrumentType instrument) {
        super(material, colour, instrument);
        this.hasTouchSensitiveKeys = hasTouchSensitiveKeys;

    }

    public boolean getHasTouchSensitiveKeys() {
        return hasTouchSensitiveKeys;
    }

    public String play() {
        return "Playing keyboard. Plink plonk.";
    }
}
