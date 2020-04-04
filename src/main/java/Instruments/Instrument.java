package Instruments;

import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.ItemType;
import EnumerableLists.MaterialType;
import ShopPackage.Item;

public abstract class Instrument extends Item {

    private MaterialType material;
    private ColourType colour;
    private InstrumentType instrument;

    public Instrument(MaterialType material, ColourType colour, InstrumentType instrument, ItemType itemType, double stockPrice, int stock, double retailPrice) {
        super(itemType, stockPrice, stock, retailPrice);
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
