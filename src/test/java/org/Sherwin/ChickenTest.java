package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest extends Animal {

    Animal chick = new Chicken();
    @Test
    public void testGetType() {
        assertEquals("Bird",chick.getType());
    }

    @Test
    public void testGetLegs() {
        assertTrue("This animal doesn't have legs",chick.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Cluck", chick.speak());
    }
}