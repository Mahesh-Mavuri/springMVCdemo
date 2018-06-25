package com.trianz.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.trianz.java.vo.EmployeeBean;

@Repository
public class EmployeeDao {

	@Autowired
	DataSource dataSource;
	
	public List<EmployeeBean> getEmployeeList(){
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		String sql="select empid, empfirstname, emplastname, empGrade from trianzdb.emp_info";
		List<EmployeeBean> list= new ArrayList<EmployeeBean>();
		List<Map<String, Object>> rows =jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.setEmpid((Integer )row.get("empid"));
			employeeBean.setEmpfirstname((String)row.get("empfirstname"));
			employeeBean.setEmplastname((String)row.get("emplastname"));
			/*employeeBean.setEmpGrade(row.get("empGrade") == null ? null :  (String )row.get("empGrade"));*/
			list.add(employeeBean);
		}
		return list;
		
	}
}
