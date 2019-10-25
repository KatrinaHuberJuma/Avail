<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h1>welcome Back</h1>
	<div class="container">
		<div class="row">
				
		<h1>heres your schedule</h1>
		
		
		
		
<h1>All days</h1>
<table>
    <thead>
        <tr>
            <th>Day</th>
            <th>Rating</th>
            <th>User</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${days}" var="d">
        <tr>
            <td><c:out value="${d[0]}"/></td>
            <td><c:out value="${d[1]}"/></td>
            <td><c:out value="${d[2]}"/></td>
            <%-- <td><a href='/Availability/<c:out value="${book.id}"/>'>See this book</a></td> --%>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/first">home</a>
		
		
		
	</div>
	</div>
</body>
</html>