package com.emp.mgmt.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="EarnedLeave")
public class EarnedLeave implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalEarnedLeaves;
    private int totalSickLeaves;
    private LocalDate lastUpdatedDate;
}
