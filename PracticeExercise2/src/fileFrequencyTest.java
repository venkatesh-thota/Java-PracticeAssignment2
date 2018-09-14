import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class fileFrequencyTest {
    fileFrequency frequency = new fileFrequency();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getfileFrequency() throws Exception {
        Map<String,Integer> expected=new HashMap<>();
        expected.put("i",2);
        expected.put("sleep",1);
        expected.put("like",1);
        expected.put("have",1);
        expected.put("a",1);
        expected.put("home.",1);
        expected.put("to",1);
        assertEquals(expected,frequency.getfileFrequency("/home/cgi/Desktop/test.txt"));
    }
}