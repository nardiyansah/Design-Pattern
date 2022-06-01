package pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void getPort() {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        assertEquals(db1, db2, "instance object must equal");

        System.out.println("port of db1 " + db1.getPort());
        System.out.println("port of db2 " + db2.getPort());
        assertEquals(db1.getPort(), db2.getPort(), "port must equal");
    }
}