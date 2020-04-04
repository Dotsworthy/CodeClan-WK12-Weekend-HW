package Instruments;

import Actions.IPlay;
import Actions.ISell;
import EnumerableLists.ColourType;
import EnumerableLists.InstrumentType;
import EnumerableLists.ItemType;
import EnumerableLists.MaterialType;

public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;

    public Guitar(int noOfStrings, MaterialType material, ColourType colour, InstrumentType instrument, ItemType itemType, double stockPrice, int stock, double retailPrice) {
        super(material, colour, instrument, itemType, stockPrice, stock, retailPrice);
        this.noOfStrings = noOfStrings;


    }
    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "Playing " + this.noOfStrings + " string guitar. Strum strum.";
    }

    public double sell() {
        double markup = this.getRetailPrice() - this.getStockPrice();
        return markup;
    }
}
