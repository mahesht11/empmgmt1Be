package com.emp.mgmt.service;

import com.emp.mgmt.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    private EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }
}
