package com.project.dbservice.service;

import com.project.dbservice.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();
    void savePerson(Person person);
    Person getPersonById(Long id);
    void updatePerson(Person person);
}
