package com.example.thewebmovie.controller;

import com.example.thewebmovie.dto.LoginDto;
import com.example.thewebmovie.entity.Account;
import com.example.thewebmovie.repo.LoginRepository;
import com.example.thewebmovie.response.Message;
import com.example.thewebmovie.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:3000" ,"https://group8-power-of-love.netlify.app/"})
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllAccount() {
        return ResponseEntity.ok(loginRepository.findAll());
    }
    @GetMapping("/getByEmail/{email}")
    public Account accountByEmail(@PathVariable String email){
        return loginRepository.findByEmail(email);
    }
    @PostMapping("/signup")
    public String signUp(@RequestBody Account account) {

        return  loginService.login(account);
    }

    @PostMapping("/signin")
    public ResponseEntity<?>loginAccount(@RequestBody LoginDto loginDto){
        Message message = loginService.loginMessage(loginDto);
        return ResponseEntity.ok(message);
    }
}
