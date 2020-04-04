package Instruments;

import Actions.IPlay;
import Actions.ISell;
import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.ItemType;
import EnumerableLists.MaterialType;

public class Keyboard extends Instrument implements IPlay, ISell {

    private boolean hasTouchSensitiveKeys;

    public Keyboard(boolean hasTouchSensitiveKeys, MaterialType material, ColourType colour, InstrumentType instrument, ItemType itemType, double stockPrice, int stock, double retailPrice) {
        super(material, colour, instrument, itemType, stockPrice, stock, retailPrice);
        this.hasTouchSensitiveKeys = hasTouchSensitiveKeys;

    }

    public boolean getHasTouchSensitiveKeys() {
        return hasTouchSensitiveKeys;
    }

    public String play() {
        return "Playing keyboard. Plink plonk.";
    }

    public double sell() {
        double markup = this.getRetailPrice() - this.getStockPrice();
        return markup;
    }
}
