package pe.edu.vallegrande.oraclecloud.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PersonDTO {
    private String dni;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String type;
    private String status;
    private LocalDate birthdate;
}
