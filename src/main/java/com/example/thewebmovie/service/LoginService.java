package com.example.thewebmovie.service;

import com.example.thewebmovie.dto.LoginDto;
import com.example.thewebmovie.entity.Account;
import com.example.thewebmovie.response.Message;


public interface LoginService {
    String login(Account account);
    Message loginMessage(LoginDto loginDto);

}
