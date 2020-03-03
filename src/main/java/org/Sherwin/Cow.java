package org.Sherwin;

public class Cow extends Animal {
    private String type = "Mammal";
    private boolean hasLegs = true;
    private String sound = "Moo";
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
