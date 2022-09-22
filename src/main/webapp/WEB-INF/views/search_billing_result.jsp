<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
<h2>Billing Information</h2>
<table border="1"  width="500">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Product</th>
<th>Amount</th>
<th>Email</th>
<th>Mobile</th>
</tr>
</table>

 <c:forEach var="stored" items="${bill}">
<table  border="1"  width="500">
<tr>
<td>${stored.firstName }</td>
<td>${stored.lastName }</td>
<td>${stored.product }</td>
<td>${stored.amount }</td>
<td>${stored.email }</td>
<td>${stored.mobile }</td>
</tr>
</table>

        </c:forEach>
</body>
</html>