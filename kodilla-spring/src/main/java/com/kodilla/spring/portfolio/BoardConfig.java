package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("taskList1")
    private TaskList taskList1;
    @Autowired
    @Qualifier("taskList2")
    private TaskList taskList2;
    @Autowired
    @Qualifier("taskList3")
    private TaskList taskList3;

    @Bean
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "taskList1")
    @Scope("prototype")
    public TaskList toDoList() {
        TaskList list = new TaskList();
        return list;
    }

    @Bean(name = "taskList2")
    @Scope("prototype")
    public TaskList inProgressList() {
        TaskList list = new TaskList();
        return list;
    }

    @Bean(name = "taskList3")
    @Scope("prototype")
    public TaskList doneList() {
        TaskList list = new TaskList();
        return list;
    }

}
