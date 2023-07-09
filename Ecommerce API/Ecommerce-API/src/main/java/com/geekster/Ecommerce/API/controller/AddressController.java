package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("addAddress")
    public void addAddress(@RequestBody List<Address> addresses)
    {
        addressService.addAddresses(addresses);
    }
}
