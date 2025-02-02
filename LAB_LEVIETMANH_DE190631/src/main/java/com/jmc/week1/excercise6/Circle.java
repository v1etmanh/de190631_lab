package com.jmc.week1.excercise6;

public class Circle extends Shape{
  public static final double PI=3.14;
private double r;

    public Circle(double r) {
        this.r = r;
        this.area=CalculateArea();
        this.perimeter=CalculatePerimeter();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", r=" + r +
                '}';
    }

    @Override
    protected double CalculateArea() {
        return PI*r*r;
    }

    @Override
    protected double CalculatePerimeter() {
        return 2*PI*r;
    }



}
