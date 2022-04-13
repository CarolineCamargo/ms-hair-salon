package com.hairsalon.model.dto;

import com.hairsalon.model.enumeration.Gender;

import java.time.LocalDate;

public class ClientCreateDTO {

    private String name;

    private String cpf;

    private String phone;

    private LocalDate brithDate;

    private Gender gender;
}
