package instruments;

public class Guitar extends Instrument{
    private int strings;
    private boolean isAcoustic;

    public Guitar(int strings, boolean isAcoustic, InstrumentCategory category, double price, String brand) {
        super(category, price, brand);
        this.strings = strings;
        this.isAcoustic = isAcoustic;
    }

    public int getStrings() {
        return strings;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }
}

