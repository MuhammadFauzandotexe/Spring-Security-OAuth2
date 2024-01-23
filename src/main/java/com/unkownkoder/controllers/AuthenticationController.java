package com.unkownkoder.controllers;

import com.unkownkoder.data.LoginResponseDTO;
import com.unkownkoder.data.RegistrationDTO;
import com.unkownkoder.models.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.*;
import com.unkownkoder.services.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@AllArgsConstructor
@Slf4j
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    private final LdapTemplate ldapTemplate;
    @PostMapping("/register")
    public User registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }






}
