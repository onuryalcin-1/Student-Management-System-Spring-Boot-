package com.onuryalcin.studentmanagementsystem.service;

import com.onuryalcin.studentmanagementsystem.dto.StudentDto;
import com.onuryalcin.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    Student saveStudent(StudentDto studentDto);

    StudentDto getStudentById(Long id);

    Student updateStudent(StudentDto studentDto);

    void deleteStudentById(Long id);

}
