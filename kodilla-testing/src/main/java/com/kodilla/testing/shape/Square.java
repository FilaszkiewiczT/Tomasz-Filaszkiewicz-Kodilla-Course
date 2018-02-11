package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private int field;

    public Square(String name, int field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
