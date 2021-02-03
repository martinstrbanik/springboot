package com.appslab.springbootapp.controller;

import com.appslab.springbootapp.entity.Address;
import com.appslab.springbootapp.entity.Company;
import com.appslab.springbootapp.service.AddressService;
import com.appslab.springbootapp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService controller;

    @Autowired
    public CompanyController(CompanyService controller) {
        this.controller = controller;
    }

    @PostMapping(value = "/request")
    public void request(@RequestBody Company company) {
        controller.saveCompany(company);
    }


}
