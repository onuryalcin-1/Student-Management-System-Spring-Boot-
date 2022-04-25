package com.onuryalcin.studentmanagementsystem.controller;

import com.onuryalcin.studentmanagementsystem.dto.StudentDto;
import com.onuryalcin.studentmanagementsystem.entity.Student;
import com.onuryalcin.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true)
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") StudentDto studentDto){
        studentService.saveStudent(studentDto);
        return "redirect:/students";

    }

    @GetMapping("/students/edit/{id}")
    public String updateStudentForm(@PathVariable Long id , Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") StudentDto studentDto, Model model){
        StudentDto existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(studentDto.getFirstName());
        existingStudent.setLastName(studentDto.getLastName());
        existingStudent.setEmail(studentDto.getEmail());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}
