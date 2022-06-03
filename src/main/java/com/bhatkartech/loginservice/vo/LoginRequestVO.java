package com.bhatkartech.loginservice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginRequestVO {
    private String email;
    private String pw;
}
