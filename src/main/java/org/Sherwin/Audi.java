package org.Sherwin;

public class Audi implements Car{
    private String model = "RS3";
    private String color = "Red";
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }
}
