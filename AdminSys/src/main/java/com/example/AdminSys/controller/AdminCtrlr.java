package com.example.AdminSys.controller;

import com.example.AdminSys.common.EmpAccess;
import com.example.AdminSys.entity.Admin;
import com.example.AdminSys.service.AdminService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admin")
public class AdminCtrlr {
    @Autowired
    private AdminService adminService;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @PostMapping("/save")
    public Admin save(@RequestBody Admin admin) /**throws JsonProcessingException **/ {
        return adminService.save(admin);

    }

    /**@GetMapping("/{id}")
    public EmpAccess getEmpWitheMid(@PathVariable("id") Long id){
        return adminService.getEmpWithempid(id);

    }**/

    @GetMapping("/{id}")
    public EmpAccess findEmpByeid(@PathVariable("id") Long id) /**throws JsonProcessingException**/ {
        return adminService.findEmpByeid(id);

    }



}
