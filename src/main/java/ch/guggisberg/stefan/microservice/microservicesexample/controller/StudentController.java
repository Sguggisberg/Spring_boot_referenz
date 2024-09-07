package ch.guggisberg.stefan.microservice.microservicesexample.controller;

import ch.guggisberg.stefan.microservice.microservicesexample.model.StudentDto;
import ch.guggisberg.stefan.microservice.microservicesexample.service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> gegtStudent(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<StudentDto> save(@Valid @RequestBody StudentDto studentDto) {
        return new ResponseEntity<>(studentService.save(studentDto), HttpStatus.CREATED);
    }

}
