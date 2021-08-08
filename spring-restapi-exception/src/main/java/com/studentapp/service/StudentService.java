package com.studentapp.service;

import java.util.List;

import com.studentapp.exceptions.IdNotFoundException;
import com.studentapp.model.Student;

public interface StudentService {
Student getStudentbyId(Integer studentId) throws IdNotFoundException;
List<Student> getStudentByCity(String city);
List<Student> getAllStudent();
List<Student> getStudentStartWith(String start);
}
