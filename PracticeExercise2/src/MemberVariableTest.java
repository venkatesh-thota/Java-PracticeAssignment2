import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable;
    @Before
    public void setUp() throws Exception {
        memberVariable=new MemberVariable("ram",27,50000);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMemberName() {
        String expected="ram";
        assertEquals(expected,memberVariable.getMemberName());
    }

    @Test
    public void getMemberAge() {
        int expected=27;
        assertEquals(expected,memberVariable.getMemberAge());
    }

    @Test
    public void getMemberSalary() {
        int expected=50000;
        assertEquals(expected,memberVariable.getMemberSalary());
    }
}