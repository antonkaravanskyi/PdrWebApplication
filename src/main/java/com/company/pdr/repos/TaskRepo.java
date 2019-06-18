package com.company.pdr.repos;

import com.company.pdr.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepo extends CrudRepository<Task, Integer> {

    Optional<Task> findByTaskId(Integer taskId);
}