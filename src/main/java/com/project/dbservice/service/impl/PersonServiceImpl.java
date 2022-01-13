package com.project.dbservice.service.impl;

import com.project.dbservice.model.Person;
import com.project.dbservice.repository.PersonRepository;
import com.project.dbservice.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public void updatePerson(Person person) {
        personRepository.save(person);
    }
}

