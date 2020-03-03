package org.Sherwin;

public class BMW implements Car {
    private String model = "M3";
    private String color = "Blue";
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }
}
