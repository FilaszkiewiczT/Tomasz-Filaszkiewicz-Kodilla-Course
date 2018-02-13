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
        Shape figure = null;
        if (n >= 0 && n < figurs.size()) {
            figure = figurs.get(n);
        }
        return figure;

    }

    public List<Shape> showFigures() {
        return figurs;
    }

    public int getFigursListSize() {
        return figurs.size();
    }
}
