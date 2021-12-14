<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Registration Form</h1>
	<form:form action="registration-process" method="GET"
		modelAttribute="userReg">

		<div align="center">
			<form:label path="name">User : </form:label>
			<form:input path="name" />
			<br /> <br />
			<form:label path="userName">User Name : </form:label>
			<form:input path="userName" />
			<br /> <br />
			<form:label path="password">Password : </form:label>
			<form:input path="password" />
			<br /> <br />
			<form:label path="password">Country  : </form:label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="Jap" label="Japan"></form:option>
				<form:option value="Aus" label="Australia"></form:option>
				<form:option value="Ger" label="Germany"></form:option>
				<form:option value="UAE" label="United Arab Emirate"></form:option>
			</form:select>
			<br />
			<form:label path="hobbies">Hobbies : </form:label>
			Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Reading :
			<form:checkbox path="hobbies" value="reading" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />
			Traveling :
			<form:checkbox path="hobbies" value="travel" />
			Swimming :
			<form:checkbox path="hobbies" value="swimming" />

			<br />
			<form:label path="gender">Gender : </form:label>
			Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />
			<br />
		</div>
		<div align="center">
			<h3>Communication</h3>
			<form:label path="communicationDTO">Email</form:label>
			<form:input path="communicationDTO.email"/>
			
			<form:label path="communicationDTO.phone">Phone</form:label>
			<form:input path="communicationDTO.phone"/>
		</div>
		<br />
		<div align="center">
			<form:button value="register">Register</form:button>
		</div>
	</form:form>
</body>
</html>