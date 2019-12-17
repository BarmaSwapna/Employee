package com.horizon.eja.employee.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.horizon.eja.employee.model.EmployeeE;
import com.horizon.eja.employee.repository.EmployeeRepository;
import com.horizon.eja.employee.view.EmployeeV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ObjectMapper objectMapper;
    @Override
    public List<EmployeeV> fetchAllEmployees() {
        return employeeRepository.findAll().stream().map(a->objectMapper.convertValue(a,EmployeeV.class)).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeV> addEmployee(EmployeeV employeeV) {
        EmployeeE employeeE = objectMapper.convertValue(employeeV, EmployeeE.class);
        employeeRepository.save(employeeE);
        return fetchAllEmployees();
    }

    @Override
    public EmployeeV updateEmployee(EmployeeV employeeV) {
        employeeRepository.findById(employeeV.getEmployeeId()).ifPresent(a->{
            a.setEmpAccount(employeeV.getEmpAccount());
            a.setEmpName(employeeV.getEmpName());
            employeeRepository.saveAndFlush(a);
        });
        return objectMapper.convertValue(employeeRepository.findById(employeeV.getEmployeeId()).get(),EmployeeV.class);
    }

    @Override
    public String deleteEmployee(Integer empId) {
        employeeRepository.deleteById(empId);
        return "Employee details has been deleted";
    }

    @Override
    public String fetchLans() {
        return null;
    }
}
