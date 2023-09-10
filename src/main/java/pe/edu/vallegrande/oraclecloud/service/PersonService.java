package pe.edu.vallegrande.oraclecloud.service;

import pe.edu.vallegrande.oraclecloud.domain.dto.PersonDTO;
import pe.edu.vallegrande.oraclecloud.domain.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();

    Person save(PersonDTO dto);

    Person update(Long id, PersonDTO dto);

    Optional<Person> findById(Long id);
}
