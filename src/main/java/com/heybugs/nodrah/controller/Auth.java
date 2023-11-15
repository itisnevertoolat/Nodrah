package com.heybugs.nodrah.controller;


import com.heybugs.nodrah.DTO.UserDTO;
import com.heybugs.nodrah.entities.User;
import com.heybugs.nodrah.service.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class Auth {


    private  final AuthService authService;
    private final ModelMapper modelMapper;

    Auth(AuthService authService, ModelMapper modelMapper){
        this.authService=authService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/login")
    public String login(){
        if (authService.login("killua","zibo zibo zibo ")){
            return "لاجل الحلوه كانت شرموطه";
        }else{
            return " Nodrah is the best social media app ";
        }
        //GraalVM
    }

    @PostMapping("/register/{id}")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO,@PathVariable int id){
            UserDTO savedUser = authService.register(userDTO);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
