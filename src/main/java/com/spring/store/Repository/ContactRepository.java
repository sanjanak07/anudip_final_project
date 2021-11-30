package com.spring.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.store.entity.ContactData;


public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}