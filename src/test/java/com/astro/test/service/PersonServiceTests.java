package com.astro.test.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.astro.test.model.Person;
import com.astro.test.repository.PersonRepository;
import com.techmath.allcrud.repository.EntityRepository;
import com.techmath.allcrud.service.CrudService;
import com.techmath.allcrud.service.CrudServiceTests;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTests extends CrudServiceTests<Person> {
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    public PersonServiceTests() {
        super(Person.class);
    }

    @Override
    protected CrudService<Person> getService() {
        return personService;
    }

    @Override
    protected EntityRepository<Person> getRepository() {
        return personRepository;
    }
    
}