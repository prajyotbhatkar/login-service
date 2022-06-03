package com.bhatkartech.loginservice.service;

import com.bhatkartech.loginservice.vo.LoginRequestVO;
import com.bhatkartech.loginservice.vo.LoginResponseVO;

public interface LoginService {
    LoginResponseVO getLogin(LoginRequestVO requestVO);
}
