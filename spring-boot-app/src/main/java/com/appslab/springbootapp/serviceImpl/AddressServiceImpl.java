package com.appslab.springbootapp.serviceImpl;

import com.appslab.springbootapp.entity.Address;
import com.appslab.springbootapp.repository.AddressRepository;
import com.appslab.springbootapp.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    AddressRepository ServiceImpl;

    public AddressServiceImpl(AddressRepository serviceImpl) {
        this.ServiceImpl = serviceImpl;
    }

    @Override
    public void saveAddress(Address address) {
        ServiceImpl.save(address);

    }
}
