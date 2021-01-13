package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService controller;
    @GetMapping("/company");


    Company company=new Company();

}
