package com.example.demo.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class VerifyUserDto {
    
    private String email;
    private String verificationCode;
}
