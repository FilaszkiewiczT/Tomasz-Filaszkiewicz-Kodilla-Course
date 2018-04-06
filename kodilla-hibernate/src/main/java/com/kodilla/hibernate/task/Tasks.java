package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <=10"
        ),
        @NamedQuery(
                name = "Task.retrieveTasksWithDurationLongerThen",
                query = "FROM Task WHERE duration > :DURATION"
        )
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Tasks.class
)

@Entity
@Table(name = "TASKS")
public class Tasks {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @NotNull
    private Date created;
    private int duration;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    private TaskFinancialDetails taskFinancialDetails;
    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    private TaskList taskList;

    public Tasks() {
    }

    public Tasks(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreated() {
        return created;
    }

    public int getDuration() {
        return duration;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}