package com.jmc.week6.Shape.view;

public class ShapeView {
    public void displayShapeInfo(String message) {
        System.out.println(message);
    }

    public void displayShapeDetails(String shapeType, String shapeName, double area) {
        System.out.println(shapeType + ": " + shapeName);
        System.out.printf("Area: %.2f\n", area);
    }

    public void displayShapeDetails(String shapeType, String shapeName, double area, double volume) {
        System.out.println(shapeType + ": " + shapeName);
        System.out.printf("Surface Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
    }
}