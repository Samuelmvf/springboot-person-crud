package com.astro.test.vo;

import com.techmath.allcrud.entity.AbstractEntityVO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PersonVO implements AbstractEntityVO {
    private Long id;

    @NotBlank
    private String name;

    private String email;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private String country;
    private String dateOfBirth;
} 