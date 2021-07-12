package com.example.ApiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackCtrlr {

    @GetMapping("/adminFallBack")
    public String AdminServiceFallback(){
        return "Admin service is down.Try again later...";
    }

    @GetMapping("/employeeFallBack")
    public String EmployeeServiceFallback(){
        return "Employee service is down.Try again later...";
    }


}
