package com.jmc.week1.excercise6;

public class Test {

    public static void displayGUIAndInputData(ShapeManagement manage) {


        System.out.println("===== Calculator Shape Program =====");

        // Input for Rectangle

        double rectangleWidth = Utils.getDoubleValue("Please input side width of Rectangle: ");


        double rectangleLength = Utils.getDoubleValue("Please input length of Rectangle: ");

        // Input for Circle

        double circleRadius =Utils.getDoubleValue("Please input radius of Circle: ");

        // Input for Triangle

        double sideA = Utils.getDoubleValue("Please input side A of Triangle: ");


        double sideB = Utils.getDoubleValue("Please input side B of Triangle: ");


        double sideC = Utils.getDoubleValue("Please input side C of Triangle: ");

        // Proceed to Function 2
       manage.add(new Rectangle(rectangleLength,rectangleWidth),new Circle(circleRadius),new Triangle(sideA,sideB,sideC));
    }
    public static void main(String[] args) throws Exception{
        ShapeManagement management=new ShapeManagement();
        displayGUIAndInputData(management);
        management.display();
    }
}
