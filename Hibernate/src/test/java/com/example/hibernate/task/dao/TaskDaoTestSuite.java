package com.example.hibernate.task.dao;

import com.example.hibernate.task.Task;
import com.example.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
//@ContextConfiguration(inheritLocations = true)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.example.hibernate.task");
        //TaskDao taskDao = context.getBean(TaskDao.class);
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assertions.assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }
    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
        Assertions.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        taskDao.deleteById(id);
    }

}

