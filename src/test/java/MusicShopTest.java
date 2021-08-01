import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import sellables.SheetMusic;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        musicShop = new MusicShop();
        guitar = new Guitar(6, false, 500, "Gibson");
        sheetMusic = new SheetMusic(10, "Einaudi");
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(sheetMusic);
    }

    @Test
    public void hasListOfStock(){
        assertEquals(2, musicShop.getStock().size());
    }

    @Test
    public void shopHasMoney(){
        assertEquals(500, musicShop.getMoney(), 0.01);
    }

    @Test
    public void canAddItemToStock() {
       Piano piano = new Piano(1000, "Fazioli", 88);
       musicShop.addItemToStock(piano);
       System.out.println(musicShop.getStock());
       assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void shopCanSellItem() {
        musicShop.removeItemFromStock(guitar);
        assertEquals(1, musicShop.getStock().size());
        assertEquals(1200, musicShop.getMoney(), 0.01);

    }

    @Test
    public void canGetTotalProfit(){
        Piano piano = new Piano(1000, "Fazioli", 88);
        musicShop.addItemToStock(piano);
        assertEquals(2120, musicShop.calculatePotentialProfit(), 0.01);

    }
}
