package com.jmc.week6.Shape.controller;




import com.jmc.week6.Shape.model.*;
import com.jmc.week6.Shape.view.ShapeView;

public class ShapeController {
    private Shape[] shapes;
    private ShapeView view;

    public ShapeController() {
        // Initialize with some shapes
        shapes = new Shape[6];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4.0);
        shapes[2] = new Triangle(3.0, 6.0);
        shapes[3] = new Sphere(3.0);
        shapes[4] = new Cube(2.0);
        shapes[5] = new Tetrahedron(4.0);

        view = new ShapeView();
    }

    public void processShapes() {
        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                view.displayShapeDetails("Two-dimensional shape", shape.toString(), twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                view.displayShapeDetails("Three-dimensional shape", shape.toString(),
                        threeDShape.getArea(), threeDShape.getVolume());
            }
            System.out.println(); // Add space between shapes
        }
    }
}
