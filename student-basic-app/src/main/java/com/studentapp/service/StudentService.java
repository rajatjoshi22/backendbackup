package com.studentapp.service;

import java.util.List;
import java.util.Optional;

import com.studentapp.model.Student;

public interface StudentService {
Student getStudentbyId(Integer studentId);
List<Student> getStudentByCity(String city);
}
