package com.appslab.springbootapp.model;

public enum Enum {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    private final String jobType;

    Enum(String jobType) {
        this.jobType=jobType;
    }

    public String getJobType() {
        return jobType;
    }
    public String getName() {
        return jobType;
    }
}
