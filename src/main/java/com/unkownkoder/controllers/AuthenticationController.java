package com.unkownkoder.controllers;

import com.unkownkoder.repository.UserLdapRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unkownkoder.models.ApplicationUser;
import com.unkownkoder.models.LoginResponseDTO;
import com.unkownkoder.models.RegistrationDTO;
import com.unkownkoder.services.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@AllArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    private UserLdapRepository userLdapRepository;
    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }

    @GetMapping("/get-ldap-user")
    private String getLdap(){
        userLdapRepository.l
    }
}
