package com.example.techit7.user.controller;

import com.example.techit7.user.dto.UserRequestDto;
import com.example.techit7.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @PostMapping("/member/login")
    public String login(@RequestBody UserRequestDto userRequestDto){
        return "";
    }

    @PostMapping("/member/signup")
    public String postUser(@RequestBody UserRequestDto userRequestDto) {
        return "";
    }

    @PatchMapping("/member/{userid}")
    public String changeNickname(@PathVariable String userid){
        return "";
    }
}
