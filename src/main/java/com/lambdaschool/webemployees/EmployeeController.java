package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
// Beans - POJOs managed by Spring
public class EmployeeController {
    // localhost:2019/data/allemployees
    @GetMapping(
            value = "/allemployees",
            produces = {"application/json"})


    public ResponseEntity<?> getAllEmployees() {
        WebEmployeesApplication.ourEmpList.empList.sort((e1, e2) -> e1.getFname().compareToIgnoreCase(e2.getFname()));
        return new ResponseEntity<>(WebEmployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }


    // localhost:2019/data/employee/${id}

    // localhost:2019/data/employees/{filter}
}
