package pattern.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testClone() {
        Circle circle = new Circle(10);
        circle.setColor("green");

        Circle circleBunshin = circle.clone();

        assertNotEquals(circle, circleBunshin, "origin and clone must not equal");

        assertNotNull(circle.getRadius());
        assertNotNull(circleBunshin.getRadius());
        assertEquals(circle.getRadius(), circleBunshin.getRadius(), "radius must equal");

        assertNotNull(circle.getColor());
        assertNotNull(circleBunshin.getColor());
        assertEquals(circle.getColor(), circleBunshin.getColor(), "color must equal");
    }
}