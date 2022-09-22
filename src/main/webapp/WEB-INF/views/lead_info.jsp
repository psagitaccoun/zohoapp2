<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
<h2>Lead Details</h2>
First Name:${stored.firstName} </br>
Last Name:${stored.lastName}  </br>
Source:${stored.source}     </br>
Email:${stored.email}  </br>
Mobile:${stored.mobile}  </br>

<form action="convertLead" method="post">
<input type="hidden"  name="id"  value="${stored.id}"/> 
<input type="submit" value="convert"/> 
</form>
</body>
</html>