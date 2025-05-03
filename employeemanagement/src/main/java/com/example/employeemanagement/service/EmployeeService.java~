package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Page<Employee> getAllEmployees(int page, int size, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
                Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAllByIsDeletedFalse(pageable);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id).filter(emp -> !emp.getIsDeleted());
    }

    public Employee updateEmployee(Long id, Employee updateEmployee) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow();
        if (updateEmployee.getName() != null)
            existingEmployee.setName(updateEmployee.getName());
        if (updateEmployee.getEmail() != null)
            existingEmployee.setEmail(updateEmployee.getEmail());
        if (updateEmployee.getDepartment() != null)
            existingEmployee.setDepartment(updateEmployee.getDepartment());
        if (updateEmployee.getSalary() != null)
            existingEmployee.setSalary(updateEmployee.getSalary());
        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow();
        existingEmployee.setIsDeleted(true);
        employeeRepository.save(existingEmployee);
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartmentAndIsDeletedFalse(department);
    }

    // Additional tasks
    public List<Employee> searchEmployeeByName(String name) {
        return employeeRepository.findByNameContainingIgnoreCaseAndIsDeletedFalse(name);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        return employeeRepository.findBySalaryGreaterThanAndIsDeletedFalse(salary);
    }
}
