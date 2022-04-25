package com.onuryalcin.studentmanagementsystem.repository;

import com.onuryalcin.studentmanagementsystem.dto.StudentDto;
import com.onuryalcin.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
