package com.lab.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.lab.enums.Category;
import com.lab.enums.FuelType;


@Entity
public class CarModel extends PanacheEntity{

    public String model;
    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    public Category category;
    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    public FuelType fuel;
    public BigDecimal price;
    public LocalDate releaseDate;
    
}
