package com.jmc.week1.excercise6;

public class Triangle extends  Shape{
    private double edge1,edge2,edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.perimeter=CalculatePerimeter();
        this.area=CalculateArea();
    }

    @Override
    public double CalculateArea() {
        double p= CalculatePerimeter();
        return Math.sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));
    }

    @Override
    public double CalculatePerimeter() {
        return this.edge1+this.edge2+this.edge3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", edge3=" + edge3 +
                ", edge2=" + edge2 +
                ", edge1=" + edge1 +
                '}';
    }
}
