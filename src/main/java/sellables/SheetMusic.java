package sellables;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private double price;
    private String artist;

    public SheetMusic(double price, String artist) {
        this.price = price;
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public String getArtist() {
        return artist;
    }

    public double calculateMarkup(){
        return this.price * 2;
    }
}
