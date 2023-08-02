package com.example.hibernate.task.dao;

import com.example.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    public List<Task> findByDuration(int duration);
}

