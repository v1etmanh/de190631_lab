package com.jmc.week1.excercise6;

abstract   class Shape {
    protected double area,perimeter;
    protected abstract   double CalculateArea();
    protected  abstract double CalculatePerimeter();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
