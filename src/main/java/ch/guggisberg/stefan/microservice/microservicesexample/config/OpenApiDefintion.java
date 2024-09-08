package ch.guggisberg.stefan.microservice.microservicesexample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Rest Api Documentation",
                description = "Spring Boot Rest Api Documentation", version = "v1.0")
)
public class OpenApiDefintion {
}
