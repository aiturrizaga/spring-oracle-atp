package pe.edu.vallegrande.oraclecloud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.oraclecloud.domain.dto.PersonDTO;
import pe.edu.vallegrande.oraclecloud.domain.entity.Person;
import pe.edu.vallegrande.oraclecloud.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(personService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody PersonDTO dto) {
        return ResponseEntity.ok(personService.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody PersonDTO dto) {
        return ResponseEntity.ok(personService.update(id, dto));
    }

}
