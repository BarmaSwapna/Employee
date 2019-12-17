package com.horizon.eja.employee.controller;

import com.horizon.eja.employee.service.EmployeeService;
import com.horizon.eja.employee.view.EmployeeV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/fetch",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeV> listAllEmployee(){
        return employeeService.fetchAllEmployees();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeV> addEmployee(@RequestBody EmployeeV employeeV){

        return employeeService.addEmployee(employeeV);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeV updateEmployee(@RequestBody EmployeeV employeeV){

        return employeeService.updateEmployee(employeeV);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteEmployee(@RequestParam(value = "empid",required = true) Integer empId){

        return employeeService.deleteEmployee(empId);
    }

    @RequestMapping(value = "/fetchlans",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String listAllLans(){
        return employeeService.fetchLans();
    }
}
