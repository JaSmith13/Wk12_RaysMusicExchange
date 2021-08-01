package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentCategory category;
    private double price;
    private String brand;

    public Instrument(InstrumentCategory category, double price, String brand) {
        this.category = category;
        this.price = price;
        this.brand = brand;

    }

    public InstrumentCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String play(){
        return this.category.getSoundEffect();
    }

    public double calculateMarkup(double price){
        return price * 1.4;
    }
}
