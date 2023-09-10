package pe.edu.vallegrande.oraclecloud.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.oraclecloud.domain.dto.PersonDTO;
import pe.edu.vallegrande.oraclecloud.domain.entity.Person;
import pe.edu.vallegrande.oraclecloud.domain.mapper.PersonMapper;
import pe.edu.vallegrande.oraclecloud.repository.PersonRepository;
import pe.edu.vallegrande.oraclecloud.service.PersonService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person save(PersonDTO dto) {
        return personRepository.save(PersonMapper.toEntity(dto));
    }

    @Override
    public Person update(Long id, PersonDTO dto) {
        return personRepository.findById(id)
                .map(res -> personRepository.save(PersonMapper.toEntity(dto)))
                .orElseThrow();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }
}
