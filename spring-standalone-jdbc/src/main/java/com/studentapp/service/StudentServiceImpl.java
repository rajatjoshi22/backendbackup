package com.studentapp.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.dao.IStudent;
import com.studentapp.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    IStudent studentDao;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
	}

	@Override
	public void updateStudent(Integer studentId, Long mobileNumber) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(studentId, mobileNumber);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		return studentDao.getStudentByCity(city);
	}

	@Override
	public Student getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(studentId);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(studentId);
	}

	@Override
	public String getNameById(Integer studentId) {
		// TODO Auto-generated method stub
	   return studentDao.getNameById(studentId);
	}

	
	

}
