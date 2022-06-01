package com.lele.eCommerce.controller;

import com.lele.eCommerce.dto.user.ResponseDto;
import com.lele.eCommerce.dto.user.SignupDto;
import com.lele.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

//    @PostMapping("/signin")
//    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
//        return userService.signIn(signInDto);
//    }
}
