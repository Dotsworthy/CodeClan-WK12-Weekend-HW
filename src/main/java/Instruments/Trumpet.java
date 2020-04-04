package Instruments;

import Actions.IPlay;
import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.MaterialType;
import EnumerableLists.TrumpetType;

public class Trumpet extends Instrument implements IPlay {

    private TrumpetType trumpetType;

    public Trumpet(TrumpetType trumpetType, MaterialType material, ColourType colour, InstrumentType instrument) {
        super(material, colour, instrument);
        this.trumpetType = trumpetType;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }

    public String play() {
        return "Playing my " + this.getColour() + " trumpet. Parp.";
    }
}
