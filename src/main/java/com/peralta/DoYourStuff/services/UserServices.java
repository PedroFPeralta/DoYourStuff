package com.peralta.DoYourStuff.services;

import com.peralta.DoYourStuff.dtos.UserDTO;
import com.peralta.DoYourStuff.entity.User;
import com.peralta.DoYourStuff.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    public UserRepository repository;

    public void SaveUser(User user){
        repository.save(user);
    }

    public User createUser(UserDTO userDTO){
        User user = new User(userDTO);
        this.SaveUser(user);

        return user;
    }


}
