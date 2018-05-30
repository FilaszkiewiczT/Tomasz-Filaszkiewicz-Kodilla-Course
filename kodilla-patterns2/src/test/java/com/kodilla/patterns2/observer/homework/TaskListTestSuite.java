package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskListTestSuite {
    @Test
    public void testUpdate() {
        //Givern
        TaskList student1 = new StudentTaskList("Student 1 Task List");
        TaskList student2 = new StudentTaskList("Student 2 Task List");
        TaskList student3 = new StudentTaskList("Student 3 Task List");
        TaskList student4 = new StudentTaskList("Student 4 Task List");

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
