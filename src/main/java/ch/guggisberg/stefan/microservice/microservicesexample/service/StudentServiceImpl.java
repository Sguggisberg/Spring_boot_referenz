package ch.guggisberg.stefan.microservice.microservicesexample.service;

import ch.guggisberg.stefan.microservice.microservicesexample.entity.StudentEntity;
import ch.guggisberg.stefan.microservice.microservicesexample.exception.ResourceNotFoundException;
import ch.guggisberg.stefan.microservice.microservicesexample.model.StudentDto;
import ch.guggisberg.stefan.microservice.microservicesexample.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentDto findById(Long id) {
       StudentEntity studentEntity = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not found"));
       return modelMapper.map(studentEntity, StudentDto.class);
    }

    public StudentDto save(StudentDto studentDto) {
        StudentEntity studentEntity =  studentRepository.save(modelMapper.map(studentDto,StudentEntity.class));
        return modelMapper.map(studentEntity, StudentDto.class);
    }
}
