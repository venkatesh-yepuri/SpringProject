<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>User Information</h2>
	<form:form method="POST" action="/SpringProject_Git/addUser">
		<table>
			<tr>
				<td><form:label path="firstName">FirstName</form:label></td>
				<td><p style="border: solid black 1px;">
						<form:input path="firstName" />
					</p></td>
			</tr>
			<tr>
				<td><form:label path="lastName">LastName</form:label></td>
				<td><p style="border: solid black 1px;">
						<form:input path="lastName" />
					</p></td>
			</tr>
			<tr>
				<td><form:label path="emailId">EmailId</form:label></td>
				<td><p style="border: solid black 1px;">
						<form:input path="emailId" />
					</p></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>