package com.hehui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hehui.po.Employee;
import com.hehui.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> list(){
		return employeeService.findAll();
	}
	
	@GetMapping("/emp/{id}")
	public Employee emp(@PathVariable("id") Integer id){
		return employeeService.selectEmp(id);
	}
	
}
