import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTestNG {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(2, 2), 4, "Test failed!");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(2, 2), 0, "Test failed!");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(2, 3), 6, "Test failed!");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(6, 3), 2, "Test failed!");
    }
}
