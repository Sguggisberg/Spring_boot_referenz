package ch.guggisberg.stefan.microservice.microservicesexample.service;

import ch.guggisberg.stefan.microservice.microservicesexample.model.StudentDto;

public interface StudentService {
    StudentDto save(StudentDto studentDto);
    StudentDto findById(Long id);
}
