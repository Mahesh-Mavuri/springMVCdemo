package com.trianz.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trianz.java.service.EmployeeService;
import com.trianz.java.vo.EmployeeBean;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getEmpList")
	public ModelAndView getEmployeeList(HttpServletRequest request, HttpServletResponse response){
		System.out.println("Inside get EmployeeList...");
		ModelAndView mov = new ModelAndView("empList");
		List<EmployeeBean> employeeList=employeeService.getEmployeeList();
		mov.addObject("jkl", employeeList);
		System.out.println(employeeList);
		return mov ;
	}
	
}
