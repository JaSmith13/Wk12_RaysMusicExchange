package instruments;

public enum InstrumentCategory {

    STRING ("Strum strum"),
    BRASS ("Phwamp wamp"),
    WOODWIND ("Whistle"),
    PIANO ("Plink plonk"),
    PERCUSSION ("Crash Crash!");


    private final String soundEffect;

    InstrumentCategory(String soundEffect) {
        this.soundEffect = soundEffect;
    }

    public String getSoundEffect() {
        return soundEffect;
    }
}
