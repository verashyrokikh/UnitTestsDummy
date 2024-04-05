import org.testng.annotations.*;

import static org.testng.Assert.*;

public class EvenOddCheckerTestNG {
    @Test
    public void testEvenTrue() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals(evenOddChecker.check(2), true, "Test failed!");
    }

    @Test
    public void testEvenFalse() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals(evenOddChecker.check(5), false, "Test failed!");
    }
}
