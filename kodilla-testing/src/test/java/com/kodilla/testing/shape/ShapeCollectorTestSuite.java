package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Start test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("End test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Square square = new Square("Square", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        assertEquals(1, shapeCollector.getFigursListSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square("Square", 40);
        Circle circle = new Circle("Circle", 20);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        assertEquals(1, shapeCollector.getFigursListSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square("Square", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        //Then
        assertEquals(square, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        Triangle triangle = new Triangle("Triangle", 10);
        Circle circle = new Circle("Circle", 20);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.showFigures();
        //Then
        assertTrue(result);
    }

}
