package com.astro.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.test.model.Person;
import com.astro.test.repository.PersonRepository;
import com.techmath.allcrud.service.CrudService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService extends CrudService<Person> {
    private final PersonRepository personRepository;

    @Override
    public PersonRepository getRepository() {
        return personRepository;
    }

    // TODO: Add custom methods here
} 