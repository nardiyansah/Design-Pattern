package pattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void eat() {
        HumanInterface robot = new Robot();

        assertEquals("This creature need charge", robot.eat());
    }

    @Test
    void die() {
        HumanInterface robot = new Robot();

        assertEquals("This creature will shutdown", robot.die());
    }
}