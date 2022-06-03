package com.bhatkartech.loginservice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginResponseVO {
    private String statusCode;
    private String message;
}
