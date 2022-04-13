package com.hairsalon.model.entity;

import com.hairsalon.model.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private String cpf;

    @Column
    private String phone;

    @Column
    private LocalDate brithDate;

    @Column
    private LocalDate createdAt;

    @Column
    private Gender gender;
}
