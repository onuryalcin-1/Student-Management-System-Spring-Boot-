package com.onuryalcin.studentmanagementsystem;

import com.onuryalcin.studentmanagementsystem.dto.StudentDto;
import com.onuryalcin.studentmanagementsystem.entity.Student;
import com.onuryalcin.studentmanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

}
