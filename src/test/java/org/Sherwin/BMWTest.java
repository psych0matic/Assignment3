package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMWTest {

    BMW bmw = new BMW();
    @Test
    public void getModel() {
        assertEquals("M3",bmw.getModel());
    }

    @Test
    public void getColor() {
        assertEquals("Blue",bmw.getColor());
    }
}