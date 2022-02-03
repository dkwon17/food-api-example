package org.example.food;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Food extends PanacheEntity {

    @Column(length = 40)
    public String name;

    @Column(length = 40)
    public String restaurantName;

    public double price;

}