package pattern.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureFactoryTest {

    @Test
    void createChair() {
        FurnitureFactory classic = new ClassicFurnitureFactory();
        FurnitureFactory modern = new ModernFurnitureFactory();

        assertEquals("classic chair", classic.createChair().getName());
        assertEquals("modern chair", modern.createChair().getName());
    }

    @Test
    void createTable() {
        FurnitureFactory classic = new ClassicFurnitureFactory();
        FurnitureFactory modern = new ModernFurnitureFactory();

        assertEquals("classic table", classic.createTable().getName());
        assertEquals("modern table", modern.createTable().getName());
    }
}