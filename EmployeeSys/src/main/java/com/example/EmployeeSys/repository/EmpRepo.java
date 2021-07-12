package com.example.EmployeeSys.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.EmployeeSys.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepo {
    @Autowired
    private DynamoDBMapper dynamoDBMapper;
    //Logger logger= LoggerFactory.getLogger(EmpRepo.class);


    public Employee save(Employee employee) /**throws JsonProcessingException **/ {
        //logger.info("EmployeeRepo save data into dynamoDb: "+new ObjectMapper().writeValueAsString(employee));
        dynamoDBMapper.save(employee);
        return employee;
    }


    public String update( String eid, Employee employee) /** throws JsonProcessingException **/ {
        dynamoDBMapper.save(employee,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("eid",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(eid)
                                )));
        //logger.info("EmployeeRepo update data into dynamoDb: "+new ObjectMapper().writeValueAsString(eid));
        return "Updated!";

    }

    public String delete(String eid) /** throws JsonProcessingException **/ {
        Employee employee=dynamoDBMapper.load(Employee.class,eid);
        dynamoDBMapper.delete(eid);
        //logger.info("EmployeeRepo delete data from dynamoDb: "+new ObjectMapper().writeValueAsString(eid));
        return "Employee details are no more!";

    }

    public Employee getEmpById(String eid) /** throws JsonProcessingException **/ {
        //Employee employee=dynamoDBMapper.load(Employee.class,eid)
        //logger.info("EmployeeRepo save data to dynamoDb: "+new ObjectMapper(). writeValueAsString(employee));
        return dynamoDBMapper.load(Employee.class,eid);
    }



}
