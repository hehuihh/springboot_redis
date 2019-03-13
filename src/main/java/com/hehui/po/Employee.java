package com.hehui.po;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {
	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private Integer age;
	
	private Integer deptId;

}
