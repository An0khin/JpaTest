package com.home.model;

import com.home.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public void test() {
        Person newPerson = new Person(1, "David");
        repository.save(newPerson);

        repository.findAll().stream().forEach(System.out::println);
    }
}
