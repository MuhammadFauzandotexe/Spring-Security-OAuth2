package com.unkownkoder.controllers;

import com.unkownkoder.models.User;
import com.unkownkoder.repository.UserLdapRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unkownkoder.models.ApplicationUser;
import com.unkownkoder.models.LoginResponseDTO;
import com.unkownkoder.models.RegistrationDTO;
import com.unkownkoder.services.AuthenticationService;

import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@AllArgsConstructor
@Slf4j
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

    @GetMapping("/ldap-user")
    private String getLdap(){
        List<User> ram = userLdapRepository.findByUsernameLikeIgnoreCase("ram");
        log.info(String.valueOf(ram.size()));
        return "done";
    }
}   
