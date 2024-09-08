package ch.guggisberg.stefan.microservice.microservicesexample.controller;

import ch.guggisberg.stefan.microservice.microservicesexample.model.StudentDto;
import ch.guggisberg.stefan.microservice.microservicesexample.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
@Tag(name="CRUD Rest for User", description = "CRUD")
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "Get user")
    @ApiResponse(responseCode = "200", description = "HTP Status 200 loaded")
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> gegtStudent(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @Operation(summary = "Create User")
    @ApiResponse(responseCode = "201", description = "HHTP Status 201 created")
    @PostMapping()
    public ResponseEntity<StudentDto> save(@Valid @RequestBody StudentDto studentDto) {
        return new ResponseEntity<>(studentService.save(studentDto), HttpStatus.CREATED);
    }

}
