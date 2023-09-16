package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springboot.web.entity.Employee;

 @Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}