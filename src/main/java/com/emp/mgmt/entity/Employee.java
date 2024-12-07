package com.emp.mgmt.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="Employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String contactNo;
    private String emailId;
    private String password;
    private String gender;
    private String role;
    private LocalDate createDate;
    @ManyToOne
    private ParentDept dept;
}
