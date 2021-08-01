import org.junit.Before;
import org.junit.Test;
import sellables.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(10, "The Beatles");
    }

    @Test
    public void canGetPrice(){
        assertEquals(10, sheetMusic.getPrice(), 0.01);
    }

    @Test
    public void canGetArtist(){
        assertEquals("The Beatles", sheetMusic.getArtist());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(20, sheetMusic.calculateMarkup(sheetMusic.getPrice()), 0.01);
    }
}
