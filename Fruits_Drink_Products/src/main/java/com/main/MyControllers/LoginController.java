package com.main.MyControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.Models.LoginDTO;

@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginDTO loginDto;
}
