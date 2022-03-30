<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>registration page</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script>
			$(document).ready(function() {
				$("#id_field").change(function() {
					$.ajax({
						url: 'validateId',
						data: {id: $("#id_field").val()},
						success: function(responseText) {
							$("#errorMsg").text(responseText);
							if(responseText != "") {
								$("#id_field").focus()
							}
						}
					});
				});
			});
		</script>
	</head>
	<body>
	
		<form action="registerUser" method="post">
			Id : <input type="text" name="id" id="id_field" /> <br /> <span id="errorMsg"></span> <br/>
			Email : <input type="email" name="email" /> <br /> 
			Name : <input type="text" name="name" /> <br /> 
			<input type="submit" name="Register" />
		</form>
		<br />
		<hr />
		<%=request.getAttribute("result")%>
	
	</body>
</html>