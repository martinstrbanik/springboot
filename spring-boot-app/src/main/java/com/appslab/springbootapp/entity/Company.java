package com.appslab.springbootapp.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    Address address;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
