package com.kodilla.testing.shape;

public class App {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Shape1", 12.1);
        Square square1 = new Square("Shape2", 20.5);
        Triangle triangle1 = new Triangle("Shape3", 30.1, 5.0);
        Triangle triangle2 = new Triangle("Shape4", 30.1, 3.5);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(triangle2);

        System.out.println("List size: " + shapeCollector.getFigursListSize());
        shapeCollector.showFigures();

        shapeCollector.removeFigure(triangle2);
        System.out.println("List size: " + shapeCollector.getFigursListSize());
        shapeCollector.showFigures();

        System.out.println("Shape sample: " + shapeCollector.getFigure(1));


    }
}
