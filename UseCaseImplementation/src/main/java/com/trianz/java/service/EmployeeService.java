package com.trianz.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trianz.java.dao.EmployeeDao;
import com.trianz.java.vo.EmployeeBean;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	
	public List<EmployeeBean> getEmployeeList(){
		
		return employeeDao.getEmployeeList();
	}
}
