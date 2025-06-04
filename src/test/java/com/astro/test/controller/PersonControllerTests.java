package com.astro.test.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.astro.test.converter.PersonConverter;
import com.astro.test.model.Person;
import com.astro.test.service.PersonService;
import com.astro.test.vo.PersonVO;
import com.techmath.allcrud.controller.CrudController;
import com.techmath.allcrud.controller.CrudControllerTests;
import com.techmath.allcrud.converter.Converter;
import com.techmath.allcrud.service.CrudService;

@ExtendWith(MockitoExtension.class)
public class PersonControllerTests extends CrudControllerTests<Person, PersonVO> {
    @Mock
    private PersonService service;

    @Spy
    private PersonConverter converter;

    @InjectMocks
    private PersonController controller;

    public PersonControllerTests() {
        super(Person.class, PersonVO.class);
    }

    @Override
    protected CrudService<Person> getService() {
        return service;
    }

    @Override
    protected Converter<Person, PersonVO> getConverter() {
        return converter;
    }

    @Override
    protected CrudController<Person, PersonVO> getController() {
        return controller;
    }

}
