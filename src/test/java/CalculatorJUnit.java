import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorJUnit {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Test failed!", 4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Test failed!", 0, calculator.subtract(2, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("Test failed!", 6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("Test failed!", 2, calculator.divide(6, 3));
    }
}

