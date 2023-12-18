package com.peralta.DoYourStuff.repositories;

import com.peralta.DoYourStuff.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long> {

    Optional<Task> findTaskById(int id);
}
