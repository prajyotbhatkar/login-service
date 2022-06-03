package com.bhatkartech.loginservice.controller;

import com.bhatkartech.loginservice.service.LoginService;
import com.bhatkartech.loginservice.vo.LoginRequestVO;
import com.bhatkartech.loginservice.vo.LoginResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginServiceController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public LoginResponseVO getLogin(@RequestBody LoginRequestVO requestVO){
        return loginService.getLogin(requestVO);
    }
}
