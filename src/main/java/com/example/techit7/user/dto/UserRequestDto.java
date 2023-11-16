package com.example.techit7.user.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {

    private String loginId;
    private String password;
    private String nickName;
    private String email;

}
