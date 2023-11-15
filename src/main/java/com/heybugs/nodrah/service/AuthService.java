package com.heybugs.nodrah.service;

import com.heybugs.nodrah.DTO.UserDTO;
import org.springframework.stereotype.Service;

public interface AuthService {
    public boolean login(String username, String password);

    UserDTO register(UserDTO userDTO);
}
