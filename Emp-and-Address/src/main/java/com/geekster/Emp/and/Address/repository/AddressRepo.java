package com.geekster.Emp.and.Address.repository;

import com.geekster.Emp.and.Address.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Long> {
    @Transactional
    @Modifying
    @Query(value = "update Address set Street= :street,City= :city,Zipcode= :zipcode where Id= :id",nativeQuery = true)
    void updateAddress(Long id,String street,String city,String zipcode);

    @Transactional
    @Modifying
    @Query(value = "delete Address where Id= :id")
    void deleteAddress(Long id);

}
