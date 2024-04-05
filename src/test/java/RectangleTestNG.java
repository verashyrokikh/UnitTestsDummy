import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RectangleTestNG {

    @Test
    public void testMethodGetLength() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(rectangle.getLength(),10, "Test failed!");
    }

    @Test
    public void testMethodSetLength() {
        Rectangle rectangle = new Rectangle(2,5);
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
