package com.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.mongodbexample.models.Student;
import java.util.List;


public interface StudentRepository extends MongoRepository<Student, Integer> {
    List<Student> findByFirstName(String name);
    List<Student> finndByLastName(String name);

}
