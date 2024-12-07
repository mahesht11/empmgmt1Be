package com.emp.mgmt.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="Project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private String projectName;
    private String clientName;
    private String contactPerson;
    private LocalDate startDate;
    private Long leadByEmpId;
    private String managerName;
    private Employee employee;
}
