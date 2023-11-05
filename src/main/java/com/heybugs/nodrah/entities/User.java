package com.heybugs.nodrah.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private char gender;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
    @Column(name = "age")
    private int age;

}