package com.ani.restapp.service;

import java.util.List;

import com.ani.restapp.model.Student;

public interface StudentService {

	public void addStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudents();

	public void updateStudent(Student student);

	public void deleteStudent(int id);

}
