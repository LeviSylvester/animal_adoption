package com.sda.animal_adoption.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Date date; //mod to sql.date
    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user; //user_id in db
    @OneToOne
    @JoinColumn(name = "id_animal", referencedColumnName = "id")
    private Animal animal; //animal_id in db

    public Meeting() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
