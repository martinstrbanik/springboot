package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {


}
