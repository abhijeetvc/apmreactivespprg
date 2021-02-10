package com.spmreactivesp.apmreactivespprg.controller;

import com.spmreactivesp.apmreactivespprg.model.Employee;
import com.spmreactivesp.apmreactivespprg.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    //Mono -> zero or one
    @PostMapping("/saveEmp")
    public Mono<Employee> saveEmployee(@RequestBody Employee employee){
        Mono<Employee> e=employeeRepository.save(employee);
        return e;
    }

    // Flux -> zero or many
    @GetMapping("/getemployees")
    public Flux<Employee> getEMployees(){
        return employeeRepository.findAll();
    }

}
