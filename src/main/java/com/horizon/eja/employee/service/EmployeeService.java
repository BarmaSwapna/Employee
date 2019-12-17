package com.horizon.eja.employee.service;

import com.horizon.eja.employee.view.EmployeeV;

import java.util.List;

public interface EmployeeService {
    List<EmployeeV> fetchAllEmployees();

    List<EmployeeV> addEmployee(EmployeeV employeeV);

    EmployeeV updateEmployee(EmployeeV employeeV);

    String deleteEmployee(Integer empId);

    String fetchLans();
}
