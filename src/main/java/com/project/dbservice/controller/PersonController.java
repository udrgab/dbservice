package com.project.dbservice.controller;

import com.project.dbservice.model.Person;
import com.project.dbservice.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/all")
    public List<Person> listPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @PostMapping("/persons")
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);
    }

    @PutMapping("/persons/{id}")
    public void updatePerson(@PathVariable Long id,@RequestBody Person person){
        Person existingPerson = personService.getPersonById(id);
        existingPerson.setId(id);
        existingPerson.setName(person.getName());
        existingPerson.setAddress(person.getAddress());
        personService.updatePerson(existingPerson);
    }
}

