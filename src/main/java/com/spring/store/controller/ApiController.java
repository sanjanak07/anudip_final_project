package com.spring.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.store.Repository.UserRepository;
import com.spring.store.entity.UserData;


@RestController
@RequestMapping("/reg")
public class ApiController {
@Autowired
UserRepository ss;

@GetMapping("/data")
public List<UserData>get(){
return ss.findAll();
}
}