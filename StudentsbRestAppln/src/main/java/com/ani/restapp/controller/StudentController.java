package com.ani.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.ani.restapp.model.Student;
import com.ani.restapp.serviceimpl.StudentServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

	StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		super();
		this.service = service;
	}
	static final String SUCCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertStudent(@RequestBody Student stud) {
		String msg = "";
		
		try {
			service.addStudent(stud);
			msg =SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudent(id);
	}

	@GetMapping("/all")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}

	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.updateStudent(stud);
			msg = SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			msg =FAILURE;
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteStudent(id);
			msg = SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			msg = FAILURE;
		}

		return msg;
	}

}
