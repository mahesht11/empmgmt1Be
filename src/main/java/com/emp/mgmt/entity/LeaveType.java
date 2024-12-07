package com.emp.mgmt.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name="LEAVETYPE")
public class LeaveType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String leaveType;
}
