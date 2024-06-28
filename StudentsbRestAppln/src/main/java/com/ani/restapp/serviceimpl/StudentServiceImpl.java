package com.ani.restapp.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ani.restapp.model.Student;
import com.ani.restapp.repository.StudentRepo;
import com.ani.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepo repo;

	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addStudent(Student student) {

		repo.save(student);

	}

	@Override
	public Student getStudent(int id) {
		return repo.findById(id).get();

	}

	public List<Student> getAllStudents() {

		return repo.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		repo.save(student);

	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);

	}

}
