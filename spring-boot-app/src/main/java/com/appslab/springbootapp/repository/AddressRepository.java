package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
