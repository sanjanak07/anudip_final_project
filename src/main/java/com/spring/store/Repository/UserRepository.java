package com.spring.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.store.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer> {

}
