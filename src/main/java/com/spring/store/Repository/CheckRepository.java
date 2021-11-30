package com.spring.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.store.entity.CheckoutData;


public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}

