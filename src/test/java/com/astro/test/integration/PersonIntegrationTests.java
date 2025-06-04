package com.astro.test.integration;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.astro.test.controller.PersonController;
import com.astro.test.converter.PersonConverter;
import com.astro.test.model.Person;
import com.astro.test.service.PersonService;
import com.astro.test.vo.PersonVO;
import com.techmath.allcrud.converter.Converter;
import com.techmath.allcrud.integration.CrudIntegrationTests;
import com.techmath.allcrud.service.CrudService;

@WebMvcTest(PersonController.class)
@AutoConfigureMockMvc
public class PersonIntegrationTests extends CrudIntegrationTests<Person, PersonVO> {

    @MockBean
    private PersonService service;

    @MockBean
    private PersonConverter converter;


    public PersonIntegrationTests() {
        super(Person.class, PersonVO.class);
        basePath = "/persons";
    }


    @Override
    protected CrudService<Person> getService() {
        return service;
    }

    @Override
    protected Converter<Person, PersonVO> getConverter() {
        return converter;
    }

}
