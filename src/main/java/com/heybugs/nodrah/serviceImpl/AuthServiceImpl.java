package com.heybugs.nodrah.serviceImpl;

import com.heybugs.nodrah.DAO.UserRepo;
import com.heybugs.nodrah.DTO.UserDTO;
import com.heybugs.nodrah.entities.User;
import com.heybugs.nodrah.service.AuthService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UserRepo userRepo ;
    private ModelMapper modelMapper;

    @Override
    public boolean login(String username, String password) {
        if(username.equals("") && password.equals(""))
            return false;
        if (username.equals("killua")&& password.equals("zibo zibo zibo "))
            return true;
        return false;
    }

    @Override
    public UserDTO register(UserDTO userDTO) {
        User user = modelMapper.map(userDTO,User.class);
        User savedUser = userRepo.save(user);
        UserDTO savedUserDto= modelMapper.map(savedUser,UserDTO.class);
        return savedUserDto;
    }

}
