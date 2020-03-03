package org.Sherwin;

public class Chicken extends Animal {
    private String type = "Bird";
    private String sound = "Cluck";
    private boolean hasLegs = true;
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
