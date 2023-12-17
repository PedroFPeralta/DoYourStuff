package com.peralta.DoYourStuff.repositories;

import com.peralta.DoYourStuff.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
