package com.geekster.Mapping.controller;

import com.geekster.Mapping.model.Address;
import com.geekster.Mapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("AddAddress")
    public void addAddress(@RequestBody Address address)
    {
        addressService.add(address);
    }
}
