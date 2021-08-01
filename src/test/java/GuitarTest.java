import instruments.Guitar;
import instruments.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6,true, 400, "Epiphone");
    }

    @Test
    public void has6Strings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void isAcoustic(){
        assertEquals(true, guitar.isAcoustic());
    }

    @Test
    public void canGetInstrumentCategory(){
        assertEquals(InstrumentCategory.STRING, guitar.getCategory());
    }

    @Test
    public void canGetPrice(){
        assertEquals(400,guitar.getPrice(), 0.01);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Epiphone", guitar.getBrand());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Strum strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(560, guitar.calculateMarkup(), 0.01);
    }

}

