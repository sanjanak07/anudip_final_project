package com.spring.store.loginRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.store.logindomain.Login;

public interface loginRepository extends JpaRepository<Login, Long> {
	
	Login findByEmailAndPassword(String email, String password);

}
