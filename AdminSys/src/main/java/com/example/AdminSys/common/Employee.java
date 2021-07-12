package com.example.AdminSys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long eid;
    private String name;
    private String position;
    private String grade;
    private String salary;
}
