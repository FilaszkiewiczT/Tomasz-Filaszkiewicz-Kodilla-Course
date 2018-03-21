package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "milk", 1);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "blue", "room");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "work", "car");
            default:
                return null;


        }


    }
}
