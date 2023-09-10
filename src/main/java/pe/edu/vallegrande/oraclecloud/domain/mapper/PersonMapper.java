package pe.edu.vallegrande.oraclecloud.domain.mapper;


import pe.edu.vallegrande.oraclecloud.domain.dto.PersonDTO;
import pe.edu.vallegrande.oraclecloud.domain.entity.Person;

public class PersonMapper {
    public static Person toEntity(PersonDTO dto) {
        Person person = new Person();
        person.setDni(dto.getDni());
        person.setName(dto.getName());
        person.setLastname(dto.getLastname());
        person.setEmail(dto.getEmail());
        person.setPhone(dto.getPhone());
        person.setType(dto.getType());
        person.setStatus(dto.getStatus());
        person.setBirthdate(dto.getBirthdate());
        return person;
    }

}
