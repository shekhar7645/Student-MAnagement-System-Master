package com.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentrepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentrepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	   
		return studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		studentrepository.deleteById(id);
	}

}
