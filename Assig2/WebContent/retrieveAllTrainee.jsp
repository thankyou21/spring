<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Trainee</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	<table border="2">
	<tr>
		<td>Trainee Id</td>
		<td>Trainee Name</td>
		<td>Trainee Location</td>
		<td>Trainee Domain</td>
	</tr>
		<c:forEach var="trainee" items="${tlist}">
			<tr>
				<td>${trainee.getTraineeId()}</td>
				<td>${trainee.getTraineeName()}</td>
				<td>${trainee.getTraineeLocation()}</td>
				<td>${trainee.getTraineeDomain()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>