import org.testng.annotations.*;

import static org.testng.Assert.*;

public class TestNGSuite {

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

    @Test
    public void testMethodGetLength() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(rectangle.getLength(), 10, "Test failed!");
    }

    @Test
    public void testMethodSetLength() {
        Rectangle rectangle = new Rectangle(2, 5);
        rectangle.setLength(10);
        assertEquals(rectangle.getLength(), 10, "Test failed!");
    }

    @Test
    public void testMethodGetWidth() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(rectangle.getWidth(), 5, "Test failed!");
    }

    @Test
    public void testMethodSetWidth() {
        Rectangle rectangle = new Rectangle(10, 1);
        rectangle.setWidth(5);
        assertEquals(rectangle.getWidth(), 5, "Test failed!");
    }

    @Test
    public void testMethodGetArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(rectangle.getArea(), 50, "Test failed!");
    }
}
