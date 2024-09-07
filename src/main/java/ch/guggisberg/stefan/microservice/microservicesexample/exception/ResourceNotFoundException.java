package ch.guggisberg.stefan.microservice.microservicesexample.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
