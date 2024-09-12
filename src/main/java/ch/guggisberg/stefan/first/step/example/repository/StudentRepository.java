package ch.guggisberg.stefan.first.step.example.repository;

import ch.guggisberg.stefan.first.step.example.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<StudentEntity, Long> {
}
