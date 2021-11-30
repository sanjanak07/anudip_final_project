package com.spring.store.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.store.loginRepository.loginRepository;
import com.spring.store.logindomain.Login;



@Service
public class loginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
   return user;
  }
 
}