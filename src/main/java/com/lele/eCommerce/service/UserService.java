package com.lele.eCommerce.service;

import com.lele.eCommerce.dto.user.ResponseDto;
import com.lele.eCommerce.dto.user.SignupDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public ResponseDto signUp(SignupDto signupDto) {
        ResponseDto responseDto = new ResponseDto("Success", "dummy Response");
        return responseDto;
    }
}
