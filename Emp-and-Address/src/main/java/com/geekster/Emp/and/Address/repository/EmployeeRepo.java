package com.geekster.Emp.and.Address.repository;

import com.geekster.Emp.and.Address.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Long> {
    @Transactional
    @Modifying
    @Query(value ="Update Employee set EmpFirstName= :fName,set EmpLastName= :lName where Id= :id",nativeQuery = true)
    void UpdateEmployee(Long id,String fName,String lName);
}
