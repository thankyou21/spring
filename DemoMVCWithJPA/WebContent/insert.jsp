<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	<f:form action="insert.obj" modelAttribute="emp">
		Enter your employee number: 
		<f:input path="empno"/>
		<f:errors path="empno"/><br>
		
		Enter your employee name:
		<f:input path="empName"/> 
		<f:errors path="empName"/><br>
		
		Enter your Age: 
		<f:input path="age"/>
		<f:errors path="age"/><br>
		<input type="submit" value="Register">
	</f:form> 
</body>
</html>