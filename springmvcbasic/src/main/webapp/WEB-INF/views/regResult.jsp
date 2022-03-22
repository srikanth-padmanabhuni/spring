<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Response</title>
</head>
<body>
	<b> User with below details registered Successfully!!! </b>
	<br/>
	<%= request.getAttribute("user") %>

</body>
</html>