package com.geekster.Emp.and.Address.controller;

import com.geekster.Emp.and.Address.model.Employee;
import com.geekster.Emp.and.Address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("addEmployee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
    @GetMapping("getAllEmployee")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("Employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable long id)
    {
        return employeeService.getEmployee(id);
    }
    @PutMapping("update/{Id}")
    public void update(@PathVariable Long id,@RequestParam String fName,@RequestParam String lName)
    {
        employeeService.update(id,fName,lName);
    }
    @DeleteMapping("deleteEmp/{id}")
    public void DeleteEmp(@PathVariable Long id)
    {
        employeeService.deleteEmp(id);
    }
}
