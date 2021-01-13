package com.appslab.springbootapp;

public class CompanyServiceImpl implements CompanyService {
    CompanyRepository ServiceImpl;

    @Override
    public void saveCompany(Company company) {
        ServiceImpl.save(company);

    }
}
