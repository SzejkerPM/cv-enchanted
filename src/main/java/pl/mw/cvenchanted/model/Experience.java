package pl.mw.cvenchanted.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate started;

    private LocalDate ended;

    @NotBlank
    @Size(max = 100)
    private String degree;

    @NotBlank
    @Size(max = 100)
    private String business;

    @Size(max = 1000)
    private String description;

}
