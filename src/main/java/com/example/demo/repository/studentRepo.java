package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


interface studentRepo extends JpaRepository<studentEntity,Long>{
    
}