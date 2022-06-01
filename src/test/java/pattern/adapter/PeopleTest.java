package pattern.adapter;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @org.junit.jupiter.api.Test
    void eat() {
        HumanInterface people = new People();

        assertEquals("This creature need eat", people.eat());
    }

    @org.junit.jupiter.api.Test
    void die() {
        HumanInterface people = new People();

        assertEquals("This creature will die", people.die());
    }
}