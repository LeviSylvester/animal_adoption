package com.sda.animal_adoption.service;

public class AdoptionNotFoundException extends RuntimeException {
    public AdoptionNotFoundException(String message) {
        super(message);
    }
}
