package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Tasks;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    @Id
    @GeneratedValue
    private Long id;
    private String listName;
    private String description;
    @OneToMany(
            targetEntity = Tasks.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Tasks> tasks = new ArrayList<>();

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
