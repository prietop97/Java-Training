package com.lambdaschool.webemployees;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/data")
// Beans - POJOs managed by Spring
public class EmployeeController {
    // localhost:2019/data/allemployees
    @GetMapping(value = "/allemployees", produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees() {
        WebEmployeesApplication.ourEmpList.empList.sort((e1, e2) -> e1.getFname().compareToIgnoreCase(e2.getFname()));
        return new ResponseEntity<>(WebEmployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }


    // localhost:2019/data/employee/{id}
    @GetMapping(value = "/employee/{empID}", produces = {"application/json"})
    public ResponseEntity<?> getEmployee(@PathVariable long empID){
        return new ResponseEntity<>(WebEmployeesApplication.ourEmpList.findEmployee(e -> e.getId() == empID),HttpStatus.OK);
    }


    // localhost:2019/data/employees/{filter}
    @GetMapping(value = "/employees/{letter}", produces = {"application/json"})
    public ResponseEntity<?> getEmployeeByFname(@PathVariable char letter){
        ArrayList<Employee> rtnEmps = WebEmployeesApplication.ourEmpList.findEmployees(e -> e.getFname().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(rtnEmps,HttpStatus.OK);
    }
}
