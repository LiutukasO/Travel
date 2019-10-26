package com.liutopeda.travel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    protected Route(){}

    public Route(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}