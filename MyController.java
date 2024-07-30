package com.mongo.example.mongodbexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.mongodbexample.models.Student;
import com.repo.StudentRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/student")

public class MyController {
    @Autowired
    private StudentRepository studentRepository;

    @PutMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")

    public ResponseEntity<?> getStudent() {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
