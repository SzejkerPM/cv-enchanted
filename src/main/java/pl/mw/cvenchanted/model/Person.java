package pl.mw.cvenchanted.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person {

    @Id
    private Long id = 1L;

    @NotBlank
    @Size(min = 2, max = 30)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 30)
    private String lastName;

    private LocalDate dateOfBirth;

    @NotBlank
    @Size(min = 9)
    private String phoneNumber;

    @NotBlank
    @Size(max = 50)
    private String email;

    @Size(max = 50)
    private String city;

    @Size(max = 50)
    private String degree;

    private String linkedin;

    private String github;

    @Size(max = 3000)
    private String about;

}
