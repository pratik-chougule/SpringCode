
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-student.css">



</head>
<body>
	<div align="center">
		<!-- Creating a spring  form where the user can enter the data  -->

		<h2>Add Student</h2>
		<form:form action="save-student" modelAttribute="student" method="POST">

            <form:hidden path="id"/>

			<form:label path="name">Name :</form:label>
			<form:input path="name" />
			<br />
			<form:label path="mobile">Mobile :</form:label>
			<form:input path="mobile" />
			<br />
			<form:label path="country">Country :</form:label>
			<form:input path="country" />
			<br />
			<form:button type="submit" value="submit">Submit</form:button>

		</form:form>


	</div>

</body>
</html>