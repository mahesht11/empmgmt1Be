package com.emp.mgmt.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name="ChildDept")
public class ChildDept implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long childDeptId;
    private String childDeptName;
    @ManyToOne()
    private ParentDept parentDept;
}
