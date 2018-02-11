package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private int field;

    public Triangle(String name, int field) {
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
        return "Triangle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
