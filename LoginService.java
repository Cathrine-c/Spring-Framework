package org.example.service;

import org.example.dao.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service

public class LoginService {


    private LoginRepository loginRepository;


    @Autowired
    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;

    }

    public LoginRepository getLoginRepository() {
        return loginRepository;
    }
}
