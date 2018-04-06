package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasksListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String LISTNAME = "Testing list name";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "Test description");
        taskListDao.save(taskList);
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        //CleanUp
        Long id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task tasks = new Task("Test: Learn Hibernate", 14);
        Task tasks2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        tasks.setTaskFinancialDetails(tfd);
        tasks2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(tasks);
        taskList.getTasks().add(tasks2);
        tasks.setTaskList(taskList);
        tasks2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        Long id = taskList.getId();

        //Then
        Assert.assertNotEquals(null, id);

        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testNamedQueries() {
        //Given
        Task tasks1 = new Task("Test: Study Hibernate", 3);
        Task tasks2 = new Task("Test: Practice Named Queries", 6);
        Task tasks3 = new Task("Test: Study native queries", 7);
        Task tasks4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        tasks1.setTaskFinancialDetails(tfd1);
        tasks2.setTaskFinancialDetails(tfd2);
        tasks3.setTaskFinancialDetails(tfd3);
        tasks4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(tasks1);
        taskList.getTasks().add(tasks2);
        taskList.getTasks().add(tasks3);
        taskList.getTasks().add(tasks4);

        tasks1.setTaskList(taskList);
        tasks2.setTaskList(taskList);
        tasks3.setTaskList(taskList);
        tasks4.setTaskList(taskList);

        taskListDao.save(taskList);
        Long id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThenTasks = taskDao.retrieveTasksWithDurationLongerThen(6);
        //Then
        try {
            Assert.assertEquals(2, longTasks.size());
            Assert.assertEquals(4, shortTasks.size());
            Assert.assertEquals(4, enoughTimeTasks.size());
            Assert.assertEquals(3, durationLongerThenTasks.size());
        } finally {
            //CleanUp
            taskListDao.delete(id);
        }
    }

}
