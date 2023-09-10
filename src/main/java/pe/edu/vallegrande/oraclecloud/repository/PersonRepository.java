package pe.edu.vallegrande.oraclecloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.oraclecloud.domain.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
