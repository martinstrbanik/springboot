package com.appslab.springbootapp.entity;

import javax.persistence.*;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String street;
    private long zipCode;
    private String city;
    private String state;



    @Column
    public String getStreet() {
        return street;
    }
    @Column
    public long getZipCode() {
        return zipCode;
    }
    @Column
    public String getCity() {
        return city;
    }
    @Column
    public String getState() {
        return state;
    }

    public Address(long id, String street, long zipCode, String city, String state) {
        this.id = id;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
