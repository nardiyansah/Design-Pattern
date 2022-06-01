package pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {

    @Test
    void buildHome() {
        Home home1 = new Home();
        assertNotNull(home1);
        assertNull(home1.getWalls());

        Home home2 = Home.buildHome().buildWalls(4);
        assertEquals(4, home2.getWalls());

        Home home3 = Home.buildHome().buildWalls(5).buildSwimmingPool().buildFence();
        assertEquals(5, home3.getWalls());
        assertTrue(home3.getSwimmingPool());
        assertTrue(home3.getFence());
    }
}