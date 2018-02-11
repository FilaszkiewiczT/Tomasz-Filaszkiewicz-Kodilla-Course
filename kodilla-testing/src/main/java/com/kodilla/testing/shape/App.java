package com.kodilla.testing.shape;

public class App {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1", 10);
        Square square1 = new Square("Square1", 20);
        Triangle triangle1 = new Triangle("Triangle1", 30);
        Triangle triangle2 = new Triangle("Triangle2", 30);

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
