<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/mystylesheet.css">
</head>
<body>
<h1>Selenium Expresss</h1>
<h1>Student Management</h1>
<div align="center">
<form action="showAddStudent">
<input type="submit" value="ADD">
</form>
        <table border="1">
        <thead>
        <tr>
        <td>id</td>
         <td>name</td>
          <td>mobile</td>
           <td>country</td>
           </tr>
        </thead>
       
         <c:forEach var="student" items="${students}">
         
          <tr>
        <td> ${student.id}</td>
         <td>${student.name}</td>
       <td>  ${student.mobile}</td>
       <td>  ${student.country}</td>
        <td><a href="/student-management/updateStudent?userId=${student.id }">Update</a></td>
          <td><a href="/student-management/deleteStudent?userId=${student.id }" onclick="if(!(confirm('Are you sure you want to delete this student'))) return false">Delete</a></td>
        
           </tr>
         
         </c:forEach>
         </table> 
         
         <img alt=""  src="/student-management/URLToReachResourcesFolder/images/pra1.jpg">
         </div>
</body>
</html>