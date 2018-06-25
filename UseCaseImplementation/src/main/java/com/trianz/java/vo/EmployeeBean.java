package com.trianz.java.vo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	private Integer empid;
	private String empfirstname;
	private String emplastname;
	/*private String empGrade;
	*/
	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpfirstname() {
		return empfirstname;
	}

	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	public String getEmplastname() {
		return emplastname;
	}

	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	/*public String getEmpGrade() {
		return empGrade;
	}
*/
	/*public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}*/

	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empfirstname=" + empfirstname + ", emplastname=" + emplastname
				+  "]";
	}
	
	
	
	
	
}
