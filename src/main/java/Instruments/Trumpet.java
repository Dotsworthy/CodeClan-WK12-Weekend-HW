package Instruments;

import Actions.IPlay;
import Actions.ISell;
import EnumerableLists.*;

public class Trumpet extends Instrument implements IPlay, ISell {

    private TrumpetType trumpetType;

    public Trumpet(TrumpetType trumpetType, MaterialType material, ColourType colour, InstrumentType instrument, ItemType itemType, double stockPrice, int stock, double retailPrice) {
        super(material, colour, instrument, itemType, stockPrice, stock, retailPrice);
        this.trumpetType = trumpetType;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }

    public String play() {
        return "Playing my " + this.getColour() + " trumpet. Parp.";
    }

    public double sell() {
        double markup = this.getRetailPrice() - this.getStockPrice();
        return markup;
    }
}
