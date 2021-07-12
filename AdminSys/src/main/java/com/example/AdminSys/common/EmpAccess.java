package com.example.AdminSys.common;

import com.example.AdminSys.entity.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpAccess {
    private Employee employee;
    private Admin admin;


}
