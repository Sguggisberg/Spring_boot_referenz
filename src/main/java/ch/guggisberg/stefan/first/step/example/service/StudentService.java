package ch.guggisberg.stefan.first.step.example.service;

import ch.guggisberg.stefan.first.step.example.model.StudentDto;

public interface StudentService {
    StudentDto save(StudentDto studentDto);
    StudentDto findById(Long id);
}
