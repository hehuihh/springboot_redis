package com.hehui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hehui.po.Employee;

@Mapper
public interface EmployeeDao {

	List<Employee> findAll();
	
	@Select("SELECT * FROM employee WHERE id = #{id}")
	Employee selectById(Integer id);
	
}
