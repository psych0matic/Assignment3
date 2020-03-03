package org.Sherwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class AudiTest {
    Audi audi = new Audi();
    @Test
    public void getModel() {
        assertEquals("RS3", audi.getModel());
    }

    @Test
    public void getColor() {
        assertEquals("Red",audi.getColor());
    }
}