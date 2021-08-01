package instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(InstrumentCategory category, double price, String brand, int noOfKeys) {
        super(category, price, brand);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
