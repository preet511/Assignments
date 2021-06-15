<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h3 style="color: red;">Add New Employee</h3>

	<div id="addEmployee">
		<form action="http://localhost:8080/oauth/authorize" method="post" modelAttribute="emp">
			<p>
				<label>Enter Employee Id</label> <br>
				 <input type="text" name="response_type" value="code" /> <br>
				 <input type="text" name="client_id" value="javainuse" /> <br>
				 <input type="text" name="redirect_uri" value="http://localhost:8090/showEmployees" /> <br>
				 <input type="text" name="scope" value="read" /> <br>
				 <input type="SUBMIT" value="Get Employee info" />
		</form>
	</div>
</body>
</html>
