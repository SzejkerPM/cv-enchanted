package pl.mw.cvenchanted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mw.cvenchanted.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
