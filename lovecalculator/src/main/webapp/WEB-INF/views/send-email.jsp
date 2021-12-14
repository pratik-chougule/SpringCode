<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hi ${userInfo.username }</h1>
<h2>Send Result to your Email</h2>
<form:form action="process-email" methos="GET" modelAttribute="emailDTO">

<label>Enter Your Email</label>
<form:input path="userEmail"/>
<form:button>Send</form:button>



</form:form>
</body>
</html>