package com.bhatkartech.loginservice.impl;

import com.bhatkartech.loginservice.service.LoginService;
import com.bhatkartech.loginservice.vo.LoginRequestVO;
import com.bhatkartech.loginservice.vo.LoginResponseVO;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.Optional;

@Component
public class LoginServiceImpl implements LoginService {
    @Override
    public LoginResponseVO getLogin(LoginRequestVO requestVO) {
//        Optional.ofNullable(requestVO)
//                .filter(y -> StringUtils.isNotEmpty(y.getEmail()))
//                .filter(x -> StringUtils.isNotEmpty(x.getPw()))
//                .orElseThrow(new ValidationException("BAD_REQUEST"));


        return null;
    }
}
