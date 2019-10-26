package com.liutopeda.travel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TouristGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    protected TouristGroup(){}

    public TouristGroup(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}