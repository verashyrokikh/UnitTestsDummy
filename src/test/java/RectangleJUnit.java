import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleJUnit {

    @Test
    public void testMethodGetLength() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals("Test failed!", 10, rectangle.getLength(), 0);
    }

    @Test
    public void testMethodSetLength() {
        Rectangle rectangle = new Rectangle(2,5);
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