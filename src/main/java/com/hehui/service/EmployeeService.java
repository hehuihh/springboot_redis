package com.hehui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hehui.dao.EmployeeDao;
import com.hehui.po.Employee;

@Service
public class EmployeeService {

	@Autowired private EmployeeDao employeeDao;
	
	@Cacheable(cacheNames="employee")
	public List<Employee> findAll(){
		System.out.println("查询所有员工......");
		return employeeDao.findAll();
	}
	
	@Cacheable(cacheNames="employee--id")
	public Employee selectEmp(Integer id){
		System.out.println("查询员工:"+id);
		return employeeDao.selectById(id);
	}
	
}
