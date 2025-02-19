package com.ani.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ani.restapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
