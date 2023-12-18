package com.peralta.DoYourStuff.services;

import com.peralta.DoYourStuff.dtos.TaskDTO;
import com.peralta.DoYourStuff.entity.Task;
import com.peralta.DoYourStuff.entity.User;
import com.peralta.DoYourStuff.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TaskServices {

    @Autowired
    private TaskRepository repository;
    @Autowired
    private UserServices userServices;


    public Task createEmptyTask() throws Exception {
        User user = userServices.whoImI();
        if (user == null)
            throw new Exception("You need to be authenticated");

        Task task = new Task();

        task.setCreatedBy(user);

        this.SaveTask(task);
        return task;
    }

    private void SaveTask(Task task){
        this.repository.save(task);
    }

    public Task updateTask(TaskDTO taskDTO) throws Exception {
        User user = userServices.whoImI();
        if (user == null)
            throw new Exception("You need to be authenticated");

        Task task = repository.findTaskById(taskDTO.id()).orElseThrow(() -> new Exception("Task do not exist!"));

        task.setAssignedTo(taskDTO.assignedTo());
        task.setTitle(taskDTO.title());
        task.setDescription(taskDTO.description());
        task.setLastUpdateDate(new Date());
        task.setLimitDateToBeDone(taskDTO.limitDateToBeDone());
        task.setWhoLastChange(user);

        this.SaveTask(task);

        return task;
    }

}
