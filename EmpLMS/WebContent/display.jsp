<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leaves</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border = "2" modelAttribute="ldetails">
	<tr>
		<th> Leave Id </th>
		<th> Employee Id </th>
		<th> Start Date </th>
		<th> End Date </th>
		<th> Description </th>
		<th> Leaves Applied </th>
	</tr>
	<c:forEach var="employee" items="${ldetails}">
	<tr>
		<td>${employee.leave_id}</td>
		<td>${employee.empid}</td>
		<td>${employee.start_date}</td>
		<td>${employee.end_date}</td>
		<td>${employee.description}</td>
		<td>${employee.leaves_applied}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>