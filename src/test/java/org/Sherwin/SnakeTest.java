package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest extends Animal {
    Animal snake = new Snake();
    @Test
    public void testGetType() {
        assertEquals("Reptile",snake.getType());
    }

    @Test
    public void testHasLegs() {
        assertTrue("This animal doesn't have legs",snake.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Hiss",snake.speak());
    }
}