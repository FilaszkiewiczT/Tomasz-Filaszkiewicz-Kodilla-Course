package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskListTestSuite {
    @Test
    public void testUpdate() {
        //Givern
        TaskList student1 = new Student1TaskList();
        TaskList student2 = new Student2TaskList();
        TaskList student3 = new Student3TaskList();
        TaskList student4 = new Student4TaskList();

        Mentor mentor1 = new Mentor("Adam Kowalski");
        Mentor mentor2 = new Mentor("Monika Klich");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor2);

        //When
        student1.addTask("task1");
        student1.addTask("task2");
        student2.addTask("Task1");
        student2.addTask("Task2");
        student3.addTask("task1");
        student3.addTask("task2");
        student3.addTask("task3");
        student4.addTask("task1");
        student4.addTask("task2");
        student4.addTask("task3");

        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(6, mentor2.getUpdateCount());
    }
}
