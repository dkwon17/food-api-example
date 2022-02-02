package org.food;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Food extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

    @Column(length = 40)
    public String restaurantName;

    public BigDecimal price;

    public static Food findByName(String name) {
        return find("name", name).firstResult();
    }
}