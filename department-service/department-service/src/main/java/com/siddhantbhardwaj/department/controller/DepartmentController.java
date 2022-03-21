package com.siddhantbhardwaj.department.controller;

import com.siddhantbhardwaj.department.entity.Department;
import com.siddhantbhardwaj.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{Id}")
    public Department findDepartmentById(@PathVariable("Id")  Long departmentId){
        log.info("Inside findDepartmentById method of department controller");
        return departmentService.findDepartmentById(departmentId);
    }

}
