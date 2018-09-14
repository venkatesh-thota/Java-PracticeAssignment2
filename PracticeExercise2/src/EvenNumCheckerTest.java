import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumCheckerTest {
    EvenNumChecker evenNumChecker;
    @Before
    public void setUp() throws Exception {
        evenNumChecker = new EvenNumChecker();
    }

    @After
    public void tearDown() throws Exception {
        evenNumChecker=null;
    }

    @Test
    public void isEven() {
        boolean expected = true;
        assertEquals(expected,evenNumChecker.isEven(2));
    }
}