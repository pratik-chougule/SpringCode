<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>

<style type="text/css">

.error{
color:red;
position:fixed;
text-align:left;
margin-left:30px;
}

</style>




<script type="text/javascript">
 function validateUserName(){

	 var userName=document.getElementById("yn").value;

	 if(userName.length<3){

		 alert("your name should have at least two character")
      return false;

		 }

	 else{
  return true;
		 }
	 }

</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo"> <!-- onsubmit="return validateUserName()" -->
		<div align="center">
			<p>
				<form:label path="username">Your Name</form:label> <form:input path="username" id="yn"
					name="username" />
					<form:errors path="username" cssClass="error"/>
			</p>

			<p>
				<form:label path="crushname" >Crush Name</form:label> <form:input path="crushname" id="cn"
					name="crushname" />
			</p>
            <p>
            <form:checkbox path="termAndCondition" id="check"/>
            <form:label path="">I am agreeing that this is for fun</form:label>
            <form:errors path="termAndCondition" cssClass="error" />
            </p>

			<form:button>Calculate</form:button>
		</div>
	</form:form>
</body>
</html>