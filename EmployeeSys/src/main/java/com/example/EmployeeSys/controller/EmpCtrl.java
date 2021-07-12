package com.example.EmployeeSys.controller;

import com.example.EmployeeSys.entity.Employee;
import com.example.EmployeeSys.repository.EmpRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmpCtrl {
    @Autowired
    private EmpRepo empRepo;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) /** throws JsonProcessingException **/ {
        return empRepo.save(employee);
    }


    @PutMapping("/{id}")
    public String update(@PathVariable("id") String eid,@RequestBody Employee employee) /**throws JsonProcessingException **/ {
        return empRepo.update(eid,employee);
    }

    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable("id") String eid) /** throws JsonProcessingException **/ {
      return empRepo.getEmpById(eid);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String eid) /** throws JsonProcessingException **/ {
      return empRepo.delete(eid);
    }

}
