package ch.guggisberg.stefan.microservice.microservicesexample.controller;

import ch.guggisberg.stefan.microservice.microservicesexample.model.StudentDto;
import ch.guggisberg.stefan.microservice.microservicesexample.service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("student/{id}")
    public ResponseEntity<StudentDto> gegtStudent(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.CREATED);
    }

    @PostMapping("student")
    public ResponseEntity<StudentDto> save(@Valid @RequestBody StudentDto studentDto) {
        return new ResponseEntity<>(studentService.save(studentDto), HttpStatus.OK);
    }

}
