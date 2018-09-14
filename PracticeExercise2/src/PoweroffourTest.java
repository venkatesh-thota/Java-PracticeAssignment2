import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoweroffourTest {
    Poweroffour poweroffour;
    @Before
    public void setUp() throws Exception {
        poweroffour =new Poweroffour();
    }

    @After
    public void tearDown() throws Exception {
    poweroffour=null;
    }

    @Test
    public void poweroffourChecker() {
        boolean expected=true;
        assertEquals(expected,poweroffour.PoweroffourChecker(64));
    }
}