package com.hairsalon.model.enumeration;

public enum Gender {

    FEMININE("feminino"), MASCULINE("masculino");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
