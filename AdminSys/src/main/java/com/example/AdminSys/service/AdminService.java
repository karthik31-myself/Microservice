package com.example.AdminSys.service;

import com.example.AdminSys.common.EmpAccess;
import com.example.AdminSys.common.Employee;
import com.example.AdminSys.entity.Admin;
import com.example.AdminSys.repository.AdminRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private RestTemplate restTemplate;

    //Logger logger=LoggerFactory.getLogger(AdminService.class);

    public Admin save(Admin admin) /**throws JsonProcessingException**/ {
        //logger.info("AdminService request: "+new ObjectMapper().writeValueAsString(admin));
        return adminRepo.save(admin);
    }

    /**public EmpAccess getEmpWithempid(Long id) {
        EmpAccess empAccess=new EmpAccess();
        Admin admin=adminRepo.findAdminById(id);
        Employee employee= restTemplate.getForObject("http://Employee/employee/" +admin.getEid(),Employee.class);


        //Employee employee=restTemplate.getForObject("http://Employee/employee/" +admin.getEMid(),Employee.class);
        empAccess.setAdmin(admin);
        empAccess.setEmployee(employee);
        return empAccess;


    }**/

    public EmpAccess findEmpByeid(Long id) /**throws JsonProcessingException**/ {
        EmpAccess emp=new EmpAccess();
        Admin ad=adminRepo.findAdminByEid(id);
        Employee em=restTemplate.getForObject("http://Employee/employee/" +ad.getEid(),Employee.class);
        emp.setAdmin(ad);
        emp.setEmployee(em);
       // logger.info("Admin-service getting response from Employee Service: "+new ObjectMapper().writeValueAsString(id));
        return emp;
    }
}
