package com.appslab.springbootapp.serviceImpl;

import com.appslab.springbootapp.entity.Company;
import com.appslab.springbootapp.repository.CompanyRepository;
import com.appslab.springbootapp.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository ServiceImpl;

    public CompanyServiceImpl(CompanyRepository serviceImpl) {
        ServiceImpl = serviceImpl;
    }

    @Override
    public void saveCompany(Company company) {
        ServiceImpl.save(company);

    }
}
