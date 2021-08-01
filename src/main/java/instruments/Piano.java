package instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(double price, String brand, int noOfKeys) {
        super(InstrumentCategory.PIANO, price, brand);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
