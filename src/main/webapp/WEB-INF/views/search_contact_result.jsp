<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Informations</title>
</head>
<body>
<h2>List of all Contacts</h2>
<table border="1"  width="500">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Create Bill</th>
</tr>
</table>

 <c:forEach var="stored" items="${contact}">
<table  border="1"  width="500">
<tr>
<td><a href="contactInfo?id=${stored.id}">${stored.firstName }</a></td>
<td>${stored.lastName }</td>
<td>${stored.email }</td>
<td>${stored.mobile }</td>
<td><a href="showGenerateBillPage?id=${stored.id}">create bill</a></td>
</tr>
</table>

        </c:forEach>
</body>
</html>