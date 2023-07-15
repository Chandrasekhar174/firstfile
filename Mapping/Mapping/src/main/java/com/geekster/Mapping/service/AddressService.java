package com.geekster.Mapping.service;

import com.geekster.Mapping.model.Address;
import com.geekster.Mapping.repository.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddress iaddress;

    public void add(Address address) {
        iaddress.save(address);
    }
}
