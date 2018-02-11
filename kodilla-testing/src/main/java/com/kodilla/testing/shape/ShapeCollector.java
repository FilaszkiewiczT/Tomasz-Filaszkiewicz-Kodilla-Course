package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figurs = new ArrayList<>();

    public void addFigure(Shape shape) {
        figurs.add(shape);
    }

    public void removeFigure(Shape shape) {
        figurs.remove(shape);
    }

    public Shape getFigure(int n) {
        return figurs.get(n);
    }

    public boolean showFigures() {
        System.out.println(figurs);
        return true;
    }

    public int getFigursListSize() {
        return figurs.size();
    }
}
