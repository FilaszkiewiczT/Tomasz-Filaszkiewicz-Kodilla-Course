package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void shoppingTaskFactoryTester() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void paintingTaskFactoryTester() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void drivingTaskFactoryTester() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
