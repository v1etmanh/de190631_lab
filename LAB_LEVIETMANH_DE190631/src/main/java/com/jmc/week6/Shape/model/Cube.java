package com.jmc.week6.Shape.model;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side; // Surface area
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube with side " + side;
    }
}