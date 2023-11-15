package com.heybugs.nodrah.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String password;
    private String username;
    private int age;
}
