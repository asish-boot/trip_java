<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fare Display</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

        
        
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
		Display Fare Response
	</h1>
	<%-- <form:form action="search-fare" method="GET" modelAttribute="searchFare"> --%>
	
	<table border="0">
	<tr><h2 align="center">Fare Details : ${result} </h2></tr>
	<%-- <tr><td><h2>Amount : </h2></td>
	<td>${searchFare.currency} ${searchFare.amount}</td>
	</tr>
	<tr><td><h2>Source : </h2></td>
	<td>${searchFare.source} </td>
	</tr>
	<tr><td><h2>Destination : </h2></td>
	<td>${searchFare.destination}</td>
	</tr> --%>
	
	</table>
	
	<%-- <table>
 <c:forEach items="${result}" var="result">
    <tr>
        <td>${result.origin}</td>
        <td>${result.amount}</td>
    </tr>
 </c:forEach>
</table> --%>


</div>
</body>

<script type="text/javascript">
$.each(jsonobj, function(){
    //Bind your table here.
});

</script>
</html>