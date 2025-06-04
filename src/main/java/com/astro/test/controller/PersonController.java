package com.astro.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.test.converter.PersonConverter;
import com.astro.test.model.Person;
import com.astro.test.service.PersonService;
import com.astro.test.vo.PersonVO;
import com.techmath.allcrud.controller.CrudController;
import com.techmath.allcrud.converter.Converter;
import com.techmath.allcrud.service.CrudService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class PersonController extends CrudController<Person, PersonVO> {
    private final PersonService service;
    private final PersonConverter converter;

    @Override
    protected CrudService<Person> getService() {
        return service;
    }

    @Override
    protected Converter<Person, PersonVO> getConverter() {
        return converter;
    }

    // TODO: Add custom methods here
} 