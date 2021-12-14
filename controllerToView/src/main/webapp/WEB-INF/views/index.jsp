<html>
<body>

<%

 String name=(String)request.getAttribute("name");
Integer id =(Integer) request.getAttribute("id");
%>

<h1>
name is 
<%=name %>
</h1>
<h1>
Id is <%=id %>
</h1>

</body>
</html>
