package com.hogwarts.institute.Service;

import com.hogwarts.institute.Model.Student;
import com.hogwarts.institute.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmissionService {

	@Autowired
	private StudentRepository studentRepository;

	public void newAdmission(Student student){
		studentRepository.save(student);
	}
}
