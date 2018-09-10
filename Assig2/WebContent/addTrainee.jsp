<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee Details</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	<f:form action="add.obj" modelAttribute="tdetails">
	<table>
		<tr>
			<td>Trainee Name: </td>
			<td><f:input path="TraineeName"/></td>
			<td><f:errors cssStyle="color:red" path="TraineeName"/></td><br>
		</tr>
		
		<tr>
			<td>Trainee Location: </td>
			<td><f:radiobutton path="TraineeLocation" value="Chennai"/>Chennai
			<f:radiobutton path="TraineeLocation" value="Banglore"/>Banglore
			<f:radiobutton path="TraineeLocation" value="Pune"/>Pune
			<f:radiobutton path="TraineeLocation" value="Mumbai"/>Mumbai
			</td>
			<td><f:errors cssStyle="color:red" path="TraineeLocation"/></td><br>
		</tr>
		
		<tr>
			<td>Trainee Domain:</td>
			<td><f:select path="TraineeDomain">
				<f:option value="BI">BI</f:option>
				<f:option value="JEE">JEE</f:option>
				<f:option value="MainFrame">MainFrame</f:option>
			</f:select>
			</td>
			<td><f:errors cssStyle="color:red" path="TraineeDomain"/></td><br>
		</tr>
		
		<tr>
			<td><input type="submit" value="Add Trainee"></td>
		</tr>
		
	</table>
	</f:form>
	
</body>
</html>