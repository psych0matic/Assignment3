package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class CowTest extends Animal {
    Animal cow = new Cow();
    @Test
    public void testGetType() {
        assertEquals("Mammal",cow.getType());
    }

    @Test
    public void testHasLegs() {
        assertTrue("This animal doesn't have legs",cow.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Moo",cow.speak());
    }
}