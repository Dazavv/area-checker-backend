package ru.web_lab4.auth;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AuthController {
    @Autowired
    private final AuthService authService;

    @PostMapping("/api/register")
    public void register(@RequestParam("login") String login,
                         @RequestParam("password") String password){
        authService.registerUser(login, password);
    }

    @PostMapping("/api/login")
    public void login(@RequestHeader("Authorization") String authorization){
        authService.checkUser(authorization);
    }
}
