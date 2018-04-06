package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Tasks;
import com.kodilla.hibernate.task.TaskFinancialDetails;
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
public class TasksDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Tasks tasks = new Tasks(DESCRIPTION, 7);

        //When
        taskDao.save(tasks);

        //Then
        Long id = tasks.getId();
        Tasks readTasks = taskDao.findOne(id);
        Assert.assertEquals(id, readTasks.getId());

        //CleanUp
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Tasks tasks = new Tasks(DESCRIPTION, 7);
        taskDao.save(tasks);
        int duration = tasks.getDuration();

        //When
        List<Tasks> readTasks = taskDao.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        Long id = readTasks.get(0).getId();
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Tasks tasks = new Tasks(DESCRIPTION, 30);
        tasks.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(tasks);
        Long id = tasks.getId();

        //Then
        Assert.assertNotEquals(null, id);

        //CleanUp
        taskDao.delete(id);
    }
}