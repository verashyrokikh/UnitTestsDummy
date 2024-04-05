import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitSuite {
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

    @Test
    public void testMethodGetLength() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals("Test failed!", 10, rectangle.getLength(), 0);
    }

    @Test
    public void testMethodSetLength() {
        Rectangle rectangle = new Rectangle(2, 5);
        rectangle.setLength(10);
        assertEquals("Test failed!", 10, rectangle.getLength(), 0);
    }

    @Test
    public void testMethodGetWidth() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals("Test failed!", 5, rectangle.getWidth(), 0);
    }

    @Test
    public void testMethodSetWidth() {
        Rectangle rectangle = new Rectangle(10, 1);
        rectangle.setWidth(5);
        assertEquals("Test failed!", 5, rectangle.getWidth(), 0);
    }

    @Test
    public void testMethodGetArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals("Test failed!", 50, rectangle.getArea(), 0);
    }
}

