package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest extends Animal {
    Animal a = new Animal();
    @Test
    public void testGetType() {
        assertEquals("Undefined",a.getType());
    }

    @Test
    public void testHasLegs() {
        assertTrue("This animal doesn't have legs",a.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Nothing",a.speak());
    }
}