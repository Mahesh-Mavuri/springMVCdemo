<%@page import="com.trianz.java.vo.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ankita sapra</title>
</head>
<body>
	<h1>Welcome!</h1>
	
	
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<h1>Employees List</h1>

	<c:forEach var="emp" items="${jkl}">
		<div>${emp.empid}</div>
		<div>${emp.empfirstname}</div>
		<div>${emp.emplastname}</div>
	</c:forEach>




</body>
</html>