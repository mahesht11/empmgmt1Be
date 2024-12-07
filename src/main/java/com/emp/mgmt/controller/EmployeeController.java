package com.emp.mgmt.controller;


import com.emp.mgmt.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    private EmployeeService employeeService;

    private EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
}
