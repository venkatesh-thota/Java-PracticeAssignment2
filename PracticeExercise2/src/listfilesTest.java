import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class listfilesTest {
    listfiles listFiles=null;

    @Before
    public void setUp() throws Exception {
        listFiles= new listfiles();
    }

    @After
    public void tearDown() throws Exception {
        listFiles=null;
    }

    @Test
    public void getfiles() {
     String [] filenames={"one.cpp","one.txt","two.java"};
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList(filenames));
     assertEquals(expected,listFiles.getfiles("/home/cgi/Desktop/myfolder"));
    }

    @Test
    public void getfile() {
        String expected="one.txt";
        assertEquals(expected,listFiles.getfile(".txt"));
    }

    @Test
    public void readFileContent() {

    }
}