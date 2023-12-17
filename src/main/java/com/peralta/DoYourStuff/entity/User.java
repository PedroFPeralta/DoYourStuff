package com.peralta.DoYourStuff.entity;


import com.peralta.DoYourStuff.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "users")
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;



    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(UserDTO userDTO) {
        this.username = userDTO.username();
        this.password = userDTO.password();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
