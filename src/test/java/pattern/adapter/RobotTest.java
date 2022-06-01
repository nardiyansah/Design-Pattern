package pattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void charge() {
        Robot robot = new Robot();

        assertEquals("This creature need charge", robot.charge());
    }

    @Test
    void shutdown() {
        Robot robot = new Robot();

        assertEquals("This creature will shutdown", robot.shutdown());
    }
}