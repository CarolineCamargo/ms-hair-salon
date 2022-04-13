package com.hairsalon.model.payload;

import com.hairsalon.model.enumeration.Gender;

import java.time.LocalDate;

public class ClientPayload {

    private String id;

    private String name;

    private String cpf;

    private String phone;

    private LocalDate brithDate;

    private Gender gender;
}
