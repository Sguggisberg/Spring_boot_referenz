package ch.guggisberg.stefan.microservice.microservicesexample.repository;

import ch.guggisberg.stefan.microservice.microservicesexample.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<StudentEntity, Long> {
}
