package Instruments;

import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.MaterialType;

public abstract class Instrument {

    private MaterialType material;
    private ColourType colour;
    private InstrumentType instrument;

    public Instrument(MaterialType material, ColourType colour, InstrumentType instrument) {
        this.material = material;
        this.colour = colour;
        this.instrument = instrument;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public ColourType getColour() {
        return colour;
    }

    public InstrumentType getInstrument() {
        return instrument;
    }
}
