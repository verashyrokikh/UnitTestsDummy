import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckerJUnit {

    @Test
    public void testEvenTrue() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Test failed!", true, evenOddChecker.check(2));
    }

    @Test
    public void testEvenFalse() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Test failed!", false, evenOddChecker.check(5));
    }
}
