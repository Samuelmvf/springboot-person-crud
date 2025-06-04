package com.astro.test.model;

import com.techmath.allcrud.entity.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class Person implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{10}$")
    private String phone;

    @NotBlank
    private String address;

    @NotBlank
    private String city;

    @NotBlank
    private String zip;

    @NotBlank
    private String country;

    @NotBlank
    private String dateOfBirth;
} 