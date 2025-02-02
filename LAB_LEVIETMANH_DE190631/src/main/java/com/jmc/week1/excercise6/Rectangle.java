package com.jmc.week1.excercise6;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length =length;
        this.width = width;
        this.area=CalculateArea();
        this.perimeter=CalculatePerimeter();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
   protected double CalculateArea() {
        return (this.length * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    protected double CalculatePerimeter() {
        return (length + width)*2;
    }
}
