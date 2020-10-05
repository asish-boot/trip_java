<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>

<style>

body {
    background-color: lightblue;
}

h2 {
    color: Blue;
    text-align: left;
    font-size: 18px;
}

p {
    font-family: verdana;
    font-size: 20px;
    font-color: Red;
}
</style>
<div align = "center">
	<h1>
		Search Fare
	</h1>
	<form:form action="search-fare" method="GET" modelAttribute="searchFare">
	
	<table border="0">
	<thead>
		<tr>
		<p>
		<td><h2>Source :</h2></td>
		<td><form:input path="source"/></td>
		</p>
		</tr>
		<tr>
		<td><h2>Destination :</h2></td>
		<td><form:input path="destination"/></td>
		</tr>
		<tr><td></td><td align="center"><input type="submit" value = "Search"></td></tr>
	</thead>
	
	</form:form>
	</table>
</div>
</body>
</html>