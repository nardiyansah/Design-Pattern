package pattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void eat() {
        Robot robot = new Robot();
        HumanInterface robotAdapter = new RobotAdapter(robot);

        assertEquals("This creature need charge", robotAdapter.eat());
    }

    @Test
    void die() {
        Robot robot = new Robot();
        HumanInterface robotAdapter = new RobotAdapter(robot);

        assertEquals("This creature will shutdown", robotAdapter.die());
    }
}