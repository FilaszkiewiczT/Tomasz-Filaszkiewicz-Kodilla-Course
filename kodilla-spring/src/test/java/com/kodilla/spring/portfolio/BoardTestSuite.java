package com.kodilla.spring.portfolio;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("Zadanie 1");
        board.doneList.tasks.add("Zadanie 2");
        board.inProgressList.tasks.add("Zadanie 3");
        //Then
        System.out.println("toDoList: " + board.toDoList.tasks);
        System.out.println("inProgressList: " + board.doneList.tasks);
        System.out.println("doneList: " + board.inProgressList.tasks);
    }
}
