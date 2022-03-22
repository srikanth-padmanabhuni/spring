<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<h1>Hello Spring MVC Learner</h1>
	
	<%
		
		int id = (int) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		double salary = (double) request.getAttribute("salary");
		
		out.println("Id : " + id);
		out.println("Name : " + name);
		out.println("Salary : " + salary);
		
	%>
</body>
</html>