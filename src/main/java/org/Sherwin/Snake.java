package org.Sherwin;

public class Snake extends Animal {
    private String type = "Reptile";
    private boolean hasLegs = false;
    private String sound = "Hiss";
    public String getType() {
        return type;
    }
    public boolean hasLegs() {
        return hasLegs;
    }
    public String speak() {
        return sound;
    }
}
