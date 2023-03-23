import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestKamatos {
    Kamatos kamatos;

    @Before
    public  void init(){
        this.kamatos = new Kamatos();

    }

    @Test
    public void testSzamitTenylegesKamat(){
        double actual = kamatos.szamitTenylegesKamat(50000, 5, 1);

        assertEquals(actual, 2500.0, 0.01);
        
    }

    @Test
    public void testSzamitTenylegesKamatSec(){
        double actual = kamatos.szamitTenylegesKamat(50000, 3, 12);

        assertEquals(actual, 1520.7, 0.1);

    }

    @Test
    public void testCheckInput(){
        boolean actual = kamatos.checkInput("3");
        assertTrue(actual);

    }

    @Test
    public void testCheckInputFalse(){
        boolean actual = kamatos.checkInput("a");        
        assertFalse(actual);
        
    }

    @Test
    public void testCheckInputSpec(){
        boolean actual = kamatos.checkInput("@");        
        assertFalse(actual);

    }

}
