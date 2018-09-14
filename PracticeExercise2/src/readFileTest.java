import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class readFileTest {
    readFile file =new readFile();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void readFile()throws  Exception{
        String expected="this is content of my file in lower case";
        assertEquals(expected,file.readFile("/home/cgi/Desktop/test2.txt"));
    }
}