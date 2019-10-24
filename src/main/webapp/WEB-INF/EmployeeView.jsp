<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<c:out value="${user.name}"/>
<h1></h1>
<table>
    <thead>
        <tr>
            <th>Day</th>
            <th>Rating</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${user.availablities}" var="a">
                	<form:form action="/edit/${a.id}" method="post" modelAttribute="availability">
                	<h1><c:out value="${a.day}"/></h1>
	<input type="hidden" name="_method" value="put">
	<div class="form-group">
    <p>
        <form:label path="rating">Rating</form:label> 
        <form:errors path="rating"/>
        <form:input path="rating" value="${a.rating}"/>
    </p>
    </div>
 
    <%-- <form:hidden path="planner" value="${user.id}"/> --%>
    <input type="submit" class="btn btn-primary" value="Edit"/>
</form:form>
        </c:forEach>
        

        
    </tbody>
</table>

</body>
</html>