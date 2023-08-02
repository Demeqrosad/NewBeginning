package com.example.hibernate.task.dao;

import com.example.hibernate.task.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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
}

