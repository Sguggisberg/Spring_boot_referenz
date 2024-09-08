package ch.guggisberg.stefan.microservice.microservicesexample.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(description = "UserDto Model information")
public class StudentDto {
    private int id;

    @NotEmpty
    @Schema(description = "First Name")
    private String firstName;

    @Schema(description = "Last Name")

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Email
    @Schema(description = "Email")
    private String email;
}
