package com.emp.mgmt.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="ProjectEmployee")
public class ProjectEmployee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empProjectId;
    private Employee employee;
    private LocalDate assignDate;
    private String role;
    private Boolean isActive;
    @ManyToOne
    private Project project;

}
