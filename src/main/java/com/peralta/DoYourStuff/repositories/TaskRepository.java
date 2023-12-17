package com.peralta.DoYourStuff.repositories;

import com.peralta.DoYourStuff.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
