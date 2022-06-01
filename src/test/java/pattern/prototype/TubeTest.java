package pattern.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TubeTest {

    @Test
    void testClone() {
        Tube tube = new Tube(10);
        tube.setColor("green");
        tube.setRadius(5);

        Tube tubeBunshin = tube.clone();

        assertNotEquals(tube, tubeBunshin, "origin and clone must not equal");

        assertNotNull(tube.getHeight());
        assertNotNull(tubeBunshin.getHeight());
        assertEquals(tube.getHeight(), tubeBunshin.getHeight(), "height must equal");

        assertNotNull(tube.getRadius());
        assertNotNull(tubeBunshin.getRadius());
        assertEquals(tube.getRadius(), tubeBunshin.getRadius(), "radius must equal");
        
        assertNotNull(tube.getColor());
        assertNotNull(tubeBunshin.getColor());
        assertEquals(tube.getColor(), tubeBunshin.getColor(), "color must equal");
    }
}