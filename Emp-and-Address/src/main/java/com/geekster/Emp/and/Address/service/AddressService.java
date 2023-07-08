package com.geekster.Emp.and.Address.service;

import com.geekster.Emp.and.Address.model.Address;
import com.geekster.Emp.and.Address.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    public Optional<Address> getAddress(Long id) {
        return addressRepo.findById(id);
    }

    public void updateAddress(Long id, String street, String city, String zipCode) {
        addressRepo.updateAddress(id,street,city,zipCode);
    }

    public void deleteAddress(Long id) {
        addressRepo.deleteAddress(id);
    }
}
