package pl.mw.cvenchanted.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mw.cvenchanted.model.Person;
import pl.mw.cvenchanted.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person get() {
        if (personRepository.count() != 0) {
            return personRepository.findAll().get(0);
        }
        return null;
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void delete() {
        personRepository.deleteById(1L);
    }
}
