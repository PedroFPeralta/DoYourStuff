package com.peralta.DoYourStuff.services;

import com.peralta.DoYourStuff.dtos.UserDTO;
import com.peralta.DoYourStuff.entity.User;
import com.peralta.DoYourStuff.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.net.Authenticator;

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

    // This function will return the user that's logged
    public User whoImI(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.getPrincipal() instanceof User)
        {
            return (User) authentication.getPrincipal();
        }

        return null;
    }

    public User findUserByUsername(String username) throws Exception {
        return repository.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User do not exist!"));
    }


}
