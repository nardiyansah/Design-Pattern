package pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @Test
    void media() {
        Transport truck = new Truck();
        assertEquals("Truck's media is road", truck.media());

        Transport ship = new Ship();
        assertEquals("Ship's media is sea", ship.media());
    }
}