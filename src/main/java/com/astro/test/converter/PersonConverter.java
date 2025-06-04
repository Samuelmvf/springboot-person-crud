package com.astro.test.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.astro.test.model.Person;
import com.astro.test.vo.PersonVO;
import com.techmath.allcrud.converter.Converter;


@Component
public class PersonConverter implements Converter<Person, PersonVO> {
    @Override
    public PersonVO convertToVO(Person entity) {
        if (entity == null) return null;
        return new PersonVO(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhone(), entity.getAddress(), entity.getCity(), entity.getZip(), entity.getCountry(), entity.getDateOfBirth());
    }

    @Override
    public Person convertToEntity(PersonVO vo) {
        if (vo == null) return null;
        Person person = new Person();
        person.setId(vo.getId());
        person.setName(vo.getName());
        person.setEmail(vo.getEmail());
        person.setPhone(vo.getPhone());
        person.setAddress(vo.getAddress());
        person.setCity(vo.getCity());
        person.setZip(vo.getZip());
        person.setCountry(vo.getCountry());
        person.setDateOfBirth(vo.getDateOfBirth());
        return person;
    }

    public List<PersonVO> convertToVOList(List<Person> entities) {
        return entities.stream().map(this::convertToVO).collect(Collectors.toList());
    }

    public List<Person> convertToEntityList(List<PersonVO> vos) {
        return vos.stream().map(this::convertToEntity).collect(Collectors.toList());
    }
} 