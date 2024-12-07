package com.emp.mgmt.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="LeaveRequest")
public class LeaveRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String reason;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate requestDate;
    @ManyToOne
    private Employee employee;
    private LeaveType leaveType;
}
