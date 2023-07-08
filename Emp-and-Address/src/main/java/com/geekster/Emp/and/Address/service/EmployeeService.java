package com.geekster.Emp.and.Address.service;

import com.geekster.Emp.and.Address.model.Employee;
import com.geekster.Emp.and.Address.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return (List<Employee>)employeeRepo.findAll();
    }

    public Optional<Employee> getEmployee(long id) {
        return employeeRepo.findById(id);
    }

    public void update(Long id, String fName, String lName) {
        employeeRepo.UpdateEmployee(id,fName,lName);
    }

    public void deleteEmp(Long id) {
        employeeRepo.deleteById(id);
    }
}
