package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.repository.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddress iAddress;

    public void addAddresses(List<Address> addresses) {
        iAddress.saveAll(addresses);
    }
}
