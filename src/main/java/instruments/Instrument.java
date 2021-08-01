package instruments;

import behaviours.IPlay;

public class Instrument implements IPlay {

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
}
