package com.spmreactivesp.apmreactivespprg.repository;

import com.spmreactivesp.apmreactivespprg.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}
