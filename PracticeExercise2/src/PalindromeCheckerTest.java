import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
     PalindromeChecker palindromeChecker;
    @Before
    public void setUp() throws Exception {
        palindromeChecker=new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {
        palindromeChecker=null;
    }

    @Test
    public void isPalindrome() {
        boolean expected=true;
     assertEquals(expected,palindromeChecker.isPalindrome("abba"));
    }

    @Test
    public void reverse() {
        String expected="dcba";
        assertEquals(expected,palindromeChecker.reverse("abcd"));
    }
}