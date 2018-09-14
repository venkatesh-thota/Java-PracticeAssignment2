import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial factorial;
    @Before
    public void setUp() throws Exception {
        factorial=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial=null;
    }

    @Test
    public void factorialchecker() {
    long expected=479001600;
    assertEquals(expected,factorial.Factorialchecker(12));
    }
}