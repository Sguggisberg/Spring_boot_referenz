package ch.guggisberg.stefan.first.step.example.service;

import ch.guggisberg.stefan.first.step.example.entity.StudentEntity;
import ch.guggisberg.stefan.first.step.example.model.StudentDto;
import ch.guggisberg.stefan.first.step.example.exception.ResourceNotFoundException;
import ch.guggisberg.stefan.first.step.example.repository.StudentRepository;
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
