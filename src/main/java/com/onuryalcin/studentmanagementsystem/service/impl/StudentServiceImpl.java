package com.onuryalcin.studentmanagementsystem.service.impl;

import com.onuryalcin.studentmanagementsystem.dto.StudentDto;
import com.onuryalcin.studentmanagementsystem.entity.Student;
import com.onuryalcin.studentmanagementsystem.repository.StudentRepository;
import com.onuryalcin.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();

        studentList.forEach(it -> {
            StudentDto studentDto2 = new StudentDto();
            studentDto2.setId(it.getId());
            studentDto2.setFirstName(it.getFirstName());
            studentDto2.setLastName(it.getLastName());
            studentDto2.setEmail(it.getEmail());
            studentDtos.add(studentDto2);
        });
        return studentDtos;
    }

    @Override
    public Student saveStudent(StudentDto studentdto) {
        Student student = new Student();
        student.setId(studentdto.getId());
        student.setFirstName(studentdto.getFirstName());
        student.setLastName(studentdto.getLastName());
        student.setEmail(studentdto.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).get();
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    }

    @Override
    public Student updateStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
