package com.example.crud.tasks.service;

import com.example.crud.tasks.domain.Task;
import com.example.crud.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    TaskRepository repository;
    public List<Task> getAllTasks(){
        return repository.findAll();
    }
}
