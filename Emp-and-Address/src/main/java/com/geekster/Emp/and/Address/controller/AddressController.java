package com.geekster.Emp.and.Address.controller;

import com.geekster.Emp.and.Address.model.Address;
import com.geekster.Emp.and.Address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("addAddress")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
    @GetMapping("getAllAddress")
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddress();
    }
    @GetMapping("getAddress/{id}")
    public Optional<Address> getAddress(@PathVariable Long id)
    {
        return addressService.getAddress(id);
    }
    @PutMapping("updateAddressBy/{id}/")
    public void updateAddress(@PathVariable Long id,@RequestParam String street,@RequestParam String City,@RequestParam String ZipCode)
    {
        addressService.updateAddress(id,street,City,ZipCode);
    }
    @DeleteMapping("deleteAddress/{id}")
    public void deleteAddress(@PathVariable Long id)
    {
        addressService.deleteAddress(id);
    }
}
