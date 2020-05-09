package com.sda.animal_adoption.model;

import java.util.Date;

public class Adoption {

    private Long id;
    private User user;
    private Animal animal;
    private Date date; //modify to// sql.date when creating db, recommended sql.date when working with db (sql.d extends it)
    private String details;

    public Adoption() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
