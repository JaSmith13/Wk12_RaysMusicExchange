import instruments.InstrumentCategory;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentCategory.STRING, 1000, "Steinway", 88);
    }

    @Test
    public void canGetNoOfKeys(){
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Steinway", piano.getBrand());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1400, piano.calculateMarkup(piano.getPrice()), 0.01);
    }
}
