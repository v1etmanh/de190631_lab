package com.jmc.week6.Shape.model;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side; // Surface area
    }

    @Override
    public double getVolume() {
        return (1.0/12.0) * Math.sqrt(2) * Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Tetrahedron with side " + side;
    }
}