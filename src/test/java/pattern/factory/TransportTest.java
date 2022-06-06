package pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @Test
    void media() {
        String type = "truck";
        Transport t = TransportFactory.createTransport(type);

        if (type.equals("truck")) {
            assertEquals("Truck's media is road", t.media());
        } else {
            assertEquals("Ship's media is sea", t.media());
        }
    }
}