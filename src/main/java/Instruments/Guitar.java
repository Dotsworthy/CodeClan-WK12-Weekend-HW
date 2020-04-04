package Instruments;

import Actions.IPlay;
import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.MaterialType;

public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;

    public Guitar(int noOfStrings, MaterialType material, ColourType colour, InstrumentType instrument) {
        super(material, colour, instrument);
        this.noOfStrings = noOfStrings;


    }
    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "Playing " + this.noOfStrings + " string guitar. Strum strum.";
    }
}
