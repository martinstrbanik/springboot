package com.appslab.springbootapp.controller;

import com.appslab.springbootapp.entity.Address;
import com.appslab.springbootapp.entity.Company;
import com.appslab.springbootapp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService controller;
    @Autowired
    public CompanyController(CompanyService controller) {
        this.controller = controller;
    }

    @GetMapping("/company")
            void a(){
        Company company=new Company();
        company.setName("company");
        Address address=new Address();
        address.setCity("Zilina");
        address.setState("Slovakia");
        address.setStreet("Bernolakova");
        address.setZipCode(21523);
        controller.saveCompany(company);

    }



}
