import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculatorTest {
    GradeCalculator gradeCalculator=new GradeCalculator();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void averagegrade() {
       int expected=80;
       int grades[]={80,90,70,80};
       assertEquals(expected,gradeCalculator.averagegrade(4, grades));
    }

    @Test
    public void maxGrade() {
        int expected=90;
        int grades[]={80,90,70,80};
        assertEquals(expected,gradeCalculator.maxGrade(4, grades));
    }

    @Test
    public void minGrade() {
        int expected=70;
        int grades[]={80,90,70,80};
        assertEquals(expected,gradeCalculator.minGrade(4, grades));
    }
}